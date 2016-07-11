/**
 * Created by user on 2016/5/16 0016.
 */

$(function(){
    var kind = $("#kind").val();
    getTime(kind);
});
function getTime(kind,timer,starttime,endtime){
    if(kind=="日报"){
        $("#starttime").click(function(){
            WdatePicker({skin:'whyGreen',minDate:'1000-01-01',maxDate:'9999-12-31'});
        });
        $("#starttime").focus(function(){
            "WdatePicker({lang:'zh-cn'})";
        });
        $("#endtime").click(function(){
            WdatePicker({skin:'whyGreen',minDate:'1000-01-01',maxDate:'9999-12-31'});
        });
        $("#endtime").focus(function(){
            "WdatePicker({lang:'zh-cn'})";
        });

    }
    if(kind=="月报"){
        $("#starttime").click(function(){
            WdatePicker({dateFmt:'yyyy年MM月'})
        });
        $("#endtime").click(function(){
            WdatePicker({dateFmt:'yyyy年MM月'})
        });
    }
    if(kind=="年报"){
        $("#starttime").click(function(){
            WdatePicker({dateFmt:'yyyy年'});
        });
        $("#endtime").click(function(){
            WdatePicker({dateFmt:'yyyy年'});
        });
    }
    if(kind=="周报"){
        $("#starttime").click(function(){
            WdatePicker({isShowWeek:true,onpicked:function funccc(){
                $dp.$('starttime').value=$dp.cal.getP('y')+'年，第'+$dp.cal.getP('W','WW')+'周'
            },errDealMode:-1,skin:'whyGreen',weekMethod:'MSExcel'})
        });

        $("#endtime").click(function(){
            WdatePicker({isShowWeek:true,onpicked:function funccc(){
                $dp.$('endtime').value=$dp.cal.getP('y')+'年，第'+$dp.cal.getP('W','WW')+'周'
            },errDealMode:-1,skin:'whyGreen',weekMethod:'MSExcel'})
        });
    }
    if(kind=="季报"){
        $("#starttime").click(function(){
            WdatePicker({dateFmt:'yyyy年M季度', isQuarter:true, isShowOK:false,disabledDates:['....-0[5-9]-..','....-1[0-2]-..'], startDate:'%y-01-01' ,errDealMode:2});
        });
        $("#endtime").click(function(){
            WdatePicker({dateFmt:'yyyy年M季度', isQuarter:true, isShowOK:false,disabledDates:['....-0[5-9]-..','....-1[0-2]-..'], startDate:'%y-01-01' ,errDealMode:2});
        });
    };
    $("#starttime").val(starttime);
    $("#endtime").val(endtime);
}