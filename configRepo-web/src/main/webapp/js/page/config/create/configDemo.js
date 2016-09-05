function close(){
    $(".other_5").hide();
    $(".other_4").hide();
    $(".other_3").hide();
    $(".other_3").hide();
    $(".other_2").hide();
    $(".other_1").hide();
    $(".other_5_jq").hide();
    $(".other_4_jq").hide();
    $(".other_3_jq").hide();
    $(".other_2_jq").hide();
    $(".other_1_jq").hide();

    $(".other_5_mix1").hide();
    $(".other_4_mix1").hide();
    $(".other_3_mix1").hide();

    $(".other_2_mix1").hide();
    $(".other_1_mix1").hide();
}
$().ready(function(){
    close();
    $.ajax({
        async : false,
        cache:false,
        type: 'POST',

        dataType : "json",
        url: "../config/findNoFirestMenu",//请求的action路径
        error: function () {//请求失败处理函数
            alert('请求失败');
        },
        success:function(data){ //请求成功后处理函数。
            for(var i=0;i<data.length;i++){
                $("#pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");
                $("#pmenuName1").append("<option value="+data[i].name+">"+data[i].name+"</option>");
                $("#mix1_pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");
                $("#pmenuName1_jqtwo").append("<option value="+data[i].name+">"+data[i].name+"</option>");
            }
        }
    });
    $("#tablenum_jqtwo").change(function(){
        var num=$("#tablenum_jqtwo").val();
//#data_1_jqtwo,#data_2_jqtwo,#data_3_jqtwo
        if(num==1){
            $("#data_1_jqtwo").show();
            $("#data_2_jqtwo").hide();
            $("#data_3_jqtwo").hide();
        }else if(num==2){
            $("#data_1_jqtwo").show();
            $("#data_2_jqtwo").show();
            $("#data_3_jqtwo").hide();
        }else if(num ==3){
            $("#data_1_jqtwo").show();
            $("#data_2_jqtwo").show();
            $("#data_3_jqtwo").show();
        }
    });
    $("#tablenum").change(function(){
        var num=$("#tablenum").val();

        if(num==1){
            $("#data1").show();
            $("#data2").hide();
            $("#data3").hide();
        }else if(num==2){
            $("#data2").show();
            $("#data1").show();
            $("#data3").hide();
        }else if(num ==3){
            $("#data3").show();
            $("#data2").show();
            $("#data1").show();
        }
    });
    $("#mix1_btn").click(function(){

        var val1=$("#mix1_timersql1").val();
        var val2=$("#mix1_timersql2").val();

        if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
            alert("请修改第一个图标的时间为：{pt}");
            return false;
        }
        if( val2.length>6 && val2.indexOf("{pt}")<=0 ){
            alert("请修改第二个图标的时间为：{pt}");
            return false;
        }


        $("#form3").form({
            url: '${basePath }/config/mix1',
            onSubmit: function () {
                //表单验证
                return $("#form3").form('validate');
            },
            success: function (data) {
                alert(data);
                if(data.indexOf("error")!=-1){

                    alert("报表生成失败！请检查sql语句是否符合规则、其它项是否按要求填写。请参考：http://my.oschina.net/zjItLife/blog/464577");
                }else{
                    alert("报表配置成功啦！");
                }

            }
        });

    });
    $("#btn").click(function(){

        var val1 = $("#timersql").val();
        if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
            alert("请修改第一个图标的时间为：{pt}");
            return false;
        }
        $("#form1").form({
            url: getlocal()+'/config/defult',
            onSubmit: function () {
                //表单验证
                return $("#form1").form('validate');
            },

            success: function (data) {
                if(data.indexOf("报表配置出错啦！")!=-1){
                    alert("报表生成失败！请检查sql语句是否符合规则、其它项是否按要求填写。请参考：http://my.oschina.net/zjItLife/blog/464577");
                }

            }
        });

    });
    $("#btn1").click(function(){
        var val3 =$("#datasql3").val();
        var val2 = $("#datasql2").val();
        var val1 = $("#datasql1").val();

        if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
            alert("请修改第一个图标的时间为：{pt}");
            return false;
        }
        if( val2.length>6 && val2.indexOf("{pt}")<=0 ){
            alert("请修改第二个图标的时间为：{pt}");
            return false;
        }

        if( val3.length>6 && val3.indexOf("{pt}")<=0 ){
            alert("请修改第三个图标的时间为：{pt}");
            return false;
        }
        $("#form2").form({
            url: '${basePath }/config/dqGrid',
            onSubmit: function () {
                //表单验证
                return $("#form2").form('validate');
            },
            success: function (data) {
                if(data.indexOf("报表配置出错啦！")!=-1){
                    alert("报表生成失败！请检查sql语句是否符合规则、其它项是否按要求填写。请参考：http://my.oschina.net/zjItLife/blog/464577");
                }else{
                    alert("报表配置成功啦！");
                }

            }
        });

    });


    $.extend($.fn.validatebox.defaults.rules, {
        checkMenuName:{

            validator : function(value) {
                var pmenuName=$("#pmenuName0").val();
                var param={
                    pmenuName:pmenuName,
                    menuName:value
                };
                var t=false;
                $.ajax({
                    url:getlocal()+'/config/checkMenuName',

                    data:param,

                    dataType: '',

                    type:"POST",

                    cache:false,

                    success:function(message){
                        $("#message").val(message);

                        t=message;


                    }
                });
                t=Number($("#message").val());
                t=Boolean(t);
                console.log(t);

                return t;
            },
            message : '菜单名称已有，生成会覆盖原数据'
        },
        checkMenuName1:{



        }

    });

});