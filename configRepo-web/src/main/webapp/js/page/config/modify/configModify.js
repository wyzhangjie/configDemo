var t=2;//设定跳转的时间
function refer(url){
    if(t==0){
        location=url; //#设定跳转的链接地址
    }
    document.getElementById('show').innerHTML=""+t+"秒后跳转到配置页面"; // 显示倒计时
    t--; // 计数器递减

}
$().ready(function(){

    $.ajax({
        async : false,
        cache:false,
        type: 'POST',

        dataType : "json",
        url: getlocal()+"/config/findNoFirestMenu",//请求的action路径
        error: function () {//请求失败处理函数
            alert('请求失败');
        },
        success:function(data){ //请求成功后处理函数。
            $("#modify_pmenuName0").append("<option ></option>");
            for(var i=0;i<data.length;i++){

                $("#pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");

                $("#pmenuName1").append("<option value="+data[i].name+">"+data[i].name+"</option>");
                $("#mix1_pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");
                $("#modify_pmenuName0").append("<option value="+data[i].id+">"+data[i].name+"</option>");


            }
        }
    });


    //提交表单
    $("#modify_btn").click(function(){
        var modify_menu = $("#modify_menuName0").val();
        if(modify_menu==null){
            alert("需要配置的菜单名称不能为空");
        }else{
            var pmenuId=$("#modify_pmenuName0").val();
            var menuId=$("#modify_menuName0").val();
            $("#menuId").val(menuId);
            var option={
                /* 	tblx:tblx, */
                pmenuId:pmenuId,
                menuId:menuId
            }
            $.ajax({
                async : false,
                cache:false,
                type: 'POST',
                data:option,
                dataType : "json",
                url: "${basePath}/config/modify",//请求的action路径
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.responseText);
                },
                success:function(data) { //请求成功后处理函数。
                    if (data.kind == null) {
                        alert("没有可配置报表信息");
                        return;
                    }
                    var k =data.kind;
                    /* alert(data.kind);*/
                    var pmenuId=$("#modify_pmenuName0").val();
                    var menuId=$("#modify_menuName0").val();
                    $("#menuId").val(menuId);
                    var option={
                        /* 	tblx:tblx, */
                        pmenuId:pmenuId,
                        menuId:menuId
                    }
                    var send = null;
                    var multime=data.multime;
                    if(multime!="1"){
                        if(data.kind=='line'||data.kind=='bar' ||data.kind=='pie'||data.kind=='area'||data.kind=='hline'||data.kind=='thermometer'||data.kind=='ldatazoom'||data.kind=='stackbar'){
                            data = JSON.stringify(data);
                            $("#data_all").val(data);
                            var c = "<iframe frameborder='0'  src='echartsModify.jsp' class='mask' style='width:"+($(window).width())+"px;height:"+($(window).height())+"px'  ></iframe>";
                            $('body').append(c);

                        }
                        if(data.kind == '图表类型'){
                            data = JSON.stringify(data);
                            $("#data_all").val(data);
                            var c = "<iframe frameborder='0'  src='jqgridModify.jsp' class='mask' style='width:"+($(window).width())+"px;height:"+($(window).height())+"px'  ></iframe>";
                            $('body').append(c);
                        }else{

                            var flag =false;
                            var yline = k.split(",");
                            for(var i=0;i<yline.length;i++){
                                if(yline[i]=="ylines"){
                                    flag=true;
                                    break;
                                }
                            }
                            if(flag){
                                data = JSON.stringify(data);
                                $("#data_all").val(data);
                                var c = "<iframe frameborder='0'  src='ylineModify.jsp' class='mask' style='width:"+($(window).width())+"px;height:"+($(window).height())+"px'  ></iframe>";
                                $('body').append(c);
                            }

                        }
                    }else{
                        if(data.kind=='line'||data.kind=='bar' ||data.kind=='pie'||data.kind=='area'||data.kind=='hline'||data.kind=='thermometer'||data.kind=='ldatazoom'||data.kind=='stackbar'){
                            data = JSON.stringify(data);
                            $("#data_all").val(data);
                            var c = "<iframe frameborder='0'  src='modifyEchartsDate.jsp' class='mask' style='width:"+($(window).width())+"px;height:"+($(window).height())+"px'  ></iframe>";
                            $('body').append(c);

                        }
                        if(data.kind == '图表类型'){
                            data = JSON.stringify(data);
                            $("#data_all").val(data);
                            var c = "<iframe frameborder='0'  src='modifyJqgridDate.jsp' class='mask' style='width:"+($(window).width())+"px;height:"+($(window).height())+"px'  ></iframe>";
                            $('body').append(c);
                        }else{

                            var flag =false;
                            var yline = k.split(",");
                            for(var i=0;i<yline.length;i++){
                                if(yline[i]=="ylines"){
                                    flag=true;
                                    break;
                                }
                            }
                            if(flag){
                                data = JSON.stringify(data);
                                $("#data_all").val(data);
                                var c = "<iframe frameborder='0'  src='modifyMixDate.jsp' class='mask' style='width:"+($(window).width())+"px;height:"+($(window).height())+"px'  ></iframe>";
                                $('body').append(c);
                            }

                        }
                    }
                }
            });
        }
    });

    $("#modify_pmenuName0").change(function(){

        var pmenuId = $("#modify_pmenuName0").val();
        /* alert(pmenuName); */
        /*alert(pmenuId);*/
        var param ={
            pmenuId : pmenuId
        };
        $.ajax({
            url:getlocal()+'/config/findmenuchild',

            data:param,

            dataType: 'json',

            type:"POST",

            cache:false,

            success:function(data){

                $("#modify_menuName0").empty();
                for(var i=0;i<data.length;i++){

                    $("#modify_menuName0").append("<option value="+data[i].id+">"+data[i].name+"</option>");
                }


            },
            error: function(data) {
                alert("error:"+data.responseText);
            }
        });
    });

    /*$("select[name=pmenuName1]").attr("disabled",true); */
});