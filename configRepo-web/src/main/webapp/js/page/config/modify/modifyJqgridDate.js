    $("#iscolor1").change(function(){
        if($("#iscolor1").val()=="是"){
            $("#col1_show").show();

        }else{
            $("#col1_show").hide();
        }


    });
$("#iscolor2").change(function(){
    if($("#iscolor2").val()=="是"){
        $("#col2_show").show();

    }else{
        $("#col2_show").hide();
    }
});
$("#iscolor3").change(function(){
    if($("#iscolor3").val()=="是"){
        $("#col3_show").show();

    }else{
        $("#col3_show").hide();
    }
});
$.ajax({
    async : false,
    cache:false,
    type: 'POST',

    dataType : "json",
    url: "${basePath}/config/findColors",//请求的action路径
    error: function(data) {
        alert("error:"+data.responseText);
    },
    success:function(data){ //请求成功后处理函数。
        $("#col1_cols_1").empty();
        $("#col1_cols_2").empty();
        $("#col1_cols_3").empty();
        $("#col2_cols_1").empty();
        $("#col2_cols_2").empty();
        $("#col2_cols_3").empty();
        $("#col3_cols_1").empty();
        $("#col3_cols_2").empty();
        $("#col3_cols_3").empty();
        for(var i=0;i<data.length;i++){
            $("#col1_cols_1").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col1_cols_2").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col1_cols_3").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col2_cols_1").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col2_cols_2").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col2_cols_3").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col3_cols_1").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col3_cols_2").append("<option value="+data[i].color+">"+data[i].color+"</option>");
            $("#col3_cols_3").append("<option value="+data[i].color+">"+data[i].color+"</option>");
        }

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
};
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
var timersql1 = document.getElementById("timersql1");
var comitmentarea_ds1 = document.getElementById("comitmentarea_ds1");
var timersql2=document.getElementById("timersql2");
var comitmentarea_ds2=document.getElementById("comitmentarea_ds2");
var timersql3=document.getElementById("timersql3");
var comitmentarea_ds3=document.getElementById("comitmentarea_ds3");

