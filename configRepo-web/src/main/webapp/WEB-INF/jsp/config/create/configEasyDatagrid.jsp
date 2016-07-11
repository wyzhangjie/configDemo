<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="../../common/easyuiconfigtaglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/page/config/create/configEasyDatagrid.css?v=6"/>
    <script type="text/javascript" src="<%=basePath%>js/page/config/otherOption.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>js/page/config/create/configEasyDatagrid.js"></script>
</head>

<body>
<div style="margin:20px 0 10px 0;"></div>
<div id="titleecharts">EasyuiDatagrid表格配置区域</div>
<form id="form2" action="<%=basePath%>config/easydatagrid" class="easyui-form" method="post">
<div id="cdpz">
        <span>  母菜单名称</span>
            <span id="pmenuName">
             <select name="pmenuName" id="pmenuName0" data-options="required:true">

             </select>

         </span>
        <span>  新增菜单名称</span> <span id="menuName">

    <input class="easyui-textbox" type="text" name="menuName"
                                                          id="menuName0" data-options="required:true"
                                                          validType="checkMenuName"></span>
    <input type="hidden" name="multime" id="multime" value="0"/>

        <span>图例类型（kind）</span>
  <span id="kind">

  <select name="kind">
      <option value="easyuigrid">Datagrid</option>
  </select>
  </span>
    <div id="col11">
        <span>宽度</span>
        <span>
             <input class="easyui-textbox" type="text" name="width"
                    id="width" value="auto" ></span>
        </span>

        <span>高度</span>
        <span>
              <input class="easyui-textbox" type="text" name="height"
                     id="height" value="auto" ></span>
        </span>

        <span>标题</span>
        <span>
              <input class="easyui-textbox" type="text" name="title"
                     id="title" ></span>
        </span>

    </div>
    <div id="col1">
        <span>列宽自适应</span>
        <span>
             <select name="fitColumns">
                 <option value="true">是</option>
                 <option value="false">否</option>
             </select>
        </span>

        <span>可拖动边</span>
        <span>
             <select name="resizeHandle">

                 <option value="left">左边</option>
                 <option value="right">右边</option>
                 <option value="both">双边</option>
             </select>
        </span>

        <span>自适应行高</span>
        <span>
             <select name="autoRowHeight">
                 <option value="true">是</option>
                 <option value="false">否</option>
             </select>
        </span>

    </div>
    <div id="col2">
        <span>是否带条纹</span>
        <span>
             <select name="stripe">
                 <option value="true">是</option>
                 <option value="false">否</option>
             </select>
        </span>
        <span>提交方法</span>
        <span>
             <select name="method">
                 <option value="post">POST</option>
                 <option value="get">GET</option>
             </select>
        </span>
        <span>是否换行</span>
        <span>
             <select name="nowrap">
                 <option value="true">TRUE</option>
                 <option value="false">FALSE</option>
             </select>
        </span>
    </div>
    <div id="col3">
        <span>id字段名称</span>
        <span>
            <input class="easyui-textbox" type="text" name="idField"
                   id="idField" ></span>
        <span>提交链接</span>
        <span>
             <input class="easyui-textbox" type="text" name="url"
                    id="url" ></span>
        <span>后台提交时的提示语</span>
        <span>
             <input class="easyui-textbox" type="text" name="loadMsg"
                    id="loadMsg" >
        </span>
    </div>
    <div id="col4">
        <span>是否显示分页栏</span>
        <span>
           <select name="pagination">
               <option value="true" selected="selected">TRUE</option>
               <option value="false">FALSE</option>
           </select>
            </span>
        <span>是否显示行号</span>
        <span>
             <select name="rownumbers">
                 <option value="true" selected="selected">TRUE</option>
                 <option value="false">FALSE</option>
             </select>
            </span>
        <span>是否行单选</span>
        <span>
               <select name="singleSelect">
                   <option value="true" selected="selected">TRUE</option>
                   <option value="false">FALSE</option>
               </select>
        </span>
    </div>


    <div id="col5">
        <span>是否ctr控制多选</span>
        <span>
           <select name="ctrlSelect">
               <option value="true" selected="selected">TRUE</option>
               <option value="false">FALSE</option>
           </select>
            </span>
        <span>点击行选中checkbox</span>
        <span>
             <select name="selectOnCheck" >
                 <option value="true" selected="selected">TRUE</option>
                 <option value="false">FALSE</option>
             </select>
            </span>
        <span>页信息显示位置</span>
        <span>
               <select name="pagePosition">
                   <option value="top">top</option>
                   <option value="bottom" selected="selected">bottom</option>
                   <option value="bottom">both</option>
               </select>
        </span>
    </div>


    <div id="col6">
        <span>页大小</span>
        <span>
           <input class="easyui-textbox" type="text" name="pageSize"
                  id="pageSize" value="8" >
            </span>
        <span>页列表信息</span>
        <span>
              <input class="easyui-textbox" type="text" name="pageList"
                     id="pageList" value="3,10,30">
        </span>
      <%--  Defines which column can be sorted.--%>
        <span>可排序列</span>
        <span>
             <input class="easyui-textbox" type="text" name="sortName"
                    id="sortName" >
        </span>
    </div>

    <div id="col7">
        <span>排序方式</span>
        <span>
         <select name="sortOrder">
             <option value="desc" selected="selected">降序</option>
             <option value="asc">升序</option>
         </select>
            </span>
        <span>是否支持多列排序</span>
        <span>
              <select name="multiSort">
                  <option value="true" selected="selected">支持</option>
                  <option value="false">不支持</option>
              </select>
        </span>
        <span>服务端排序</span>
        <span>
            <select name="remoteSort">
                <option value="true" selected="selected">支持</option>
                <option value="false">不支持</option>
            </select>
        </span>
    </div>
    <div id="col8">
        <span></span>
        <span>预显示字段及中文名</span>
       <span>
            <textarea rows="500" cols="30"  id="param" name="param"  contenteditable="true" wrap="virtual ">  </textarea>

       </span>

    </div>
    <div id="col9">
        <span>查询sql</span>
        <span>
           <textarea rows="500" cols="30" id="sql" name="sql" contenteditable="true" wrap="virtual">
            </textarea>
        </span>
    </div>
    <div>
        <input type="submit" id="btn" style="margin-left:340px;" value="提交"/>
    </div>
 </div>



</form>


</body>
</html>