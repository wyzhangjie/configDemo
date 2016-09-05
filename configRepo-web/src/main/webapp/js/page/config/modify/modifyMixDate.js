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
var mix1_timersql1 = document.getElementById("mix1_timersql1");
var mix1_timersql2 = document.getElementById("mix1_timersql2");
var mix1_comitmentarea = document.getElementById("mix1_comitmentarea");
autoTextarea(mix1_timersql1);
autoTextarea(mix1_timersql2);
autoTextarea(mix1_comitmentarea);
function close(){
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
        url: getlocal()+"/config/findNoFirestMenu",//请求的action路径
        error: function () {//请求失败处理函数
            alert('请求失败');
        },
        success:function(data){ //请求成功后处理函数。

            for(var i=0;i<data.length;i++){
                $("#mix1_pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");


            }
        }
    });



    $("#mix1_btn").click(function(){
        //mix1_menuId
        var val1=$("#mix1_timersql1").val();
        var val2=$("#mix1_timersql2").val();
        if((val1.indexOf("{start}")<=0||val1.indexOf("{end}")<=0)&&(val1.length>9)){
            alert("请修改图标时间为：{start}或者{end}");
            return false;
        }
        if((val2.indexOf("{start}")<=0||val2.indexOf("{end}")<=0)&&(val2.length>9)){
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
         }*/
        var menuId= $('#modify_menuName0',parent.document).find('option:selected').val();
        $("#mix1_menuId").val(menuId);

        $("#form3").form({
            url: getlocal()+'demo/config/mix1Modify',
            onSubmit: function () {
                //表单验证
                return $("#form3").form('validate');
            },
            success: function (data) {

                if(data.indexOf("Server Error")!=-1){
                    alert("系统级别错误，请联系系统管理员");
                    return;
                }
                if(data.indexOf("error")!=-1){
                    alert("报表修改失败！请检查sql语句是否符合规则、其它项是否按要求填写。请参考：http://my.oschina.net/zjItLife/blog/464577");
                    return;
                }else{
                    alert("报表修改成功啦！");
                    return;
                }
            },
            error:function(){

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
//shuju tianchong
    var data = parent.document.getElementById("data_all").value;
    data = JSON.parse(data);
    var menuId= $('#modify_menuName0',parent.document).find('option:selected').val();
    $("#mix1_menuId").val(menuId);
    if(data.otherOption!=undefined&&data.otherOption!="null"&&data.otherOption!=""){
        var options =data.otherOption.split("&");
        $("select#other_num_mix1 option:contains('"+options.length+"')").attr("selected","selected");

        for(var i=0;i<options.length;i++){
            var col =options[i].substring(options[i].indexOf("where")+5,options[i].indexOf("=")).trim();
            var value=options[i].substring(options[i].indexOf("\"")+1,options[i].lastIndexOf("\"")).trim();
            var table=options[i].substring(options[i].indexOf("from")+4,options[i].indexOf("where")).trim();



            findColums_mix1(table,i+1);

            var tablename="#tab_name_"+(i+1)+"_mix1";
            var colname="#tab_option_col_"+(i+1)+"_mix1";

            $(tablename).val(table);
            $(colname).val(col);

            findval_mix1(i+1);
            var value_tc="tab_option_"+(i+1)+"_mix1";
            var kk = document.getElementById(value_tc).options;
            for (var i=0; i<kk.length; i++) {
                if (kk[i].text==value) {
                    kk[i].selected=true;
                    break;
                }
            }
            $("#other_num_mix1").trigger("change")
        }
    }else{
        $("#other_num_mix1").val(0);
        $("#other_num_mix1").trigger("change")
    }
    //填充数据00
    $("#modiMode3").show("slow");
    $("#modiMode2").hide();
    $("#modiMode1").hide();
    $("#mix1_menuName0").textbox({
        value : data.menuname
    });
    $("#modiMode3 #mix1_report_kind").find("option[value='"+data.reportKind+"']").attr("selected",true);
    //   alert(data.pmenuname);
    $("#modiMode3 #realtime").find("option[value='"+data.realtime+"']").attr("selected",true);
    $("#modiMode3 #timetype").find("option[value='"+data.timetype+"']").attr("selected",true);
    //数据是否包含百分号
    $("#modiMode3 #ispercent").find("option[value='"+data.ispercent+"']").attr("selected",true);
    $("#mix1_pmenuName0").find("option[value$='"+data.pmenuname+"' ]").attr("selected",true);
    // $("#mix1_pmenuName0").find("option[value='"+data.pmenuname+"' ]").attr("selected",true);
    var t=data.kind.split("\,");
    $("#kind").find("option[value = '"+t[0]+ "' ]").attr("selected",true);

    /*时间多维度添加2016-3-3*/
    $("#modiMode3 #multime").find("option[value='"+data.multime+"']").attr("selected",true);
    //最大值最小值
    $("#maxandmin").find("option[value='"+data.maxandmin+"']").attr("selected",true);
    //平均值
    $("#average").find("option[value='"+data.average+"']").attr("selected",true);
    $("#daynum").textbox({
        value:data.daynum
    });

    $("#mix1_legend").textbox({
        value : data.legend
    });
    //$("#stack").val(data.stack);
    var stack=data.stack;

    if(stack==='null'){
        $("#mix1_stack").textbox({
            value : ""
        });
    }
    $("#mix1_stack").textbox({
        value : data.stack
    });
    //$("#catalog").val(data.catalog);

    $("#mix1_catalog").textbox({
        value : data.catalog
    });
    $("#mix1_title").textbox({
        value : data.title
    });
    $("#mix1_subtitle").textbox({
        value : data.subtitle
    });
    //	$("#title").val(data.title);
    //	$("#subtitle").val(data.subtitle);
    //左侧
    var sqls =data.timersql.split("|")
    $("#mix1_timersql1").val(sqls[0]);
    //右侧
    $("#mix1_timersql2").val(sqls[1]);
    //
    //$("#menuName0").val("dafsafdas");
    $("#mix1_comitmentarea").val(data.comitment);
    //左侧坐标类型
    /*  var tt=t[0].split("\,");
     console.log(tt[0]+"--"+tt[1]+"--"+tt[2]);*/
    $("#modiMode3 #kind1").find("option[value = '"+t[1]+ "' ]").attr("selected",true);
    /*  $("#modiMode3 #kind1").empty();
     $("#modiMode3 #kind1").val(tt[1]);*/
    //右侧坐标类型
    $("#modiMode3 #kind2").find("option[value = '"+t[2]+ "' ]").attr("selected",true);
    //左侧坐标名称
    var yAxiss= data.yaxisNames.split("|");

    $("#yAxis0").val(yAxiss[0])
    //右侧坐标名称
    $("#yAxis1").val(yAxiss[1]);
    /**
     * Created by user on 2015/10/27.
     */





});




