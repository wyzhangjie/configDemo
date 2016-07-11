<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="../../common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Echarts2.0报表配置区域</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/page/config/create/configMixDate.css?v=7"/>
    <script type="text/javascript" src="<%=basePath%>js/page/config/create/configMixDate.js?v=1" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>js/my/configDemo/otherOption.js" charset="utf-8"></script>

</head>
<body >
<div style="margin:20px 0 10px 0;"></div>
<%--<h1>双轴报表配置区域</h1>--%>
<div id="title">双轴时间多维度报表配置区域</div>
  <form action="${basePath }/config/mix1" id="form3" class="jqtransform" method="post" >
   <%-- <div style="text-align: center;font-size: 25px;margin-left: 400px;margin-top: 40px;">双轴报表配置区域</div>--%>

    <div id="mix1_div">

      <span >  母菜单名称</span>  <span id="pmenuName">
  <select name="mix1_pmenuName0"  id="mix1_pmenuName0" data-options="required:true">

  </select>

  </span>
      <span >  新增菜单名称</span>  <span id="mix1_menuName"> <input  class="easyui-textbox"  type="text" name="mix1_menuName0" id="mix1_menuName0" data-options="required:true" validType="checkMenuName"  ></span>
      <span >  图例类型（kind）</span>
  <span id="mix1_kind">
  <select name="kind">
    <option value="ylines">y轴双轴图</option>
  </select>
  </span>

    </div>
    <div id="tud1ata">
      <span> 图例（legend） </span>  <span>   <input  class="easyui-textbox" type="text" id="mix1_legend" name="mix1_legend" value="" data-options="required:true"> </span>
      <span> 横坐标(catagory) </span>  <span>   <input class="easyui-textbox" type="text" id="mix1_catalog" name="mix1_catalog" value="" data-options="required:true"> </span>
      <span> 是否要合并（stack）</span>  <span>      <input  class="easyui-textbox" type="text" id="mix1_stack" name="mix1_stack" value="" > </span>

    </div>
    <div id="tu2data">
      <span>图形的主标题</span>   <span><input  class="easyui-textbox" type="text" id="mix1_title" name="mix1_title" value="null" data-options="required:true"></span>
      <span>图形的副标题</span> <span> <input  class="easyui-textbox" type="text" id="mix1_subtitle" name="mix1_subtitle" value="null" data-options="required:true" >  </span>
      <span>报表类型</span>
    <span id="mixreportkind">
    <select id="mix1_report_kind" name="mix1_report_kind"  >
                      <option value="日报">日报</option>
                      <%--<option value="周报">周报</option>
                      <option value="月报">月报</option>
                      <option value="季报">季报</option>
                      <option value="年报">年报</option>--%>
                  </select>
     

