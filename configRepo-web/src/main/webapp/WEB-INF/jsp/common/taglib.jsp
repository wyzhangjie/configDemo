<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<link rel="stylesheet" type="text/css" media="screen"  href="${basePath}/css/jqgrid/themes/cupertino/jquery-ui.min.css" />

<link rel="stylesheet" type="text/css" href="${basePath}/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${basePath}/js/easyui/my97.css">
<link rel="stylesheet" type="text/css" href="${basePath}/css/frame/common.css">

<link rel="stylesheet" type="text/css" href="${basePath}/js/farbtastic/farbtastic.css"/>

<link rel="stylesheet" type="text/css" href="${basePath}/js/easyui/themes/default/easyui.css">

<link rel="stylesheet" type="text/css" media="screen" href="${basePath}/css/jqgrid/themes/cupertino/jquery-ui.min.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${basePath}/css/jqgrid/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" href="${basePath}/css/page/timer.css"/>
<script type="text/javascript" src="${basePath}/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${basePath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${basePath}/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${basePath}/js/easyui/easyui97.js"></script>
<script type="text/javascript" src="${basePath}/js/easyui/easyuivalidation.js"></script>
<script type="text/javascript" src="${basePath}/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${basePath}/js/common.js"></script>
<script type="text/javascript" src="${basePath}/js/frame/cookie.js"></script>

<script  type="text/javascript" src="${basePath}/js/echarts-2.2.7/build/dist/echarts.js"></script>
<script type="text/javascript" src="${basePath}/js/echarts-2.2.7/build/dist/echarts-all.js"></script>
<script type="text/javascript" src="${basePath}/js/farbtastic/farbtastic.js"></script>
<%--必须用分开的闭合写--%>
<script type="text/javascript" src="${basePath}/js/timer/singleTime.js"></script>
