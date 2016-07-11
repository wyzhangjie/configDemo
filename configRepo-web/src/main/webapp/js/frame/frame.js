var menus = {
    "children": [
        {"id": "0", "icon": "icon-sys", "text": "用户管理",
            "children": [
                {"id": "00", "text": "用户列表", "icon": "icon-nav", "url": "user/list"}
            ]
        }
    ]
};
var data_info = {
    "dataList": []
};
function changeImg() {
    $("#img1").trigger("onclick");

}
$(function () {
/*    showImg();*/

/*    ilm();*/
    var formLogin = $("#formLogin");
    var username = getCookie("userName");
    if (username == null) {
        formLogin.dialog({
            modal: true,
            closable: false,
            buttons: [{
                text: "登录",
                handler: function () {
                    if (!formLogin.form("validate")) {
                        return;
                    }
                    username = $("#username").val().trim();
                    var password = $("#password").val().trim();
                    var validateCode = $("#validateCode").val();
                    $.getJSON('user/login', {username: username, password: password,validateCode:validateCode}, function(data) {
                        if (success(data)) {

                            setCookie("userName", username);
                           //菜单数据
                            $('#tt').tree({
                                data: data.dataList,
                                onClick: function(node){
                                    if ($('#tabs').tabs('exists', node.text)) {
                                        $('#tabs').tabs('select', node.text);
                                    } else {
                                        $('#tabs').tabs('add', {
                                            title: node.text,
                                            content: cf(node.url),
                                            closable: true
                                        });
                                    }
                                }
                            });
                            $.messager.alert("提示", "登录成功", "info");
                            formLogin.dialog("close");
                            $("#userNameShow").text(username);
                        }else{
                            $.messager.alert("提示","登陆失败",data);
                        }
                    });

                }}]
        });
    }else {

        //加载菜单
        $.getJSON('user/menu', {username: username}, function (data) {
            if (success(data)) {
                //菜单数据
                $('#tt').empty();
                $('#tt').tree({
                    data: data.dataList,
                    onClick: function (node) {
                        if ($('#tabs').tabs('exists', node.text)) {
                            $('#tabs').tabs('select', node.text);
                        } else {
                            $('#tabs').tabs('add', {
                                title: node.text,
                                content: cf(node.url),
                                closable: true
                            });
                        }
                    }
                });
                $("#userNameShow").text(username);
                $.messager.alert("提示", "登录成功", "info");


            } else {
                $.messager.alert("提示", "菜单加载失败", "info");

            }
        });

    }

        ilo();

});

function ilo() {
    $("#loginOut").click(function () {
        $.messager.confirm("系统提示", "您确定要退出本次登录吗?", function (r) {
            if (r) {
                delCookie("userName");
                delCookie("username");
                window.location.reload();
            }
        });
    });
}


function gi(id) {
    var i = 'icon ';
    $.each(menus.children, function (i, n) {
        $.each(n.children, function (j, o) {
            if (o.id == id) {
                i += o.icon;
            }
        });
    });
    return i;
}

function ad(s, u, i) {
    if ($('#tabs').tabs('exists', s)) {
        $('#tabs').tabs('select', s);
    } else {
        $('#tabs').tabs('add', {
            title: s,
            content: cf(u),
            closable: true,
            icon: i
        });
    }
    tc();
}

function cf(u) {
    return '<iframe scrolling="auto" frameborder="0"  src="' + u + '" style="width:100%;height:100%;"></iframe>';
}

function tc() {
    $(".tabs-inner").dblclick(function () {
        var t = $(this).children(".tabs-closable").text();
        $('#tabs').tabs('close', t);
    });
    $(".tabs-inner").bind('contextmenu', function (e) {
        $('#mm').menu('show', {
            left: e.pageX,
            top: e.pageY
        });
        var t = $(this).children(".tabs-closable").text();
        $('#mm').data("currtab", t);
        $('#tabs').tabs('select', t);
        return false;
    });
}