<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="WEB-INF/jsp/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>demo平台</title>
    <link rel="stylesheet" type="text/css" href="css/frame/default.css"/>
    <link rel="stylesheet" type="text/css" href="css/frame/frame.css"/>
    <script type="text/javascript" src="js/frame/timer.js"></script>
    <script type="text/javascript" src="js/frame/frame.js"></script>
</head>
<body class="easyui-layout" style="overflow-y: hidden">
    <div class="north" region="north" border="false">
        <div class="northDiv1">&nbsp;<img src="images/resources/blocks.gif" align="absmiddle"/> demo平台
        </div>
        <div class="northDiv2">
            <div class="headLeft" id="systime"></div>
            <div class="headRight">欢迎你，<span id="userNameShow"></span>&nbsp;<a href="#" id="loginOut">安全退出</a></div>
        </div>
    </div>
    <div class="west" region="west"  title="菜单" split="true">
        <ul id="tt" class="easyui-tree">
        </ul>
    </div>
    <div class="center" region="center">
        <div id="tabs" class="easyui-tabs" fit="true" border="false">
        </div>
    </div>
    <div class="south" region="south" split="true">
        <div class="footer">2016&copy;Copy rights reserve</div>
    </div>
    <div id="formLogin" method="post" style="width:300px;height:300px;" title="用户登录">
        <table width="100%" style="line-height:50px;border:red 1px;">
            <tr align="center">
                <td class="text">用户名：</td>
                <td align="left"><input id="username" type="text" class="easyui-validatebox" required="true" /></td>
            </tr>
            <tr align="center">
                <td class="text">密码：</td>
                <td align="left"><input id="password" type="password" class="easyui-validatebox" required="true"/></td>
            </tr>
            <tr align="center">
                <td class="text">验证码：</td>
                <td align="left"><input type="text" name="validateCode" id="validateCode" class="validateCodeInput" required="true"/>
            </tr>
            <tr align="center">
              <td align="center"  onclick="changeImg();" >
                  点击刷新验证码

              </td>
                <td align="left">
                    <img id="img1" src="<%=basePath%>validateCode/image"  onclick="this.src='<%=basePath%>validateCode/image?d='+Math.random()"/>

                </td>
            </tr>
        </table>
    </div>
</body>
</html>
