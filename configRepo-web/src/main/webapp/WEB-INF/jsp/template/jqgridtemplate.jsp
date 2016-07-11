<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ include file="../common/taglibjq.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>jqrid 表格</title>

  <script type="text/javascript" src="<c:url value="/"/>js/page/template/jqgridtemplate.js?v=18"></script>
</head>
<body >
<form id="form1" name="form1" method="post">
  <div  id="aaa" style="width:100%;margin-top:0px;padding-top:0px;margin-top:-21px;">

    <div class="easyui_AllNorth" data-options="region:'north',split:true" title="查询条件">

      <div class="div1">
        <jsp:include page="../timer/singleTime.jsp"/>
      </div>
    </div>

    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div data-options="region:'south',split:true" style="height:450px;">
      <div id="collection">
        <a id="wysc" href="#" style="color:red;text-decoration: none;">我要收藏</a>
        <a id="hasCollect" href="#" style="color:black;text-decoration: none;display: none;">已收藏,点击取消</a>
      </div>

      <div  class="centr">
        <table id="jqGrid0" style='width:1142px;'></table>
        <div id="jqGridPager0" style='width:1142px;'></div>
        <br /> </br>

        <table id="jqGrid1" style='width:1142px;'></table>
        <div id="jqGridPager1"  style='width:1142px;'></div>
        <br /> </br>

        <table id="jqGrid2" style='width:1142px;'></table>
        <div id="jqGridPager2"  style='width:1142px;'></div>


        <%--第一个注释--%>
        <div class="taledown1" id="taledown1" style="display:none;position:absolute;left:400px;top:230px;" onmousedown="mouseDown1(this,event)"
             onmousemove="mouseMove1(event)" onmouseup="mouseUp1(event)">
          <%--//gai--%>
          <div id="divsql1" class="easyui-panel" title="图表注释信息"
               style="padding:5px;background:#fafafa;"          data-options="iconCls:'icon-save',closable:true,
                                 collapsible:true,minimizable:true,maximizable:true,fit:true">
                                <textarea rows="500" cols="50"  style="width:450px;height:30px;"    id="comitmentarea_1" name="comitmentarea_1"  wrap="virtual ">
                              </textarea>
            <div>
              <input type="button" id="submitsave1" style="margin:5px 0px 0px 210px;" value="保存" name="button"   readonly="readonly" />
            </div>
          </div>
        </div>
        <%--第二个注释--%>
        <div class="taledown2" id="taledown2" style="display:none;position:absolute;left:500px;top:300px;" onmousedown="mouseDown2(this,event)"
             onmousemove="mouseMove2(event)" onmouseup="mouseUp2(event)">
          <%--//gai--%>
          <div id="divsql2" class="easyui-panel" title="图表注释信息"
               style="padding:5px;background:#fafafa;"          data-options="iconCls:'icon-save',closable:true,
                                 collapsible:true,minimizable:true,maximizable:true,fit:true">
                        <textarea rows="500" cols="50"  style="width:450px;height:30px;"    id="comitmentarea_2" name="comitmentarea_2"  wrap="virtual ">

                        </textarea>
            <div>
              <input type="button" id="submitsave2" style="margin:5px 0px 0px 210px;" value="保存" name="button"   readonly="readonly" />
            </div>
          </div>
        </div>
        <%--第三个注释--%>
        <div class="taledown3" id="taledown3" style="display:none;position:absolute;left:600px;top:350px;"onmousedown="mouseDown3(this,event)"
             onmousemove="mouseMove3(event)" onmouseup="mouseUp3(event)">
          <%--//gai--%>
          <div id="divsql3" class="easyui-panel" title="图表注释信息"
               style="padding:5px;background:#fafafa;"          data-options="iconCls:'icon-save',closable:true,
                                 collapsible:true,minimizable:true,maximizable:true,fit:true">
                        <textarea rows="500" cols="50"  style="width:450px;height:30px;"    id="comitmentarea_3" name="comitmentarea_3"  wrap="virtual ">

                        </textarea>
            <div>
              <input type="button" id="submitsave3" style="margin:5px 0px 0px 210px;" value="保存" name="button"   readonly="readonly" />
            </div>
          </div>
        </div>
      </div>
    </div>



      <div>
        <input type="hidden" name="modl" id="modl" value="${modl}"/>
          <input type="hidden" name="optionnum" id="optionnum" />
      </div>
    </div>
  </div>

</form>
</body>
</html>
