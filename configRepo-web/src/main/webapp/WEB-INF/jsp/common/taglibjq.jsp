<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<link rel="stylesheet" type="text/css" media="screen"  href="/css/jqgrid/themes/cupertino/jquery-ui.min.css" />

<link rel="stylesheet" type="text/css" href="/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="/js/easyui/my97.css">
<link rel="stylesheet" type="text/css" href="/css/frame/common.css">

<link rel="stylesheet" type="text/css" href="/js/farbtastic/farbtastic.css"/>

<link rel="stylesheet" type="text/css" href="/js/easyui/themes/default/easyui.css">

<link rel="stylesheet" type="text/css" media="screen" href="//css/jqgrid/themes/cupertino/jquery-ui.min.css" />
<link rel="stylesheet" type="text/css" media="screen" href="//css/jqgrid/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" href="<c:url value="/"/>css/page/timer.css"/>

<script type="text/javascript" src="/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<script type="text/javascript" src="/js/frame/cookie.js"></script>

<script type="text/javascript"    src="/js/jquery-ui-1.11.4/jquery-ui.min.js"></script>
<script src="/js/jqgrid/i18n/grid.locale-en.js"  type="text/javascript"></script>


<script type="text/javascript" src="/js/farbtastic/farbtastic.js"></script>
<%--必须用分开的闭合写--%>
<script type="text/javascript" src="<c:url value="/"/>js/timer/singleTime.js"></script>

<script src="/js/jqgrid/jquery.jqGrid.min.js"  type="text/javascript"></script>


<script type="text/javascript" src="/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/easyui/easyui97.js"></script>
<script type="text/javascript" src="/js/easyui/easyuivalidation.js"></script>
<script type="text/javascript" src="/js/easyui/locale/easyui-lang-zh_CN.js"></script>
