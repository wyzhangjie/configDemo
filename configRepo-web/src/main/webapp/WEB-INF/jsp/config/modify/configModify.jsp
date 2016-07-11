<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="../../common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title></title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/page/config/create/configModify.css"/>
    <script type="text/javascript" src="<%=basePath%>js/page/config/modify/configModify.js"></script>

</head>
<body>

<div style="margin:20px 0 10px 0;"></div>
<div class="easyui-tabs" style="width:100%;"  >

    <div title="报表修改区域" style="padding:10px;">

        <form  id="form0" class="easyui-form" method="post" >
            <p>可配置图表修改页面</p>
            <div id="cdpz0">
                <span >  母菜单名称</span>  <span id="pmenuName" >
  <select name="modify_pmenuName0"  id="modify_pmenuName0" data-options="required:true">

  </select>

  </span>
                <span style="margin-left:90px;" >  菜单名称</span>  <span id="modify_menuName">
   <select name ="modify_menuName0" id="modify_menuName0">
       <input  id="data_all" style="display: none;"   />
   </select>
 </span>


            </div>
            <div id="divsql0">

                <input type="submit" id="modify_btn"  value="提交"/>
            </div>

        </form>

    </div>
</div>
<div id="shw">

    <span id="show" style ="font-size:20px;text-align:center;width:400px;margin-left: 400px;"></span>
</div>

</body>

</html>
