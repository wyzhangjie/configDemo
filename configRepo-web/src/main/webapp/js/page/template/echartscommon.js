/**
 * Created by user on 2016/6/2 0002.
 */
function close(){
    $("#option1").hide();
    $("#option2").hide();
    $("#option3").hide();
    $("#option4").hide();
    $("#option5").hide();
}
$(document).ready(function(){
    close();
    var modl= $("#modl").val();
    alert(modl);
    var username = getCookie("userName");
    //alert(username);
    var param={
        modl:modl
    };
    // alert($("#model").val());
    $.ajax({
        async : false,
        cache:false,
        type: 'POST',
        data:param,
        dataType : "json",
        url: "../config/menu",//请求的action路径
        error:function(XMLHttpRequest, textStatus, errorThrown) {

            alert(errorThrown);
        },
        success:function(template){ //请求成功后处理函数。
            //   $("#kind").val(template.report_kind);

            getEcharts(template);

            //获取查询条件
            getOptions(template.otherOption);

            getTime(template.reportKind,template.timer,template.starttime,template.endtime);




        }
    });


    // todo 收藏夹功能
    /*
     var iscollect = $("#iscollect").val();
     if(iscollect=="是"){
     $("#wysc").css("visibility","hidden");
     $("#hasCollect").css("display","block");
     }else{
     $("#wysc").css("display","block");
     $("#hasCollect").css("visibility","hidden");

     }*/
    //注释操作授权

    //  getCommitmentPrivlige(username);
    $("#sumit").click(function(){
        $("#form1").form('submit',{
            url: '../config/dt',
            onSubmit: function () {
                //表单验证
                return $("#form1").form('validate');
            },
            success: function (template) {
                var template = eval('(' + template + ')');
                getEcharts(template);

            }
        });

    });

});
function getOptions(otherOption){
    var dim ="&";
    if(otherOption==null){
        return;
    }
    var sqls = otherOption.split(dim);
    var len =sqls.length;
    var i =1;
    for(i=1;i<6;i++){
        var url = '../config/getsqlData?sql='+sqls[i-1];
        var o ='#option' + i;
        if(i<=len){
            tt(o,url);
        }else{
            (function(){
                var tmp =o;
                $(tmp).hide();
            })();
        }
    }

}
function tt(o,url){
    var temp = o;//调用时局部变量
    $(temp).show();
    $.getJSON(url, function(json) {

        $(temp).combobox({
            data : json,
            valueField: 'id',
            textField: 'text',
            multiple:true,
            multiline:true,
            height:'45px',
            panelHeight:'auto'
        });
    });
}