autoTextarea(timersql1);
autoTextarea(comitmentarea_ds1);
autoTextarea(timersql2);
autoTextarea(comitmentarea_ds2);
autoTextarea(timersql3);
autoTextarea(comitmentarea_ds3);
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


}
$().ready(function(){
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
    /* $("#btn").click(function(){
     *//*  var val1 = $("#timersql").val();*//*
     var val1=$("#timersql1").val();
     var val2=$("#timersql2").val();
     var val3=$("#timersql3").val();

     if((val1.indexOf("{start}")<=0||val1.indexOf("{end}")<=0)&&(val1.length>9)){
     alert("请修改图标时间为：{start}或者{end}");
     return false;
     }
     if((val2.indexOf("{start}")<=0||val2.indexOf("{end}")<=0)&&(val2.length>9)){
     alert("请修改图标时间为：{start}或者{end}");
     return false;
     }
     if((val3.indexOf("{start}")<=0||val3.indexOf("{end}")<=0)&&(val3.length>9)){
     alert("请修改图标时间为：{start}或者{end}");
     return false;
     }
     *//*if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
     alert("请修改第一个图标的时间为：{pt}");
     return false;
     }*//*

     $("#form1").form({
     url: '${basePath }/config/hasPageTepMody',
     onSubmit: function () {
     //表单验证
     return $("#form1").form('validate');
     },
     success: function (data) {

     if(data.indexOf("error")!=-1){
     alert("报表修改失败！请检查sql语句是否符合规则、其它项是否按要求填写。请参考：http://my.oschina.net/zjItLife/blog/464577");
     }else{
     alert("报表修改成功啦！");
     }
     }
     });
     });*/

    $("#btn1").click(function(){
        /*$("select[name=pmenuName1]").attr("disabled",false); */
        var val3 =$("#timersql3").val();
        var val2 = $("#timersql2").val();
        var val1 = $("#timersql1").val();

        var pmenuId=$("#modify_pmenuName0").val();
        var menuId= $('#modify_menuName0',parent.document).find('option:selected').val();
        $("#menuId_dq").val(menuId);

        if((val1.indexOf("{start}")<=0||val1.indexOf("{end}")<=0)&&(val1.length>9)){
            alert("请修改图标时间为：{start}或者{end}");
            return false;
        }
        if((val2.indexOf("{start}")<=0||val2.indexOf("{end}")<=0)&&(val2.length>9)){
            alert("请修改图标时间为：{start}或者{end}");
            return false;
        }
        if((val3.indexOf("{start}")<=0||val3.indexOf("{end}")<=0)&&(val3.length>9)){
            alert("请修改图标时间为：{start}或者{end}");
            return false;
        }
        $("#form2").form({
            url: getlocal()+'/config/dqGridmodify',
            onSubmit: function () {
                //表单验证
                return $("#form2").form('validate');
            },

            success: function (data) {
                alert(data);
                return;
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
                    url:getlocal()+'demo/config/checkMenuName',

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



    $("#tab_name_1").change(function(){
        var value=$("#tab_name_1").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums(value,1);
        }

    });
    $("#tab_name_2").change(function(){
        var value=$("#tab_name_2").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums(value,2);
        }

    });
    $("#tab_name_3").change(function(){
        var value=$("#tab_name_3").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums(value,3);
        }

    });
    $("#tab_name_4").change(function(){
        var value=$("#tab_name_4").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums(value,4);
        }

    });
    $("#tab_name_5").change(function(){
        var value=$("#tab_name_5").val();
        if(value=="请选择"){
            return ;
        }else{
            findColums(value,5);
        }

    });
    function findColums(tablename,num){
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
                $("#tab_option_col_"+num).empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_col_"+num).append("<option value="+data[i]+">"+data[i]+"</option>");


                }
            }
        });
    };
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
            url: "/config/findOptins",//请求的action路径
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

});
$().ready(function(){
    close();
    $.ajax({
        async : false,
        cache:false,
        type: 'POST',

        dataType : "json",
        url: getlocal()+"/demo/config/findNoFirestMenu",//请求的action路径
        error: function () {//请求失败处理函数
            alert('请求失败');
        },
        success:function(data){ //请求成功后处理函数。

            for(var i=0;i<data.length;i++){

                $("#pmenuName1").append("<option value="+data[i].name+">"+data[i].name+"</option>");

            }
        }
    });
    var data = parent.document.getElementById("data_all").value;

    data = JSON.parse(data);

    if(data.otherOption!=undefined&&data.otherOption!="null"&&data.otherOption!=""){
        var options =data.otherOption.split("&");
        $("select#other_num_jq option:contains('"+options.length+"')").attr("selected","selected");

        for(var i=0;i<options.length;i++){
            var col =options[i].substring(options[i].indexOf("where")+5,options[i].indexOf("=")).trim();
            var value=options[i].substring(options[i].indexOf("\"")+1,options[i].lastIndexOf("\"")).trim();
            var table=options[i].substring(options[i].indexOf("from")+4,options[i].indexOf("where")).trim();
            findColums_jq(table,i+1);
            var tablename="#tab_name_"+(i+1)+"_jq";
            var colname="#tab_option_col_"+(i+1)+"_jq";

            $(tablename).val(table);
            $(colname).val(col);

            findval_jq(i+1);
            var value_tc="tab_option_"+(i+1)+"_jq";
            var kk = document.getElementById(value_tc).options;
            for (var i=0; i<kk.length; i++) {
                if (kk[i].text==value) {
                    kk[i].selected=true;
                    break;
                }
            }
            $("#other_num_jq").trigger("change");
        }
    }else{
        $("#other_num_jq").val(0);

        $("#other_num_jq").trigger("change");
    }
    var sqls = data.timersql.split("|");
    //    alert(data.pmenuname);
    $("#pmenuName1").find("option[value$='"+data.pmenuname+"' ]").attr("selected",true);
    var count1 =0;
    for(var i = 0;i< sqls.length; i++){

        if( sqls[i].length !=0 && sqls[i].length !=2){
            count1 = count1+1;
        }
    }

    $("#tablenum").val(count1);
    $("#tablenum").find("option[value="+count1+" ]").attr("selected",true);
    $("#tablenum").trigger("change");

    $("#menuName1").textbox({
        value :  $('#modify_menuName0',parent.document).find('option:selected').text()
    });

    for( var i =0;i<sqls.length;i++){
        var datasql = "#timersql"+(i+1);
        $(datasql).val(sqls[i]);

        var title="#title"+(i+1);
        var param= "#param"+(i+1);
        var uniq = "#uniq"+(i+1);
        var paramp = null ;
        var uniqp = null;
        var catalog = $.parseJSON(data.catalog);
        if(i ==0){
            paramp = catalog.param1;
            uniqp = catalog.uniq1;
            $(title).textbox({
                value : catalog.title1
            });
        }
        if(i ==1){
            paramp = catalog.param2;
            uniqp = catalog.uniq2;
            $(title).textbox({
                value : catalog.title2
            });
        }
        if(i ==2){
            paramp = catalog.param3;
            uniqp = catalog.uniq3;
            $(title).textbox({
                value : catalog.title3
            });
        }

        $(param).textbox({
            value : paramp
        });
        $(uniq).textbox({
            value : uniqp
        });

    }
    var comits=new Array();
    comits=data.comitment.split("|");

    $("#comitmentarea_ds1").val(comits[0]);
    $("#comitmentarea_ds2").val(comits[1]);
    $("#comitmentarea_ds3").val(comits[2]);
    $("#modiMode2 #report_kind").find("option[value='"+data.reportKind+"']").attr("selected",true);
    //实时报表
    $("#modiMode2 #realtime").find("option[value='"+data.realtime+"']").attr("selected",true);
    $("#modiMode2 #timetype").find("option[value='"+data.timetype+"']").attr("selected",true);
    /*多维度时间添加2016-3-3*/
    $("#modiMode2 #multime").find("option[value='"+data.multime+"']").attr("selected",true);
    $("#daynum").textbox({
        value : data.daynum
    });
    $("#grid_catalog").val(data.catalog);
    //着色方案实施
    var isColor1 = data.iscolor1;
    var isColor2 =data.iscolor2;
    var isColor3 = data.iscolor3;
    $("#iscolor1").find("option[value='"+isColor1+"']").attr("selected",true);
    $("#iscolor2").find("option[value='"+isColor2+"']").attr("selected",true);
    $("#iscolor3").find("option[value='"+isColor3+"']").attr("selected",true);
    $("#iscolor1").trigger("change");
    $("#iscolor2").trigger("change");
    $("#iscolor3").trigger("change");
    $("#col3_data_1_from").val(data.col3_data_1_from);
    $("#col3_data_1_to").val(data.col3_data_1_to);
    $("#col1_data_1_from").val(data.col1_data_1_from);
    $("#col1_data_1_to").val(data.col1_data_1_to);
    $("#col1_data_2_from").val(data.col1_data_2_from);
    $("#col1_data_2_to").val(data.col1_data_2_to);
    $("#col1_data_3_from").val(data.col1_data_3_from);
    $("#col1_data_3_to").val(data.col1_data_3_to);
    $("#col2_data_1_from").val(data.col2_data_1_from);
    $("#col2_data_1_to").val(data.col2_data_1_to);
    $("#col2_data_2_to").val(data.col2_data_2_to);
    $("#col2_data_2_from").val(data.col2_data_2_from);
    $("#col2_data_3_to").val(data.col2_data_3_to);
    $("#col2_data_3_from").val(data.col2_data_3_from);
    $("#col3_data_1_from").val(data.col3_data_1_from);
    $("#col3_data_1_to").val(data.col3_data_1_to);
    $("#col3_data_2_from").val(data.col3_data_2_from);
    $("#col3_data_2_to").val(data.col3_data_2_to);
    $("#col3_data_3_from").val(data.col3_data_3_from);
    $("#col3_data_3_to").val(data.col3_data_3_to);
    var col1_cols_1 =data.col1_cols_1;
    var col1_cols_2 =data.col1_cols_2;
    var col1_cols_3 =data.col1_cols_3;
    var col2_cols_1 =data.col2_cols_1;
    var col2_cols_2 = data.col2_cols_2;
    var col2_cols_3 =data.col2_cols_3;
    var col3_cols_1 =data.col3_cols_1;
    var col3_cols_2 =data.col3_cols_2;
    var col3_cols_3 =data.col3_cols_3;
    if(isColor1=="是"||isColor2=="是"||isColor3 =="是"){
        $("#col1_cols_1").val(col1_cols_1);
        $("#col1_cols_2").val(col1_cols_2);
        $("#col1_cols_3").val(col1_cols_3);
        $("#col2_cols_1").val(col2_cols_1);
        $("#col2_cols_2").val(col2_cols_2);
        $("#col2_cols_3").val(col2_cols_3)
        $("#col3_cols_1").val(col3_cols_1)
        $("#col3_cols_2").val(col3_cols_2)
        $("#col3_cols_3").val(col3_cols_3);
    }
    /*  $("#col1_cols_2").val(col1_cols_2);
     $("#col1_cols_3").val(col1_cols_3);
     $("#col2_cols_1").val(col2_cols_1);
     $("#col2_cols_2").val(col2_cols_2);
     $("#col2_cols_3").val(col2_cols_3)
     $("#col3_cols_1").val(col3_cols_1)
     $("#col3_cols_2").val(col3_cols_2)
     $("#col3_cols_3").val(col3_cols_2);*/

    $('#picker1_1').farbtastic('#col1_cols_1');
    $('#picker1_2').farbtastic('#col1_cols_2');
    $('#picker1_3').farbtastic('#col1_cols_3');
    $('#picker2_1').farbtastic('#col2_cols_1');
    $('#picker2_2').farbtastic('#col2_cols_2');
    $('#picker2_3').farbtastic('#col2_cols_3');
    $('#picker3_1').farbtastic('#col3_cols_1');
    $('#picker3_2').farbtastic('#col3_cols_2');
    $('#picker3_3').farbtastic('#col3_cols_3');

});




