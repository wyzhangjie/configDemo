<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>jqrid 表格</title>
  <link rel="stylesheet" type="text/css" media="screen"  href="<%=basePath%>css/jqgrid/themes/cupertino/jquery-ui.min.css" />

  <link rel="stylesheet" type="text/css" href="<%=basePath%>css/frame/common.css">

  <link rel="stylesheet" type="text/css" href="<%=basePath%>js/farbtastic/farbtastic.css"/>

  <link rel="stylesheet" type="text/css" href="<c:url value="/"/>css/page/timer.css"/>


  <script type="text/javascript" src="<%=basePath%>js/easyui/jquery.min.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/My97DatePicker/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/common.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/frame/cookie.js"></script>

  <script type="text/javascript"    src="<%=basePath%>js/jquery-ui-1.11.4/jquery-ui.min.js"></script>
  <script src="<%=basePath%>js/jqgrid/i18n/grid.locale-en.js"  type="text/javascript"></script>


  <script type="text/javascript" src="<%=basePath%>js/farbtastic/farbtastic.js"></script>
  <%--必须用分开的闭合写--%>
  <script type="text/javascript" src="<c:url value="/"/>js/timer/singleTime.js"></script>

  <script src="<%=basePath%>js/jqgrid/jquery.jqGrid.min.js"  type="text/javascript"></script>


  <script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/easyui/easyui97.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/easyui/easyuivalidation.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body >
<form id="form1" name="form1" method="post">
  <!-- jqGrid table list4 -->
  <table id="list4"></table>
  <!-- jqGrid 分页 div gridPager -->
  <div id="gridPager"></div>

</form>
</body>
</html>
<script type="text/javascript">
  $(document).ready(function(){
    $("#list4").jqGrid({
      url:'../jqgrid/pt',
      datatype:"json", //数据来源，本地数据
      mtype:"POST",//提交方式
      height:420,//高度，表格高度。可为数值、百分比或'auto'
      //width:1000,//这个宽度不能为百分比
      autowidth:true,//自动宽
      colNames:['添加日期', '手机号码', '银行卡号','备注','操作'],
      colModel:[
        //{name:'id',index:'id', width:'10%', align:'center' },
        {name:'createDate',index:'createDate', width:'20%',align:'center'},
        {name:'phoneNo',index:'phoneNo', width:'15%',align:'center'},
        {name:'cardNo',index:'cardNo', width:'20%', align:"center"},
        {name:'remark',index:'remark', width:'35%', align:"left", sortable:false},
        {name:'del',index:'del', width:'10%',align:"center", sortable:false}
      ],
      rownumbers:true,//添加左侧行号
      //altRows:true,//设置为交替行表格,默认为false
      //sortname:'createDate',
      //sortorder:'asc',
      viewrecords: true,//是否在浏览导航栏显示记录总数
      rowNum:15,//每页显示记录数
      rowList:[15,20,25],//用于改变显示行数的下拉列表框的元素数组。
      jsonReader:{
        id: "blackId",//设置返回参数中，表格ID的名字为blackId
        repeatitems : false
      },
      pager:$('#gridPager')
    });
  });
</script>