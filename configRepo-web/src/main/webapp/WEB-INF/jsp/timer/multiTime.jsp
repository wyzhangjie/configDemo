<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>时间控件</title>
  <link rel="stylesheet" type="text/css" href="<c:url value="/"/>css/common/timer.css"/>
</head>
<body>
<div>
  <span> 开始日期:<input type="text" id="starttime" name="starttime" /></span>
  <span>结束日期:<input type="text" id="endtime" name="endtime" /></span>
  <input type="hidden" id="kind" name="kind" value="周报"/>
   <span>

	<select style="width:180px"
            name="option1" id="option1" style="display:none" >
    </select>
    </span>
     <span>

	<select style="width:180px"
            name="option2" id="option2" style="display:none">
    </select>
    </span>
    <span>

	<select  style="width:180px"
             name="option3" id="option3" style="display:none">
    </select>
    </span>
     <span>

	<select  style="width:180px"
             name="option4" id="option4" style="display:none">
    </select>
    </span>
     <span>

	<select  style="width:180px"
             name="option5" id="option5" style="display:none" >
    </select>
    </span>
</div>

</body>
</html>

<%--必须用分开的闭合写--%>
<script type="text/javascript" src="<c:url value="/"/>js/timer/multiTime.js"></script>