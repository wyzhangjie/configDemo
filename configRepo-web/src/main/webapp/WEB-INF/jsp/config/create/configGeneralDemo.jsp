<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="../../common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Echarts2.0报表配置区域</title>
    <link rel="stylesheet" type="text/css"
          href="<%=basePath%>css/page/config/create/configGeneralDemo.css?v=7" charset="utf-8"/>
    <script type="text/javascript" src="<%=basePath%>js/page/config/otherOption.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>js/page/config/create/configGeneralDemo.js?v=4" charset="utf-8"></script>

</head>
<body>
<div style="margin:20px 0 10px 0;"></div>
<div title="普通报表配置区域" style="padding:10px">
    <div id="titleecharts">普通报表配置区域(1)</div>
    <%--<h1>普通报表配置区域</h1>--%>
    <form id="form1" class="easyui-form" method="post">
        <%--<div style="text-align: center;font-size: 25px;margin-left: 400px;">普通报表配置区域</div>--%>
        <div id="cdpz">
            <span>  母菜单名称</span>
            <span id="pmenuName">
  <select name="pmenuName" id="pmenuName0" data-options="required:true">

  </select>

  </span>
            <span>  新增菜单名称</span> <span id="menuName"> <input class="easyui-textbox" type="text" name="menuName"
                                                              id="menuName0" data-options="required:true"
                                                              validType="checkMenuName"></span>
            <span>图例类型（kind）</span>
  <span id="kind">
  <select name="kind">
      <option value="line">线型</option>
      <option value="bar">柱状图</option>
      <option value="pie">饼状图</option>
      <option value="area">面积图</option>
      <option value="hline">旋风条形图</option>
      <option value="thermometer">温度计式图表</option>
      <!-- 带时间轴的线型和柱状图 -->
      <option value="ldatazoom">带时间轴的线型</option>
      <!-- 堆积条形图 -->
      <option value="stackbar">堆积图</option>
  </select>
  </span>

        </div>
        <div id="tud1ata">
            <span> 图例（legend） </span> <span>   <input class="easyui-textbox" type="text" id="legend" name="legend"
                                                      value="" data-options="required:true"> </span>
            <span> 横坐标(catagory) </span> <span>   <input class="easyui-textbox" type="text" id="catalog" name="catalog"
                                                         value="" data-options="required:true"> </span>
            <span> 是否要合并（stack）</span> <span>      <input class="easyui-textbox" type="text" id="stack" name="stack"
                                                          value=""> </span>

        </div>
        <div id="tu2data">
            <span>图形的主标题</span> <span><input class="easyui-textbox" type="text" id="title" name="title" value="null"
                                             data-options="required:true"></span>
            <span>图形的副标题</span> <span> <input class="easyui-textbox" type="text" id="subtitle" name="subtitle"
                                              value="null" data-options="required:true">  </span>
            <span>报表类型</span>
    <span id="report">
    <select id="report_kind" name="reportKind">
                        
        <option value="日报">日报</option>
                        
        <option value="周报">周报</option>
                        
        <option value="月报">月报</option>
                        
        <option value="季报">季报</option>
                        
        <option value="年报">年报</option>
    </select>
     

</span>

        </div>

        <div id="real_time">
            <span>是否实时(realtime)</span>
             <span id="realtime">
                  <select name="realtime">
                      <option value="00"></option>
                      <option value="01">实时</option>
                  </select>
             </span>
            <span>时间类型(timetype)</span>
             <span id="timetype">
                  <select name="timetype">
                      <option value="0">前一个时间段</option>
                      <option value="1">当前时间段</option>
                  </select>
             </span>
            <span>是否包含百分号</span>
             <span id="ispercent">
                  <select name="ispercent">
                      <option value="00">否</option>
                      <option value="11">是</option>
                  </select>
             </span>
        </div>
        <div id="maxmin_average">
            <span>最大值和最小值配置</span>
                <span>
                    <select id="maxandmin" name="maxandmin">
                        <option value="00">否</option>
                        <option value="11">是</option>
                    </select>
                </span>
            <span>平均值配置</span>
                <span>
                    <select id="average" name="average">
                        <option value="00">否</option>
                        <option value="11">是</option>
                    </select>
                </span>
        </div>
        <div id="other">
            <span>多维度项数</span>
               <span>
                   <select id="other_num" name="othernum">
                       <option name="0">0</option>
                       <option name="1">1</option>
                       <option name="2">2</option>
                       <option name="3">3</option>
                       <option name="4">4</option>
                       <option name="5">5</option>
                   </select>

               </span>
        </div>
        <div id="other_1" class="other_1" >
            <span>条件1:sql</span>
               <span>
                   <textarea rows="500" cols="50" id="sql1" name="sql1" contenteditable="true" wrap="virtual ">
                   </textarea>
               </span>
        </div>

        <div id="other_2" class="other_2">
            <span>条件2:sql</span>
             <span>
                  <textarea rows="500" cols="50" id="sql2" name="sql2" contenteditable="true" wrap="virtual ">
                   </textarea>
             </span>
        </div>
        <div id="other_3" class="other_3">
            <span>条件3:sql</span>
              <span>
                   <textarea rows="500" cols="50" id="sql3" name="sql3" contenteditable="true" wrap="virtual ">
                   </textarea>
              </span>
        </div>
        <div id="other_4" class="other_4">
            <span>条件4:sql</span>
             <span>
                    <textarea rows="500" cols="50" id="sql4" name="sql4" contenteditable="true" wrap="virtual ">
                   </textarea>
             </span>
        </div>
        <div id="other_5" class="other_5">
            <span>条件5:sql</span>
             <span>
                      <textarea rows="500" cols="50" id="sql5" name="sql5" contenteditable="true" wrap="virtual ">
                   </textarea>
             </span>
        </div>
        <%--  <div><span><a href="http://my.oschina.net/zjItLife/blog/464577">配置说明书</a></span></div>--%>
        <div id="divsql3">
            <span>请输入sql(带{pt})</span>
            <span>
                   <textarea rows="500" cols="50" id="timersql" name="timersql" contenteditable="true" wrap="virtual ">
                   </textarea>
            </span>
        </div>
        <div id="divsql_comit">
            <span>图表注释信息</span>
                <span>
                     <textarea rows="500" cols="50" id="comitmentarea" name="comitment" contenteditable="true"
                               wrap="virtual ">
                     </textarea>
                </span>
        </div>
        <div id="divsql2">
            <input type="hidden" id="message"/>
            <input type="submit" id="btn" value="提交"/>
        </div>
    </form>
</div>

</body>
</html>