</span>

      <!-- <span>文件名称</span>  <span> <input class="easyui-textbox" type="text" id="fileName" name="fileName" data-options="required:true">   </span> -->
      <span style="display:none;" > 文件路径  </span>  <span  id="file_Path">  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config/mix1"> </span>
    </div>
    <div id="real_time">
      <span>是否实时(realtime)</span>
             <span id="realtime">
                  <select  name="realtime" >
                    <option value="00" ></option>
                    <option value="01">实时</option>
                  </select>
             </span>
      <span>时间类型(timetype)</span>
             <span id="timetype">
                  <select  name="timetype" >
                    <option value="0" >前一个时间段</option>
                    <option value="1">当前时间段</option>
                  </select>
             </span>
        <span>是否包含百分号</span>
             <span id="ispercent">
                  <select  name="ispercent" >
                      <option value="00" >两侧都不包含</option>
                      <option value="01" >左侧不包含右侧包含</option>
                      <option value="10" >左侧包含右侧不包含</option>
                      <option value="11">两侧都包含</option>
                  </select>
             </span>
    </div>
       <div id="mulTime">
           <span>时间多维度</span>
             <span id="multime">
                  <select  name="multime" >
                  <%--    <option value="0" >否</option>--%>
                      <option value="1">是</option>
                  </select>
             </span>
           <span>显示时间天数</span> <span><input  class="easyui-textbox" type="text" id="daynum" name="daynum" value="0" data-options="required:true"></span>
       </div>
       <div id="maxmin_average">
           <span>最大值和最小值配置</span>
                <span>
                    <select id="maxandmin" name="maxandmin">
                        <option value="00">两侧都不配置</option>
                        <option value="01">左侧不配置右侧配置</option>
                        <option value="10">左侧配置右侧不配置</option>
                        <option value="11">两侧都配置</option>
                    </select>
                </span>
           <span>平均值配置</span>
                <span>
                    <select id="average" name="average">
                        <option value="00">两侧都不配置</option>
                        <option value="01">左侧不配置右侧配置</option>
                        <option value="10">左侧配置右侧不配置</option>
                        <option value="11">两侧都配置</option>
                    </select>
                </span>
       </div>
    <div id="other">
      <span>多维度项数</span>
               <span>
                   <select id="other_num_mix1" name="other_num_mix1">
                     <option name="0">0</option>
                     <option name="1">1</option>
                     <option name="2">2</option>
                     <option name="3">3</option>
                     <option name="4">4</option>
                     <option name="5">5</option>
                   </select>

               </span>
    </div>
    <div id="other_1_mix1" class="other_1_mix1">
      <span>表名称</span>
                <span>
                    <select name="tab_name_1_mix1" id="tab_name_1_mix1">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%--  <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                <span>
                   <select name="tab_option_col_1_mix1" id="tab_option_col_1_mix1">

                   </select>

               </span>
               <span>
                   <select name="tab_option_1_mix1" id="tab_option_1_mix1" style="max-width: 200px;">

                   </select>

               </span>
    </div>

    <div id="other_2_mix1"  class="other_2_mix1">
      <span>表名称</span>
                <span>
                    <select name="tab_name_2_mix1" id="tab_name_2_mix1">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%--    <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_2_mix1" id="tab_option_col_2_mix1">

                   </select>

               </span>
               <span>
                   <select name="tab_option_2_mix1" id="tab_option_2_mix1" style="max-width: 200px;">

                   </select>

               </span>
    </div>
    <div id="other_3_mix1" class="other_3_mix1">
      <span>表名称</span>
                <span>
                    <select name="tab_name_3_mix1" id="tab_name_3_mix1">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%--  <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_3_mix1" id="tab_option_col_3_mix1">

                   </select>

               </span>
               <span>
                   <select name="tab_option_3_mix1" id="tab_option_3_mix1" style="max-width: 200px;">

                   </select>

               </span>
    </div>
    <div id="other_4_mix1" class="other_4_mix1">
      <span>表名称</span>
                <span>
                    <select name="tab_name_4_mix1" id="tab_name_4_mix1">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%-- <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_4_mix1" id="tab_option_col_4_mix1">

                   </select>

               </span>
               <span>
                   <select name="tab_option_4_mix1" id="tab_option_4_mix1" style="max-width: 200px;">

                   </select>

               </span>
    </div>
    <div id="other_5_mix1" class="other_5_mix1">
      <span>表名称</span>
                <span>
                    <select name="tab_name_5_mix1" id="tab_name_5_mix1">
                      <option name="请选择">请选择</option>
                      <option name="dim_dict">dim_dict</option>
                      <%-- <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_5_mix1" id="tab_option_col_5_mix1">

                   </select>

               </span>
               <span>
                   <select name="tab_option_5_mix1" id="tab_option_5_mix1" style="max-width: 200px;">

                   </select>

               </span>
    </div>
    <%--  <div><span><a href="http://my.oschina.net/zjItLife/blog/464577">配置说明书</a></span></div>--%>
    <div id="tu3data">
      <span>左侧坐标名称</span><span><input type="text" id="yAxis0" name="yAxis0"></span>
      <span>左侧坐标图例类型名称</span>
        <span>
            <select name="kind1">
              <option value="line">线型</option>
              <option value="bar">柱状图</option>

              <%--  <option value="gauge">仪表盘</option>--%>
            </select>
        </span>


    </div>
    <div id="tu4data">
      <span>右侧坐标名称</span>
        <span>
            <input type="text" id="yAxis1" name="yAxis1">
        </span>
      <span>右侧坐标图例类型名称</span>



        <span>
            <select name="kind2">
              <option value="line">线型</option>
              <option value="bar" selected="selected">柱状图</option>
            </select>
        </span>


      </span>
    </div>
    <%--<div style="float: left;clear: both; ">--%>


      <div id="mix_divsql1" >
          <span>请输入左侧坐标对应sql<br/>(带{start}和{end})</span>
         <textarea rows="500" cols="50" id="mix1_timersql1" name="mix1_timersql1" contenteditable="true" wrap="virtual ">  </textarea>
        <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->
         <%-- <div id="mix1_timersql1" name="mix1_timersql1" contenteditable="true"><br /></div>--%>
      </div>

   <%-- </div>
    <div >--%>


      <div id="mix_divsql2">
          <span>请输入右侧坐标对应sql<br/>(带{start}和{end})</span>
          <textarea rows="500" cols="50"  id="mix1_timersql2" name="mix1_timersql2" contenteditable="true" wrap="virtual ">  </textarea>
        <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->
         <%-- <div id="mix1_timersql2" name="mix1_timersql2" contenteditable="true"><br /></div>--%>
      </div>

   <%-- </div>--%>
    <div id="mix1_divsql_comit">
        <span>图表注释信息</span>
       <textarea rows="500" cols="50" id="mix1_comitmentarea" name="mix1_comitmentarea" contenteditable="true" wrap="virtual ">
            <%--<div id="mix1_comitmentarea" name="mix1_comitmentarea" contenteditable="true"><br /></div>--%>
      </textarea>

    </div>
    <div id="mix1_divsql2" style="clear: left;">
      <input type="hidden" id="message" />
      <input type="submit" id="mix1_btn"  value="提交">
    </div>

  </form>


</body>
</html>