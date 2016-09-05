
$().ready(function() {
    var param =document.getElementById("param");
    var sql =document.getElementById("sql");


    //2
    $("#btn").click(function(){
        $("#form2").form({
            url: getlocal()+'/config/easydatagrid',
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            onSubmit: function () {
                //表单验证
                return $("#form2").form('validate');
            },
            error:function(data){
                alert(data);
            },

            success: function (data) {
                alert(data);

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
                    url:getlocal()+"/config/checkMenuName",
                    data:param,
                    dataType: '',
                    type:"POST",
                    cache:false,
                    success:function(message){
                        console.log("message"+message);
                        $("#message").val(message);
                        t=message;
                    }
                });

                t=Number($("#message").val());

                t=Boolean(t);
             //   console.log(t);
                return 1;
            },
            message : '菜单名称已有，生成会覆盖原数据'
        },
        checkMenuName1:{
        }

    });
});