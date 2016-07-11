    function close(){
        $(".other_5_jq").hide();
        $(".other_4_jq").hide();
        $(".other_3_jq").hide();
        $(".other_2_jq").hide();
        $(".other_1_jq").hide();
        $("#col1_show").hide();
        $("#col2_show").hide();
        $("#col3_show").hide();
    }
$("#iscolor1").change(function(){
    if($("#iscolor1").val()=="是"){
        $("#col1_show").show();
        /*  getColor();*/
    }else{
        $("#col1_show").hide();
    }


});
$("#iscolor2").click(function(){
    if($("#iscolor2").val()=="是"){
        $("#col2_show").show();
        /*getColor();*/
    }else{
        $("#col2_show").hide();
    }
});
$("#iscolor3").click(function(){
    if($("#iscolor3").val()=="是"){
        $("#col3_show").show();
        /* getColor();*/
    }else{
        $("#col3_show").hide();
    }
});
/* function getColor(){
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
 }*/
$().ready(function(){
    close();
    var textparam1 =document.getElementById("param1");
    var textparam2 =document.getElementById("param2");
    var textparam3 =document.getElementById("param3");
    var textsql1 = document.getElementById("datasql1");
    var textsql2 = document.getElementById("datasql2");
    var textsql3 = document.getElementById("datasql3");
    var textcomit1=document.getElementById("comitmentarea_ds1");
    var textcomit2=document.getElementById("comitmentarea_ds2");
    var textcomit3=document.getElementById("comitmentarea_ds3");
    autoTextarea(textparam1);
    autoTextarea(textparam2);
    autoTextarea(textparam3);
    autoTextarea(textsql1);
    autoTextarea(textsql2);
    autoTextarea(textsql3);
    autoTextarea(textcomit1);
    autoTextarea(textcomit2);
    autoTextarea(textcomit3);
    $('#picker1_1').farbtastic('#col1_cols_1');
    $('#picker1_2').farbtastic('#col1_cols_2');
    $('#picker1_3').farbtastic('#col1_cols_3');
    $('#picker2_1').farbtastic('#col2_cols_1');
    $('#picker2_2').farbtastic('#col2_cols_2');
    $('#picker2_3').farbtastic('#col2_cols_3');
    $('#picker3_1').farbtastic('#col3_cols_1');
    $('#picker3_2').farbtastic('#col3_cols_2');
    $('#picker3_3').farbtastic('#col3_cols_3');
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
        }else if(num==0){
            $("#data1").hide();
            $("#data2").hide();
            $("#data3").hide();
        }
    });
    $("#btn1").click(function(){
        var val3 =$("#datasql3").val();
        var val2 = $("#datasql2").val();
        var val1 = $("#datasql1").val();

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
        /*if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
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
         }*/
        $("#form2").form({
            url: getlocal()+'demo/config/dqGrid',
            onSubmit: function () {
                //表单验证
                return $("#form2").form('validate');
            },
            success: function (data) {
                if(data.indexOf("失败")!=-1){
                    alert("报表出错"+data);
                }
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
                var pmenuName=$("#pmenuName1").val();
                var param={
                    pmenuName:pmenuName,
                    menuName:value
                };
                var t=false;
                $.ajax({
                    url:'${basePath }/config/checkMenuName',
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


