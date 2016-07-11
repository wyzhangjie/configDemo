


$().ready(function(){



    $.ajax({
        async : false,
        cache:false,
        type: 'POST',
        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
        dataType : "json",
        url: getlocal()+"/demo/config/findNoFirestMenu",//请求的action路径
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
    $("#btn").click(function(hidden){
        var val1 = $("#timersql").val();

        if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
            alert("请修改第一个图标的时间为：{pt}");
            return false;
        }
        $("#form1").form({
            url: getlocal()+'/demo/config/echartsCreate',
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            onSubmit: function () {
                //表单验证
                return $("#form1").form('validate');
            },
            error:function(data){
                alert(data);
            },

            success: function (data) {
                alert(data);

            }
        });

    });

});

