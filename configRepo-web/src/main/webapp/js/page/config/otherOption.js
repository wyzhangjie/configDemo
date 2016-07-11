

/**
 * 文本框根据输入内容自适应高度
 * @param                {HTMLElement}        输入框元素
 * @param                {Number}                设置光标与输入框保持的距离(默认0)
 * @param                {Number}                设置最大高度(可选)
 */
var autoTextarea = function (elem, extra, maxHeight) {
    extra = extra || 0;
    var isFirefox = !!document.getBoxObjectFor || 'mozInnerScreenX' in window,
        isOpera = !!window.opera && !!window.opera.toString().indexOf('Opera'),
        addEvent = function (type, callback) {
            elem.addEventListener ?
                elem.addEventListener(type, callback, false) :
                elem.attachEvent('on' + type, callback);
        },
        getStyle = elem.currentStyle ? function (name) {
            var val = elem.currentStyle[name];

            if (name === 'height' && val.search(/px/i) !== 1) {
                var rect = elem.getBoundingClientRect();
                return rect.bottom - rect.top -
                    parseFloat(getStyle('paddingTop')) -
                    parseFloat(getStyle('paddingBottom')) + 'px';
            };

            return val;
        } : function (name) {
            return getComputedStyle(elem, null)[name];
        },
        minHeight = parseFloat(getStyle('height'));

    elem.style.resize = 'none';

    var change = function () {
        var scrollTop, height,
            padding = 0,
            style = elem.style;

        if (elem._length === elem.value.length) return;
        elem._length = elem.value.length;

        if (!isFirefox && !isOpera) {
            padding = parseInt(getStyle('paddingTop')) + parseInt(getStyle('paddingBottom'));
        };
        scrollTop = document.body.scrollTop || document.documentElement.scrollTop;

        elem.style.height = minHeight + 'px';
        if (elem.scrollHeight > minHeight) {
            if (maxHeight && elem.scrollHeight > maxHeight) {
                height = maxHeight - padding;
                style.overflowY = 'auto';
            } else {
                height = elem.scrollHeight - padding;
                style.overflowY = 'hidden';
            };
            style.height = height + extra + 'px';
            scrollTop += parseInt(style.height) - elem.currHeight;
            document.body.scrollTop = scrollTop;
            document.documentElement.scrollTop = scrollTop;
            elem.currHeight = parseInt(style.height);
        };
    };

    addEvent('propertychange', change);
    addEvent('input', change);
    addEvent('focus', change);
    change();
};

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
};

    $().ready(function(){
        close();
        $("#other_num").change(function(){
            var value =$("#other_num").val();

            if(value==0){
                close();
            }
            for(var i=1;i<=value;i++){

                $("#other_"+i).show();
            }
            for(var j=(Number(value)+1);j<6;j++){

                $("#other_"+j).hide();
            }

        });
    });
        var textsql = document.getElementById("timersql");
        var textcomit=document.getElementById("comitmentarea");
        var sql1= document.getElementById("sql1");
        var sql2= document.getElementById("sql2");
        var sql3= document.getElementById("sql3");
        var sql4= document.getElementById("sql4");
        var sql5= document.getElementById("sql5");
     /*   autoTextarea(textsql);
        autoTextarea(textcomit);*/
      /*  autoTextarea(sql1);
        autoTextarea(sql2);
        autoTextarea(sql3);
        autoTextarea(sql4);
        autoTextarea(sql5);*/

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
                url: getlocal()+'demo/config/mix1',
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







    $("#tab_option_col_1").change(function(){
    var colval=$("#tab_option_col_1").val();
    findval(1);
});


    $("#tab_option_col_2").change(function(){
        var colval=$("#tab_option_col_2").val();
        findval(2);
    });

    $("#tab_option_col_3").change(function(){
        var colval=$("#tab_option_col_3").val();
        findval(3);
    });

    $("#tab_option_col_4").change(function(){
        var colval=$("#tab_option_col_4").val();
        findval(4);
    });

    $("#tab_option_col_5").change(function(){
        findval(5);
    });
    function findval(num){
        var tablename=$("#tab_name_"+num).val();
        var colval=$("#tab_option_col_"+num).val();

        var param={
            tablename:tablename,
            colval:colval
        };
        $.ajax({
            async : false,
            cache:false,
            type: 'POST',
            data:param,
            dataType : "json",
            url: getlocal()+"/demo/config/findOptins",//请求的action路径
            error: function () {//请求失败处理函数
                alert('请求失败');
            },
            success:function(data){ //请求成功后处理函数。
                $("#tab_option_"+num+"").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_"+num+"").append("<option value="+data[i].id+"_"+data[i].name+">"+data[i].name+"</option>");


                }
            }
        });
    }
    $("#other_num_jq").change(function(){
        var value =$("#other_num_jq").val();

        if(value==0){
            close();
        }
        for(var i=1;i<=value;i++){

            $("#other_"+i+"_jq").show();
        }
        for(var j=(Number(value)+1);j<6;j++){

            $("#other_"+j+"_jq").hide();
        }

    });
    $("#tab_name_1_jq").change(function(){
        var value=$("#tab_name_1_jq").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_jq(value,1);
        }

    });
    $("#tab_name_2_jq").change(function(){
        var value=$("#tab_name_2_jq").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_jq(value,2);
        }

    });
    $("#tab_name_3_jq").change(function(){
        var value=$("#tab_name_3_jq").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_jq(value,3);
        }

    });
    $("#tab_name_4_jq").change(function(){
        var value=$("#tab_name_4_jq").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_jq(value,4);
        }

    });
    $("#tab_name_5_jq").change(function(){
        var value=$("#tab_name_5_jq").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_jq(value,5);
        }

    });
    function findColums_jq(tablename,num){
        var param={
            tablename:tablename
        }
        $.ajax({
            async : false,
            cache:false,
            type: 'POST',
            data:param,
            dataType : "json",
            url: "/config/findColums",//请求的action路径
            error: function () {//请求失败处理函数
                alert('请求失败');
            },
            success:function(data){ //请求成功后处理函数。
                $("#tab_option_col_"+num+"_jq").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_col_"+num+"_jq").append("<option value="+data[i]+">"+data[i]+"</option>");


                }
            }
        });
    };
    $("#tab_option_col_1_jq").change(function(){
        var colval=$("#tab_option_col_1_jq").val();
        findval_jq(1);
    });


    $("#tab_option_col_2_jq").change(function(){
        var colval=$("#tab_option_col_2_jq").val();
        findval_jq(2);
    });

    $("#tab_option_col_3_jq").change(function(){
        var colval=$("#tab_option_col_3_jq").val();
        findval_jq(3);
    });

    $("#tab_option_col_4_jq").change(function(){
        var colval=$("#tab_option_col_4_jq").val();
        findval_jq(4);
    });

    $("#tab_option_col_5_jq").change(function(){
        findval_jq(5);
    });
    function findval_jq(num){
        var tablename=$("#tab_name_"+num+"_jq").val();
        var colval=$("#tab_option_col_"+num+"_jq").val();

        var param={
            tablename:tablename,
            colval:colval
        };
        $.ajax({
            async : false,
            cache:false,
            type: 'POST',
            data:param,
            dataType : "json",
            url: "/config/findOptins",//请求的action路径
            error: function () {//请求失败处理函数
                alert('请求失败');
            },
            success:function(data){ //请求成功后处理函数。
                $("#tab_option_"+num+"_jq").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_"+num+"_jq").append("<option value="+data[i].id+"_"+data[i].name+">"+data[i].name+"</option>");


                }
            }
        });
    }



    ////////////////mix
    $("#other_num_mix1").change(function(){
        var value =$("#other_num_mix1").val();

        if(value==0){
            close();
        }
        for(var i=1;i<=value;i++){

            $("#other_"+i+"_mix1").show();
        }
        for(var j=(Number(value)+1);j<6;j++){

            $("#other_"+j+"_mix1").hide();
        }

    });


    $("#tab_name_1_mix1").change(function(){
        var value=$("#tab_name_1_mix1").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_mix1(value,1);
        }

    });
    $("#tab_name_2_mix1").change(function(){
        var value=$("#tab_name_2_mix1").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_mix1(value,2);
        }

    });
    $("#tab_name_3_mix1").change(function(){
        var value=$("#tab_name_3_mix1").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_mix1(value,3);
        }

    });
    $("#tab_name_4_mix1").change(function(){
        var value=$("#tab_name_4_mix1").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_mix1(value,4);
        }

    });
    $("#tab_name_5_mix1").change(function(){
        var value=$("#tab_name_5_mix1").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums_mix1(value,5);
        }

    });
    function findColums_mix1(tablename,num){
        var param={
            tablename:tablename
        }
        $.ajax({
            async : false,
            cache:false,
            type: 'POST',
            data:param,
            dataType : "json",
            url: "/config/findColums",//请求的action路径
            error: function () {//请求失败处理函数
                alert('请求失败');
            },
            success:function(data){ //请求成功后处理函数。
                $("#tab_option_col_"+num+"_mix1").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_col_"+num+"_mix1").append("<option value="+data[i]+">"+data[i]+"</option>");


                }
            }
        });
    };
    $("#tab_option_col_1_mix1").change(function(){
        var colval=$("#tab_option_col_1_mix1").val();
        findval_mix1(1);
    });


    $("#tab_option_col_2_mix1").change(function(){
        var colval=$("#tab_option_col_2_mix1").val();
        findval_mix1(2);
    });

    $("#tab_option_col_3_mix1").change(function(){
        var colval=$("#tab_option_col_3_mix1").val();
        findval_mix1(3);
    });

    $("#tab_option_col_4").change(function(){
        var colval=$("#tab_option_col_4_mix1").val();
        findval_mix1(4);
    });

    $("#tab_option_col_5_mix1").change(function(){
        findval_mix1(5);
    });
    function findval_mix1(num){
        var tablename=$("#tab_name_"+num+"_mix1").val();
        var colval=$("#tab_option_col_"+num+"_mix1").val();

        var param={
            tablename:tablename,
            colval:colval
        };
        $.ajax({
            async : false,
            cache:false,
            type: 'POST',
            data:param,
            dataType : "json",
            url: "/config/findOptins",//请求的action路径
            error: function () {//请求失败处理函数
                alert('请求失败');
            },
            success:function(data){ //请求成功后处理函数。
                $("#tab_option_"+num+"_mix1").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_"+num+"_mix1").append("<option value="+data[i].id+"_"+data[i].name+">"+data[i].name+"</option>");


                }
            }
        });
    }





