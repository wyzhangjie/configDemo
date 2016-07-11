function setCookie(n, v) {
    var d = new Date();
    d.setTime(d.getTime() + 30 * 24 * 60 * 60 * 1000);
    document.cookie = n + "=" + escape(v) + ";expires=" + d.toGMTString();
}

function getCookie(n) {
    var a = document.cookie.match(new RegExp("(^| )" + n + "=([^;]*)(;|$)"));
    if (a != null) {
        return unescape(a[2]);
    }
    return null;
}

function delCookie(n) {
    var d = new Date();
    d.setTime(d.getTime() - 1);
    var c = getCookie(n);
    if (c != null) {
        document.cookie = n + "=" + c + ";expires=" + d.toGMTString();
    }
}