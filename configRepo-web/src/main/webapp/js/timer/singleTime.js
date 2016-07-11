/**
 * Created by user on 2016/5/16 0016.
 */


function getTime(kind, timer, starttime, endtime) {
    if (kind == "日报") {
        $("#timer").click(function () {
            WdatePicker({skin: 'whyGreen', minDate: '1000-01-01', maxDate: '9999-12-31'});

        });
        $("#timer").focus(function () {
            "WdatePicker({lang:'zh-cn'})";
        });
    }
    if (kind == "月报") {
        $("#timer").click(function () {
            WdatePicker({dateFmt: 'yyyy年MM月'})
        });
    }
    if (kind == "年报") {
        $("#timer").click(function () {
            WdatePicker({dateFmt: 'yyyy年'});

        });
    }
    if (kind == "周报") {
        $("#timer").click(function () {
            WdatePicker({
                isShowWeek: true, onpicked: function funccc() {
                    $dp.$('timer').value = $dp.cal.getP('y') + '年，第' + $dp.cal.getP('W', 'WW') + '周'
                }, errDealMode: -1, skin: 'whyGreen', weekMethod: 'MSExcel'
            })
        });


    }
    if (kind == "季报") {
        $("#timer").click(function () {
            WdatePicker({
                dateFmt: 'yyyy年M季度',
                isQuarter: true,
                isShowOK: false,
                disabledDates: ['....-0[5-9]-..', '....-1[0-2]-..'],
                startDate: '%y-01-01',
                errDealMode: 2
            });
        });
    }
    ;
    $("#timer").val(timer);

}



$().ready(function(){




})