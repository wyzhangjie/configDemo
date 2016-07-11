$(function() {
    displayTime();
});
function displayTime() {
    var today = new Date();
    var years = today.getFullYear();
    var months = today.getMonth() + 1;
    var day = today.getDay();
    var weekday = formatWeekday(day);
    var dateDay = today.getDate();
    var hours = today.getHours();
    var minutes = today.getMinutes();
    var seconds = today.getSeconds();
    minutes = fixTime(minutes);
    seconds = fixTime(seconds);
    var t = years + "年" + months + "月" + dateDay + "日 " + weekday + " " + hours + ":" + minutes + ":" + seconds;
    $("#systime").html(t);
    setTimeout('displayTime();', 500);
}
function fixTime(t) {
    if (t < 10) {
        t = "0" + t;
    }
    return t;
}
function formatWeekday(w) {
    var r;
    switch (w) {
        case 0:
            r = "星期日";
            break;
        case 1:
            r = "星期一";
            break;
        case 2:
            r = "星期二";
            break;
        case 3:
            r = "星期三";
            break;
        case 4:
            r = "星期四";
            break;
        case 5:
            r = "星期五";
            break;
        case 6:
            r = "星期六";
            break;
        default:
            r = "出错了";
            break;
    }
    return r;
}