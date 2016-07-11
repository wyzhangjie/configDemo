$().ready(function(){
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
            url: "/config/findColums",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
                $("#tab_option_col_"+num).empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_col_"+num).append("<option value="+data[i]+">"+data[i]+"</option>");


                }
            }
        });
    };
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
            url: "/config/findOptins",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
                $("#tab_option_"+num+"").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_"+num+"").append("<option value="+data[i].id+"_"+data[i].name+">"+data[i].name+"</option>");


                }
            }
        });
    }

    $.ajax({
        async : false,
        cache:false,
        type: 'POST',
        dataType : "json",
        url: getlocal()+"/demo/config/findNoFirestMenu",//请求的action路径
        error: function () {//����ʧ�ܴ��?��
            alert('����ʧ��');
        },
        success:function(data){ //����ɹ����?��
            /*  $("#modify_pmenuName0").append("<option ></option>");*/

            for(var i=0;i<data.length;i++){

                $("#pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");

            }
        }
    });
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
    $("#tab_name_1").change(function(){
        var value=$("#tab_name_1").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums(value,1);
        }

    });
    $("#tab_name_2").change(function(){
        var value=$("#tab_name_2").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums(value,2);
        }

    });
    $("#tab_name_3").change(function(){
        var value=$("#tab_name_3").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums(value,3);
        }

    });
    $("#tab_name_4").change(function(){
        var value=$("#tab_name_4").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums(value,4);
        }

    });
    $("#tab_name_5").change(function(){
        var value=$("#tab_name_5").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums(value,5);
        }

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
            url: "/config/findOptins",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
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
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_jq(value,1);
        }

    });
    $("#tab_name_2_jq").change(function(){
        var value=$("#tab_name_2_jq").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_jq(value,2);
        }

    });
    $("#tab_name_3_jq").change(function(){
        var value=$("#tab_name_3_jq").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_jq(value,3);
        }

    });
    $("#tab_name_4_jq").change(function(){
        var value=$("#tab_name_4_jq").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_jq(value,4);
        }

    });
    $("#tab_name_5_jq").change(function(){
        var value=$("#tab_name_5_jq").val();
        if(value=="��ѡ��"){
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
            url: "/config/findColums",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
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
            url: "/config/findOptins",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
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
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_mix1(value,1);
        }

    });
    $("#tab_name_2_mix1").change(function(){
        var value=$("#tab_name_2_mix1").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_mix1(value,2);
        }

    });
    $("#tab_name_3_mix1").change(function(){
        var value=$("#tab_name_3_mix1").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_mix1(value,3);
        }

    });
    $("#tab_name_4_mix1").change(function(){
        var value=$("#tab_name_4_mix1").val();
        if(value=="��ѡ��"){
            return ;
        }else{
            findColums_mix1(value,4);
        }

    });
    $("#tab_name_5_mix1").change(function(){
        var value=$("#tab_name_5_mix1").val();
        if(value=="��ѡ��"){
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
            url: "/config/findColums",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
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
            url: "/config/findOptins",//�����action·��
            error: function () {//����ʧ�ܴ��?��
                alert('����ʧ��');
            },
            success:function(data){ //����ɹ����?��
                $("#tab_option_"+num+"_mix1").empty();
                for(var i=0;i<data.length;i++){

                    $("#tab_option_"+num+"_mix1").append("<option value="+data[i].id+"_"+data[i].name+">"+data[i].name+"</option>");


                }
            }
        });
    }


});

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
var timersql = document.getElementById("timersql");
var comitmentarea = document.getElementById("comitmentarea");
autoTextarea(timersql);
autoTextarea(comitmentarea);

