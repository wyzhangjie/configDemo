    function close(){
        $(".other_5").hide();
        $(".other_4").hide();
        $(".other_3").hide();
        $(".other_3").hide();
        $(".other_2").hide();
        $(".other_1").hide();
    }
$().ready(function(){
    var textsql = document.getElementById("timersql");
    var textcomit=document.getElementById("comitmentarea");
    autoTextarea(textsql);
    autoTextarea(textcomit);
    close();
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
            for(var i=0;i<data.length;i++){
                $("#pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");
            }
        }
    });


    $("#btn").click(function(hidden){
        var val1 = $("#timersql").val();

        /*if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
         alert("请修改第一个图标的时间为：{pt}");
         return false;
         }*/
        if((val1.indexOf("{start}")<=0||val1.indexOf("{end}")<=0)&&(val1.length>9)){
            alert("请修改图标时间为：{start}或者{end}");
            return false;
        }
        $("#form1").form({
            url: getlocal()+"/config/defult",
            onSubmit: function () {
                //表单验证
                return $("#form1").form('validate');
            },
            error:function(data){
                alert(data);
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
                    url:getlocal()+"/config/checkMenuName",
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

