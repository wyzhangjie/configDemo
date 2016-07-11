/**
 * Created by user on 2016/6/3 0003.
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
   // alert(modl);
    var username = getCookie("userName");
    var param={
        modl:modl
    };
    $.ajax({
        async : false,
        cache:false,
        type: 'POST',
        data:param,
        dataType : "json",
        url: "../jqgrid/menu",//请求的action路径
        error:function(XMLHttpRequest, textStatus, errorThrown) {
            alert(errorThrown);
        },
        success:function(jqGridConfigInfo){ //请求成功后处理函数。
           createJqGrid(jqGridConfigInfo);
          //获取查询条件
          getOptions(jqGridConfigInfo.otherOption);
          getTime(jqGridConfigInfo.reportKind,jqGridConfigInfo.timer,jqGridConfigInfo.starttime,jqGridConfigInfo.endtime);




        }
    });
    $("#sumit").click(function(){
        var optionnum = $("#optionnum").val();
        var jqGridPage = {
            modl:$("#modl").val(),
            timer:$("#timer").val(),
            starttime:$("#starttime").val(),
            endtime:$("#endtime").val(),
            option1:"",
            option2:"",
            option3:"",
            option4:"",
            option5:""

        };
        for(var i=1;i<6;i++){
            if(i<=optionnum){
                console.info( $("#option"+i).combobox('getValues'));
                jqGridPage["option"+i] =  $("#option"+i).combobox('getValues').toString();

            }else{
                jqGridPage["option"+i] = $("#option"+i).val();
            }
        }
        ptclick(jqGridPage);
    });

});


function getOptions(otherOption){
    var dim ="&";
    if(otherOption==null){
        return;
    }
    var sqls = otherOption.split(dim);
    var len =sqls.length;
    var i=0;
    for(i=0;i<sqls.length;i++){
      if(sqls[i].indexOf("text")==-1){
          len--;
      }

    }
    $("#optionnum").val(len);
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
function createJqGrid(jqGridConfigInfo) {
    var tablenum = jqGridConfigInfo.jdData.length;
    var gdGriddatas = new Array();
    var titles = new Array();
    for (var i = 0; i <tablenum; i++) {
        if(jqGridConfigInfo.jdData[i]==null)
        return;

        var jdGrid='jqGrid' + i;
        var jqGridPager ='jqGridPager' + i;
        var modl= $("#modl").val();
        var title ;
        if(i==0){
            title = jqGridConfigInfo.title1;
        }
        if(i==1){
            title = jqGridConfigInfo.title2;
        }
        if(i==3){
            title = jqGridConfigInfo.title3;
        }
        creategrid(jqGridConfigInfo.jdData[i],jdGrid,jqGridPager,modl,title,jqGridConfigInfo,i);
    }
}
function createJqGridForPt(jqGridConfigInfo) {
    var tablenum = jqGridConfigInfo.jdData.length;
    var gdGriddatas = new Array();
    var titles = new Array();
    for (var i = 0; i <tablenum; i++) {
        if(jqGridConfigInfo.jdData[i]==null)
            return;

        var jdGrid='jqGrid' + i;
        var jqGridPager ='jqGridPager' + i;
        var modl= $("#modl").val();
        var title ;
        if(i==0){
            title = jqGridConfigInfo.title1;
        }
        if(i==1){
            title = jqGridConfigInfo.title2;
        }
        if(i==3){
            title = jqGridConfigInfo.title3;
        }
        creategridForPt(jqGridConfigInfo.jdData[i],jdGrid,jqGridPager,modl,title,jqGridConfigInfo,i);
    }
}
function creategrid(data,jqGrid,jqGridPager,model,title,jqGridConfigInfo,i){
    var params ={
        modl:model,
        timer:$("#timer").val(),
        starttime:$("#starttime").val(),
        endtime:$("#endtime").val(),
        option1 : jqGridConfigInfo.option1,
        option2 : jqGridConfigInfo.option2,
        option3 : jqGridConfigInfo.option3,
        option4 : jqGridConfigInfo.option4,
        option5 : jqGridConfigInfo.option5,
        i:i
    }

    $("#"+jqGrid).jqGrid({
        type: "GET",
        async: false,
        url: '../jqgrid/jqgriddata',
        postData: params,
        datatype: "json",
        page: 1,
        caption:title+"<span id=\"remark_"+i+"\""+"style=\"float:right;margin-right:50px;\">remark[?]</span>",
        colModel: data.colModels,
        viewrecords: true,
        rowList : [ 3, 6, 10 ],
        rownumbers:true,//
        width:1240,
        pager: "#"+jqGridPager,
        sortname: 'id',
        sortorder: "desc",
        loadComplete: function(){
            if(jqGridConfigInfo.iscolor1.trim()=="是"){
                todu("jqGrid0",jqGridConfigInfo.col1_cols_1,jqGridConfigInfo.col1_cols_2,jqGridConfigInfo.col1_cols_3,jqGridConfigInfo.col1_data_1_from,jqGridConfigInfo.col1_data_1_to,jqGridConfigInfo.col1_data_2_from,jqGridConfigInfo.col1_data_2_to,jqGridConfigInfo.col1_data_3_from,jqGridConfigInfo.col1_data_3_to);
            }
            if(jqGridConfigInfo.iscolor2.trim()=="是"){
                todu("jqGrid1",jqGridConfigInfo.col2_cols_1,jqGridConfigInfo.col2_cols_2,jqGridConfigInfo.col2_cols_3,jqGridConfigInfo.col2_data_1_from,jqGridConfigInfo.col2_data_1_to,jqGridConfigInfo.col2_data_2_from,jqGridConfigInfo.col2_data_2_to,jqGridConfigInfo.col2_data_3_from,jqGridConfigInfo.col2_data_3_to);
            }
            if(jqGridConfigInfo.iscolor3.trim()=="是"){
                todu("jqGrid2",jqGridConfigInfo.col3_cols_1,jqGridConfigInfo.col3_cols_2,jqGridConfigInfo.col3_cols_3,jqGridConfigInfo.col3_data_1_from,jqGridConfigInfo.col3_data_1_to,jqGridConfigInfo.col3_data_2_from,jqGridConfigInfo.col3_data_2_to,jqGridConfigInfo.col3_data_3_from,jqGridConfigInfo.col3_data_3_to);
            }

        }
    }).trigger("reloadGrid");

    jQuery("#"+jqGrid).jqGrid('navGrid','#'+jqGridPager,
        {edit:false,add:false,del:false},
        {},
        {},
        {},
        {multipleSearch:true, multipleGroup:true, showQuery: true}
    );
    $("#"+jqGrid).jqGrid('setGridParam',{
        datatype: "json",
        postData: params,
        page: 1,
        rowNum : 3
    }).trigger("reloadGrid");
    function todu(id,coror1,color2,color3,data1_from,data1_to,data2_from,data2_to,data3_from,data3_to){
        $("#"+id +" tr").each(function () {
            var arrTR =$(this).children();
            var k=0;
            for(k=1;k<arrTR.length;k++){
                var td1 = arrTR.eq(k).text();

                if(td1==''){
                    return;
                }
                if(td1.indexOf(",")){
                    td1= td1.split(",").join('');
                }

                if($.isNumeric(td1)){
                    if($.isNumeric(data1_from)||$.isNumeric(data1_to)){

                        if($.isNumeric(data1_from)&&$.isNumeric(data1_to)){
                            if(Number(td1)>=Number(data1_from)&& Number(td1)<Number(data1_to)){
                                arrTR.eq(k).css("background-color",coror1);
                            }
                        } else if($.isNumeric(data1_from)){
                            if(Number(td1)>=Number(data1_from)){
                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }else if($.isNumeric(data1_to)){
                            if( Number(td1)<Number(data1_to)){
                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }
                    }
                    if($.isNumeric(data2_from)||$.isNumeric(data2_to)) {
                        if($.isNumeric(data2_from)&&$.isNumeric(data2_to)){
                            if(Number(td1)>=Number(data2_from)&& Number(td1)<Number(data2_to)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if($.isNumeric(data2_from)){
                            if(Number(td1)>=Number(data2_from)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if($.isNumeric(data2_to)){
                            if( Number(td1)<Number(data2_to)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }

                    }
                    if($.isNumeric(data3_from)||$.isNumeric(data3_to)) {
                        if($.isNumeric(data3_from)&&$.isNumeric(data3_to)){
                            if(Number(td1)>=Number(data3_from)&& Number(td1)<Number(data3_to)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        } else if($.isNumeric(data3_from)){
                            if(Number(td1)>=Number(data3_from)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }else  if($.isNumeric(data3_to)){
                            if( Number(td1)<Number(data3_to)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }
                    }
                }
                var data1_from_1;
                var data1_to_1;
                var data2_from_2;
                var data2_to_2;
                var data3_from_3;
                var data3_to_3;
                if(td1.indexOf("%")>0){
                    td1=td1.substring(0,td1.length-1);
                    if(data1_from.indexOf("%")>0||data1_to.indexOf("%")>0){
                        if(data1_from.indexOf("%")>0&&data1_to.indexOf("%")>0){
                            data1_from_1 =data1_from.substring(0,data1_from.length-1);
                            data1_to_1 =data1_to.substring(0,data1_to.length-1);
                            if(Number(td1)>=Number(data1_from_1)&& Number(td1)<Number(data1_to_1)){

                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }else if(data1_from.indexOf("%")>0){
                            data1_from_1 =data1_from.substring(0,data1_from.length-1);
                            if(Number(td1)>=Number(data1_from_1)){

                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }else  if(data1_to.indexOf("%")>0){
                            data1_to_1 =data1_to.substring(0,data1_to.length-1);
                            if( Number(td1)<Number(data1_to_1)){

                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }
                    }
                    if(data2_from.indexOf("%")>0||data2_to.indexOf("%")>0){
                        if(data2_from.indexOf("%")>0&&data2_to.indexOf("%")>0){
                            data2_from_2 =data2_from.substring(0,data2_from.length-1);
                            data2_to_2 =data2_to.substring(0,data2_to.length-1);
                            if(Number(td1)>=Number(data2_from_2)&& Number(td1)<Number(data2_to_2)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if(data2_from.indexOf("%")>0){
                            data2_from_2 =data2_from.substring(0,data2_from.length-1);

                            if(Number(td1)>=Number(data2_from_2)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if(data2_to.indexOf("%")>0){

                            data2_to_2 =data2_to.substring(0,data2_to.length-1);
                            if(Number(td1)<Number(data2_to_2)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }
                    }

                    if(data3_from.indexOf("%")>0||data3_to.indexOf("%")>0){
                        if(data3_from.indexOf("%")>0&&data3_to.indexOf("%")>0){
                            data3_from_3 =data3_from.substring(0,data3_from.length-1);
                            data3_to_3 =data3_to.substring(0,data3_to.length-1);
                            if(Number(td1)>=Number(data3_from_3)&& Number(td1)<Number(data3_to_3)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }else  if(data3_from.indexOf("%")>0){
                            data3_from_3 =data3_from.substring(0,data3_from.length-1);
                            if(Number(td1)>=Number(data3_from_3)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }else  if(data3_to.indexOf("%")>0){
                            data3_to_3 =data3_to.substring(0,data3_to.length-1);
                            if(Number(td1)<Number(data3_to_3)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }

                    }

                }

            }
        });

    }
}

function creategridForPt(data,jqGrid,jqGridPager,model,title,jqGridConfigInfo,i){
    var params ={
        modl:model,
        timer:$("#timer").val(),
        starttime:$("#starttime").val(),
        endtime:$("#endtime").val(),
        option1 : jqGridConfigInfo.option1,
        option2 : jqGridConfigInfo.option2,
        option3 : jqGridConfigInfo.option3,
        option4 : jqGridConfigInfo.option4,
        option5 : jqGridConfigInfo.option5,
        i:i
    }


    $("#"+jqGrid).jqGrid('setGridParam',{
        datatype: "json",
        postData: params

    }).trigger("reloadGrid");
    function todu(id,coror1,color2,color3,data1_from,data1_to,data2_from,data2_to,data3_from,data3_to){
        $("#"+id +" tr").each(function () {
            var arrTR =$(this).children();
            var k=0;
            for(k=1;k<arrTR.length;k++){
                var td1 = arrTR.eq(k).text();

                if(td1==''){
                    return;
                }
                if(td1.indexOf(",")){
                    td1= td1.split(",").join('');
                }

                if($.isNumeric(td1)){
                    if($.isNumeric(data1_from)||$.isNumeric(data1_to)){

                        if($.isNumeric(data1_from)&&$.isNumeric(data1_to)){
                            if(Number(td1)>=Number(data1_from)&& Number(td1)<Number(data1_to)){
                                arrTR.eq(k).css("background-color",coror1);
                            }
                        } else if($.isNumeric(data1_from)){
                            if(Number(td1)>=Number(data1_from)){
                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }else if($.isNumeric(data1_to)){
                            if( Number(td1)<Number(data1_to)){
                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }
                    }
                    if($.isNumeric(data2_from)||$.isNumeric(data2_to)) {
                        if($.isNumeric(data2_from)&&$.isNumeric(data2_to)){
                            if(Number(td1)>=Number(data2_from)&& Number(td1)<Number(data2_to)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if($.isNumeric(data2_from)){
                            if(Number(td1)>=Number(data2_from)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if($.isNumeric(data2_to)){
                            if( Number(td1)<Number(data2_to)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }

                    }
                    if($.isNumeric(data3_from)||$.isNumeric(data3_to)) {
                        if($.isNumeric(data3_from)&&$.isNumeric(data3_to)){
                            if(Number(td1)>=Number(data3_from)&& Number(td1)<Number(data3_to)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        } else if($.isNumeric(data3_from)){
                            if(Number(td1)>=Number(data3_from)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }else  if($.isNumeric(data3_to)){
                            if( Number(td1)<Number(data3_to)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }
                    }
                }
                var data1_from_1;
                var data1_to_1;
                var data2_from_2;
                var data2_to_2;
                var data3_from_3;
                var data3_to_3;
                if(td1.indexOf("%")>0){
                    td1=td1.substring(0,td1.length-1);
                    if(data1_from.indexOf("%")>0||data1_to.indexOf("%")>0){
                        if(data1_from.indexOf("%")>0&&data1_to.indexOf("%")>0){
                            data1_from_1 =data1_from.substring(0,data1_from.length-1);
                            data1_to_1 =data1_to.substring(0,data1_to.length-1);
                            if(Number(td1)>=Number(data1_from_1)&& Number(td1)<Number(data1_to_1)){

                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }else if(data1_from.indexOf("%")>0){
                            data1_from_1 =data1_from.substring(0,data1_from.length-1);
                            if(Number(td1)>=Number(data1_from_1)){

                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }else  if(data1_to.indexOf("%")>0){
                            data1_to_1 =data1_to.substring(0,data1_to.length-1);
                            if( Number(td1)<Number(data1_to_1)){

                                arrTR.eq(k).css("background-color",coror1);
                            }
                        }
                    }
                    if(data2_from.indexOf("%")>0||data2_to.indexOf("%")>0){
                        if(data2_from.indexOf("%")>0&&data2_to.indexOf("%")>0){
                            data2_from_2 =data2_from.substring(0,data2_from.length-1);
                            data2_to_2 =data2_to.substring(0,data2_to.length-1);
                            if(Number(td1)>=Number(data2_from_2)&& Number(td1)<Number(data2_to_2)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if(data2_from.indexOf("%")>0){
                            data2_from_2 =data2_from.substring(0,data2_from.length-1);

                            if(Number(td1)>=Number(data2_from_2)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }else  if(data2_to.indexOf("%")>0){

                            data2_to_2 =data2_to.substring(0,data2_to.length-1);
                            if(Number(td1)<Number(data2_to_2)){
                                arrTR.eq(k).css("background-color",color2);
                            }
                        }
                    }

                    if(data3_from.indexOf("%")>0||data3_to.indexOf("%")>0){
                        if(data3_from.indexOf("%")>0&&data3_to.indexOf("%")>0){
                            data3_from_3 =data3_from.substring(0,data3_from.length-1);
                            data3_to_3 =data3_to.substring(0,data3_to.length-1);
                            if(Number(td1)>=Number(data3_from_3)&& Number(td1)<Number(data3_to_3)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }else  if(data3_from.indexOf("%")>0){
                            data3_from_3 =data3_from.substring(0,data3_from.length-1);
                            if(Number(td1)>=Number(data3_from_3)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }else  if(data3_to.indexOf("%")>0){
                            data3_to_3 =data3_to.substring(0,data3_to.length-1);
                            if(Number(td1)<Number(data3_to_3)){
                                arrTR.eq(k).css("background-color",color3);
                            }
                        }

                    }

                }

            }
        });

    }
}
function ptclick(jqGridPage){

    $.ajax({
        async : false,
        cache:false,
        type: 'POST',
        data:jqGridPage,
        dataType : "json",
        url: "../jqgrid/menu",//请求的action路径
        error:function(XMLHttpRequest, textStatus, errorThrown) {
            alert(errorThrown);
        },
        success:function(jqGridConfigInfo){ //请求成功后处理函数。
            //构造jqgrid
            createJqGrid(jqGridConfigInfo);

        }
    });
}