<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="../common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <script type="text/javascript" src="<c:url value="/"/>js/page/template/linetemplate.js?v=1"></script>
   <script type="text/javascript" src="<c:url value="/"/>js/page/template/echartscommon.js"></script>
</head>
<body>

<form id="form1" name="form1" method="post">
    <div  id="aaa" style="width:100%;margin-top:0px;padding-top:0px;margin-top:-21px;">

        <div class="easyui_AllNorth" data-options="region:'north',split:true" title="查询条件">

            <div class="div1">
                <jsp:include page="../timer/singleTime.jsp"/>
            </div>
        </div>

        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <div data-options="region:'south',split:true" style="height:450px;">

            <div id="main" style="height:100%;width: 100%;" class="clear">

            </div>

            <div>
                <input type="hidden" name="modl" id="modl" value="${modl}"/>
            </div>
            </div>
        </div>

</form>

</body>


</html>
