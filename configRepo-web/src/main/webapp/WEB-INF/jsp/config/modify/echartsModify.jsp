<<%@ page language="java" contentType="text/html; charset=utf-8"
          pageEncoding="utf-8"%>
<%@ include file="../../common/configtaglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/page/config/create/echartsModify.css">
    <script type="text/javascript" src="<%=basePath%>js/page/config/modify/echartsModify.js"></script>
    </head>
<body>
<div id="modiMode1"  >
  <form action="${basePath }/config/hasPageTepMody" id="form1" class="easyui-form" method="post" >
    <div style="text-align: center;font-size: 25px;margin-left: 461px;margin-bottom: 30px;">普通报表修改区域</div>
    <div id="cdpz">
      <label >  母菜单名称</label>  <span id="pmenuName">
    <input type="hidden" id ="menuId" name="menuId" value="">
  <select name="pmenuName0"  id="pmenuName0" data-options="required:true">

  </select>

  </span>
      <label >  新增菜单名称</label>  <span id="menuName"> <input class="easyui-textbox"  type="text" name="menuName0" id="menuName0" data-options="required:true"  ></span>


    </div>

    <div id="tud1ata">
      <label >  图例类型（kind） </label>
  <span id="kind">
  <select name="kind0"  id="kind0" >
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
      <label> 图例（legend） </label>  <span>   <input class="easyui-textbox"  type="text" id="legend" name="legend" data-options="required:true"> </span>

    </div>
    <div id="tu2data">
      <label> 横坐标(catagory) </label>  <span>   <input class="easyui-textbox" type="text" id="catalog" name="catalog"  data-options="required:true"> </span>
      <label> 是否要合并（stack）</label>  <span>  <input class="easyui-textbox"  type="text" id="stack" name="stack" value="" > </span>


      <%--<span><a href="http://my.oschina.net/zjItLife/blog/464577">配置说明书</a></span>--%>
      <!-- <span>文件名称</span>  <span> <input class="easyui-textbox" type="text" id="fileName" name="fileName" data-options="required:true">   </span> -->
      <span style="display:none;" > 文件路径  </span>  <span id="file_path">  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config"> </span>
    </div>
    <div id="tu5data">

      <label>图形的主标题</label>   <span><input  class="easyui-textbox" type="text" id="title" name="title" value="${param.title }" data-options="required:true"></span>
      <label>图形的副标题</label> <span> <input  class="easyui-textbox" type="text" id="subtitle" name="subtitle" value="${param.subtitle }"  >  </span>

    </div>
    <div id="real_time">
      <label>报表类型</label>
    <span id="report">
    <select id="report_kind" name="report_kind"  >
                      <option value="日报">日报</option>
                      <option value="周报">周报</option>
                      <option value="月报">月报</option>
                      <option value="季报">季报</option>
                      <option value="年报">年报</option>
                  </select>
     

</span>
      <label>是否实时(realtime)</label>
             <span id="realtime">
                  <select  name="realtime" >
                    <option value="00" ></option>
                    <option value="01">实时</option>
                  </select>
             </span>

    </div>
    <div id="other">
      <label>时间类型(timetype)</label>
             <span id="timetype">
                  <select  name="timetype" >
                    <option value="0" >前一个时间段</option>
                    <option value="1">当前时间段</option>
                  </select>
             </span>
        <label>是否包含百分号</label>
            <span id="ispercent">
                  <select  name="ispercent" >
                      <option value="00" >否</option>
                      <option value="11">是</option>
                  </select>
             </span>

    </div>
      <div id="maxmin_average">
          <label>最大值和最小值配置</label>
                <span>
                    <select id="maxandmin" name="maxandmin">
                        <option value="00">否</option>
                        <option value="11">是</option>
                    </select>
                </span>
          <label>平均值配置</label>
                <span>
                    <select id="average" name="average">
                        <option value="00">否</option>
                        <option value="11">是</option>
                    </select>
                </span>
      </div>
    <div id="othernum">
        <label>多维度项数</label>
               <span>
                   <select id="other_num" name="other_num">
                       <option name="0">0</option>
                       <option name="1">1</option>
                       <option name="2" >2</option>
                       <option name="3">3</option>
                       <option name="4">4</option>
                       <option name="5">5</option>
                   </select>

               </span>
    </div>
    <div id="other_1" class="other_1">
      <label>表名称</label>
                <span>
                    <select name="tab_name_1" id="tab_name_1">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%--  <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                <span>
                   <select name="tab_option_col_1" id="tab_option_col_1">

                   </select>

               </span>
               <span id="optn1">
                   <select name="tab_option_1" id="tab_option_1" >

                   </select>

               </span>
    </div>

    <div id="other_2" class="other_2">
      <label>表名称</label>
                <span>
                    <select name="tab_name_2" id="tab_name_2">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%--    <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_2" id="tab_option_col_2">

                   </select>

               </span>
               <span id="optn2">
                   <select name="tab_option_2" id="tab_option_2">

                   </select>

               </span>
    </div>
    <div id="other_3" class="other_3">
      <label>表名称</label>
                <span>
                    <select name="tab_name_3" id="tab_name_3">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%--  <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_3" id="tab_option_col_3">

                   </select>

               </span>
               <span id="optn3">
                   <select name="tab_option_3" id="tab_option_3" >

                   </select>

               </span>
    </div>
    <div id="other_4" class="other_4">
      <label>表名称</label>
                <span>
                    <select name="tab_name_4" id="tab_name_4">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%-- <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_4" id="tab_option_col_4">

                   </select>

               </span>
               <span id="optn4">
                   <select name="tab_option_4" id="tab_option_4" >

                   </select>

               </span>
    </div>
    <div id="other_5" class="other_5">
      <label>表名称</label>
                <span>
                    <select name="tab_name_5" id="tab_name_5">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%-- <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_5" id="tab_option_col_5">

                   </select>

               </span>
               <span id="optn5">
                   <select name="tab_option_5" id="tab_option_5" >

                   </select>

               </span>
    </div>

    <div id="divsql1">
      <label>请输入sql(带{pt})</label>
      <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:291px;margin-left:282px;margin-top: -14px;"    id="timersql" name="timersql"  wrap="virtual ">  ${param.timersql } </textarea>


    </div>
    <div id="comit1" style="clear:both">
      <label>图表注释信息</label>
                <textarea rows="500" cols="50" contenteditable="true" style="width:745px;height:216px;margin-left:282px;margin-top: -14px;"    id="comitmentarea" name="comitmentarea"  wrap="virtual ">

             </textarea>
    </div>

    <div id="divsql2">
      <input type="hidden" id="message" />
      <input type="submit" id="btn"  value="提交">

      </input>
    </div>

  </form>
</div>







</body>

</html>
