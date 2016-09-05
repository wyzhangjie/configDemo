<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf" %>
<es:contentHeader title="用户登录 可配系统开发" index="true"/>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <a class="brand" href="#">&nbsp;&nbsp;可配系统</a>
        <ul class="nav">
            <li class="active"><a href="#">登录</a></li>
            <li><a href="http://my.oschina.net/zjItLife/blog" target="_blank">我的博客</a></li>
            <li><a href="https://github.com/wyzhangjie" target="_blank">github</a></li>
        </ul>
        <a class="brand" style="float: right" href="mailto:dezhanjie@163.com" target="_blank">&nbsp;&nbsp;问题反馈</a>
    </div>
</div>

<div class="container">
    <div class="login">
        <div class="title">用户登录</div>
        <div class="form">

            <div style="margin-right: 30px;">
                <es:showMessage></es:showMessage>
            </div>

            <form id="loginForm" method="post" action="/user/login"  class="form-horizontal">
                <es:BackURL hiddenInput="true"/>
                <div class="control-group">
                    <label for="username">用户名、邮箱或手机号</label>
                    <div class="input-prepend">
                        <span class="add-on icon-user"></span>
                        <input type="text" id="username" name="username" value=""
                               class="input-xlarge validate[required]" placeholder="请输入用户名、邮箱或手机号">
                    </div>
                </div>
                <div class="control-group">
                    <label for="password">密码</label>
                    <div class="input-prepend">
                        <span class="add-on icon-key"></span>
                        <input type="password" id="password" name="password"
                               class="input-xlarge validate[required]" placeholder="请输入密码">
                    </div>
                </div>
                <%-- jcaptchaEbabled 在JCaptchaValidateFilter设置 --%>


                <div class="control-group">
                    <label class="checkbox remember"><input type="checkbox" name="rememberMe" value="true">下次自动登录</label>
                    <input id="submitForm" type="submit" class="btn btn-login pull-left" value="登录">
                </div>

            </form>
        </div>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <p>Code licensed <a href="http://www.apache.org/licenses/LICENSE-2.0" target="_blank">Apache License v2.0</a>, documentation under <a href="http://creativecommons.org/licenses/by/3.0/">CC BY 3.0</a>.</p>
        <ul class="footer-links">
            <li><a href="http://my.oschina.net/zjItLife/blog">博客</a></li>
            <li class="muted">·</li>
            <li><a href="https://github.com/wyzhangjie/demo/issues?state=open" target="_blank">问题反馈</a></li>
            <li class="muted">·</li>
            <li><a href="https://github.com/wyzhangjie" target="_blank">项目主页</a></li>
        </ul>
    </div>
</footer>
<es:contentFooter/>
<script type="text/javascript">
    $(function() {
        $("#username").focus();

        $("#loginForm").validationEngine({scroll:false});
    });
</script>