function close(){
    $(".other_5").hide();
    $(".other_4").hide();
    $(".other_3").hide();
    $(".other_3").hide();
    $(".other_2").hide();
    $(".other_1").hide();
}
$(document).ready(function(){
    close();
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
            /*  $("#modify_pmenuName0").append("<option ></option>");*/

            for(var i=0;i<data.length;i++){

                $("#pmenuName0").append("<option value="+data[i].name+">"+data[i].name+"</option>");

            }
        }
    });
    //get the data from parent page
    var data = parent.document.getElementById("data_all").value;
    data = JSON.parse(data);
    $("#menuName0").textbox({
        value : data.menuname
    });
    var menuId= $('#modify_menuName0',parent.document).find('option:selected').val();

    $("#menuId").val(menuId);
    $("#modiMode1 #report_kind").find("option[value='"+data.reportKind+"']").attr("selected",true);
    //   alert(data.pmenuname);
    $("#modiMode1 #realtime").find("option[value='"+data.realtime+"']").attr("selected",true);
    $("#modiMode1 #timetype").find("option[value='"+data.timetype+"']").attr("selected",true);

    $("#pmenuName0").find("option[value$='"+data.pmenuname+"' ]").attr("selected",true);

    $("#kind0").find("option[value = '"+data.kind+ "' ]").attr("selected",true);
    //数据是否包含百分号
    $("#ispercent").find("option[value='"+data.ispercent+"']").attr("selected",true);
    //最大值和最小值
    $("#maxandmin").find("option[value='"+data.maxandmin+"']").attr("selected",true);
    //平均值
    $("#average").find("option[value='"+data.average+"']").attr("selected",true);

    //	$("#legend").val(data.legend);
    $("#legend").textbox({
        value : data.legend
    });
    //$("#stack").val(data.stack);
    var stack=data.stack;

    if(stack==='null'){
        $("#stack").textbox({
            value : ""
        });
    }
    $("#stack").textbox({
        value : data.stack
    });
    //$("#catalog").val(data.catalog);

    $("#catalog").textbox({
        value : data.catalog
    });
    $("#title").textbox({
        value : data.title
    });
    $("#subtitle").textbox({
        value : data.subtitle
    });
    //	$("#title").val(data.title);
    //	$("#subtitle").val(data.subtitle);
    $("#timersql").val(data.timersql);
    //$("#menuName0").val("dafsafdas");
    $("#comitmentarea").val(data.comitment);
    if(data.otherOption!=undefined&&data.otherOption!="null"&&data.otherOption!=""){

        var options =data.otherOption.split("&");

        $("select#other_num option:contains('"+options.length+"')").attr("selected","selected");

        for(var i=0;i<options.length;i++){
            var col =options[i].substring(options[i].indexOf("where")+5,options[i].indexOf("=")).trim();
            var value=options[i].substring(options[i].indexOf("\"")+1,options[i].lastIndexOf("\"")).trim();
            var table=options[i].substring(options[i].indexOf("from")+4,options[i].indexOf("where")).trim();

            findColums(table,i+1);
            var tablename="#tab_name_"+(i+1);

            var colname="#tab_option_col_"+(i+1);

            $(tablename).val(table);

            $(colname).val(col);

            findval(i+1);
            var value_tc ="tab_option_"+(i+1);

            var kk = document.getElementById(value_tc).options;

            for (var i=0; i<kk.length; i++) {
                if (kk[i].text==value) {
                    kk[i].selected=true;
                    break;
                }
            }
            $("#other_num").trigger("change");
        }
    }else{
        $("#other_num").val(0);
        $("#other_num").trigger("change")
    }

//method 3
    $("#btn").click(function(){


        var val1 = $("#timersql").val();
        if(val1.length>6 && val1.indexOf("{pt}")<=0 ){
            alert("请修改第一个图标的时间为：{pt}");
            return false;
        }

        $("#form1").form({
            url: getlocal()+'demo/config/hasPageTepMody',
            onSubmit: function () {
                //表单验证
                return $("#form1").form('validate');
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
            }
        });
    });
    //method4
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
                    url:getlocal()+'democonfig/checkMenuName',

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




