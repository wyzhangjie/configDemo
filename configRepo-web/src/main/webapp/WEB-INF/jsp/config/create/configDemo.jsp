<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ include file="../../common/configtaglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/page/config/create/configDemo.css"/>
    <script type="text/javascript" src="<%=basePath%>js/page/config/create/configDemo.js"></script>
</head>

    <body>
                <div style="margin:20px 0 10px 0;"></div>
                <div class="easyui-tabs" style="width:100%">

                    <div title="普通报表配置区域" style="padding:10px">

                                <form action="${basePath }/config/defult" id="form1" class="easyui-form" method="post" >
                                    <div style="text-align: center;font-size: 25px;margin-left: 400px;">普通报表配置区域</div>
                                    <div id="cdpz">
                                        <span >  母菜单名称</span>  <span id="pmenuName">
  <select name="pmenuName"  id="pmenuName0" data-options="required:true">

  </select>

  </span>
                                        <span >  新增菜单名称</span>  <span id="menuName"> <input  class="easyui-textbox"  type="text" name="menuName" id="menuName0" data-options="required:true" validType="checkMenuName"  ></span>
                <span >  图例类型（kind）：       </span>
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
      <%--  <option value="gauge">仪表盘</option>--%>
  </select>
  </span>

            </div>
            <div id="tud1ata">
                <span> 图例（legend） </span>  <span>   <input  class="easyui-textbox" type="text" id="legend" name="legend" value="" data-options="required:true"> </span>
                <span> 横坐标(catagory) </span>  <span>   <input class="easyui-textbox" type="text" id="catalog" name="catalog" value="" data-options="required:true"> </span>
                <span> 是否要合并（stack）</span>  <span>      <input  class="easyui-textbox" type="text" id="stack" name="stack" value="" > </span>

            </div>
            <div id="tu2data">
                <span>图形的主标题</span>   <span><input  class="easyui-textbox" type="text" id="title" name="title" value="null" data-options="required:true"></span>
                <span>图形的副标题</span> <span> <input  class="easyui-textbox" type="text" id="subtitle" name="subtitle" value="null" data-options="required:true" >  </span>
                <span>报表类型</span>
    <span>
    <select id="report_kind" name="report_kind" style="width: 150px;" >
                        <option value="日报">日报</option>
                        <option value="周报">周报</option>
                        <option value="月报">月报</option>
                        <option value="季报">季报</option>
                        <option value="年报">年报</option>
                    </select>
     

</span>

                <!-- <span>文件名称</span>  <span> <input class="easyui-textbox" type="text" id="fileName" name="fileName" data-options="required:true">   </span> -->
                <span style="display:none;" > 文件路径  </span>  <span>  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config"> </span>
            </div>

            <div id="real_time">
                <span>是否实时(realtime)</span>
             <span id="realtime">
                  <select  name="realtime" style="width: 146px;">
                      <option value="00" ></option>
                      <option value="01">实时</option>
                  </select>
             </span>
                <span>时间类型(timetype)</span>
             <span id="timetype">
                  <select  name="timetype" style="width: 146px;">
                      <option value="0" >前一个时间段</option>
                      <option value="1">当前时间段</option>
                  </select>
             </span>
            </div>
         <div id="other">
               <span>多维度项数</span>
               <span>
                   <select id="other_num" name="other_num">
                       <option name="0">0</option>
                       <option name="1">1</option>
                       <option name="2">2</option>
                       <option name="3">3</option>
                       <option name="4">4</option>
                       <option name="5">5</option>
                   </select>

               </span>
         </div>
            <div id="other_1" class="other_1">
                <span>表名称</span>
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
               <span>
                   <select name="tab_option_1" id="tab_option_1" style="max-width: 95px;">

                   </select>

               </span>
            </div>

            <div id="other_2" class="other_2">
                <span>表名称</span>
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
               <span>
                   <select name="tab_option_2" id="tab_option_2" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="other_3" class="other_3">
                <span>表名称</span>
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
               <span>
                   <select name="tab_option_3" id="tab_option_3" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="other_4" class="other_4">
                <span>表名称</span>
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
               <span>
                   <select name="tab_option_4" id="tab_option_4" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="other_5" class="other_5">
                <span>表名称</span>
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
               <span>
                   <select name="tab_option_5" id="tab_option_5" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <%--  <div><span><a href="http://my.oschina.net/zjItLife/blog/464577">配置说明书</a></span></div>--%>
            <div id="divsql3">

                <div id="divsql1" class="easyui-panel" title="请输入sql(带时间参数)"
                     style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                    <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="timersql" name="timersql"  wrap="virtual ">  </textarea>
                    <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->

                </div>

            </div>
            <div id="divsql_comit" class="easyui-panel" title="图表注释信息"
                 style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
             <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="comitmentarea" name="comitmentarea"  wrap="virtual ">

           </textarea>

            </div>
            <!--    <div>  <span><a href="http://my.oschina.net/zjItLife/blog/471440">配置说明书</a></span></div> -->

            <div id="divsql2">
                <input type="submit" id="btn"  value="提交"></input>
            </div>

        </form>
   </div>
    <div title="普通表格报表配置区域" style="padding:10px">

        <form action="${basePath }/config/dqGrid" id="form2" class="easyui-form" method="post" >
            <div style="text-align: center;font-size: 25px;margin-left: 400px;margin-top: 40px;">表格报表配置区域</div>
            <div id="cdpz1">
                <span >  母菜单名称</span>  <span id="pmenuName">
  <select name="pmenuName"  id="pmenuName1" data-options="required:true">

  </select>

  </span>
                <span >  新增菜单名称</span>  <span id="menuName"> <input  class="easyui-textbox"  type="text" name="menuName" id="menuName1" data-options="required:true" validType="checkMenuName" ></span>
                <span >  图例类型（kind）：       </span>
  <span id="kind">
   <input class="easyui-textbox" type="text" style="readonly:readonly;" name="jqGrid" value="图表类型"/>
  </span>

            </div>
            <div id="tud1ata">
                <span> 表数量</span>
 <span>
  <select name="tablenum" id="tablenum" style="width: 140px;">
      <option value="1" selected="selected">0</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
  </select>
 </span>

                <span>报表类型</span>
    <span>
    <select id="report_kind" name="report_kind" style="width: 150px;" >
                        <option value="日报">日报</option>
                        <option value="周报">周报</option>
                        <option value="月报">月报</option>
                        <option value="季报">季报</option>
                        <option value="年报">年报</option>
                    </select>
    

</span>
                <span>是否实时(realtime)</span>
             <span id="realtime">
                  <select  name="realtime" style="width: 146px;">
                      <option value="00" ></option>
                      <option value="01">实时</option>
                  </select>
             </span>

                <%-- <span><a href="http://my.oschina.net/zjItLife/blog/464577">配置说明书</a></span>--%>
                <span style="display:none;" > 文件路径  </span>  <span>  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config/jqgrid"> </span>
            </div>
            <div id="time_type">
                <span>时间类型(timetype)</span>
             <span id="timetype">
                  <select  name="timetype" style="width: 146px;">
                      <option value="0" >前一个时间段</option>
                      <option value="1">当前时间段</option>
                  </select>
             </span>
            </div>
            <div id="other">
                <span>多维度项数</span>
               <span>
                   <select id="other_num_jq" name="other_num_jq">
                       <option name="0">0</option>
                       <option name="1">1</option>
                       <option name="2">2</option>
                       <option name="3">3</option>
                       <option name="4">4</option>
                       <option name="5">5</option>
                   </select>

               </span>
            </div>
            <div id="other_1_jq" class="other_1_jq">
                <span>表名称</span>
                <span>
                    <select name="tab_name_1_jq" id="tab_name_1_jq">
                        <option name="请选择">请选择</option>
                        <option name="dim_dict">dim_dict</option>
                        <%--  <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                <span>
                   <select name="tab_option_col_1_jq" id="tab_option_col_1_jq">

                   </select>

               </span>
               <span>
                   <select name="tab_option_1_jq" id="tab_option_1_jq" style="max-width: 95px;">

                   </select>

               </span>
            </div>

            <div id="other_2_jq" class="other_2_jq">
                <span>表名称</span>
                <span>
                    <select name="tab_name_2_jq" id="tab_name_2_jq">
                        <option name="请选择">请选择</option>
                        <option name="dim_dict">dim_dict</option>
                        <%--    <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_2_jq" id="tab_option_col_2_jq">

                   </select>

               </span>
               <span>
                   <select name="tab_option_2_jq" id="tab_option_2_jq" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="other_3_jq" class="other_3_jq">
                <span>表名称</span>

                <span>
                      <select id="tab_name_3_jq" name="tab_name_3_jq">
                          <option name="请选择">请选择</option>
                          <option name="dim_dict">dim_dict</option>
                      </select>

                </span>
                 <span>
                   <select name="tab_option_col_3_jq" id="tab_option_col_3_jq">

                   </select>

               </span>
               <span>
                   <select name="tab_option_3_jq" id="tab_option_3_jq" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="other_4_jq" class="other_4_jq">
                <span>表名称</span>
                <span>
                    <select name="tab_name_4_jq" id="tab_name_4_jq">
                        <option name="请选择">请选择</option>
                        <option name="dim_dict">dim_dict</option>
                        <%-- <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_4_jq" id="tab_option_col_4_jq">

                   </select>

               </span>
               <span>
                   <select name="tab_option_4_jq" id="tab_option_4_jq" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="other_5_jq" class="other_5">
                <span>表名称</span>
                <span>
                    <select name="tab_name_5_jq" id="tab_name_5_jq">
                        <option name="请选择">请选择</option>
                        <option name="dim_dict">dim_dict</option>
                        <%-- <option name="dim_time">dim_time</option>--%>
                    </select>

                </span>
                 <span>
                   <select name="tab_option_col_5_jq" id="tab_option_col_5_jq">

                   </select>

               </span>
               <span>
                   <select name="tab_option_5_jq" id="tab_option_5_jq" style="max-width: 95px;">

                   </select>

               </span>
            </div>
            <div id="data1">
                <!--  显示的字段和对应的中文名称 -->
                <div id="title1">
                    <span >图表名称</span>
                    <span> <input  class="easyui-textbox" style="width:80%;" name="title1" /> </span>
                </div>
                <div id='param1'>

                    <span >预显示字段及中文名</span>
                    <span> <input  class="easyui-textbox"  style="width:80%;" name="param1" /> </span>
                </div>





             <%--   <span > 唯一标示字段</span>
      <span id="uniq1">
      <input class="easyui-textbox" type="text"  name="uniq1" value="name"/>
     </span>--%>
                <div id="datasql1">
                    <div id="datasql1" class="easyui-panel" title=" 请输入sql(带{pt})"
                         style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                        <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="datasql1" name="datasql1"  wrap="virtual ">  </textarea>
                        <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->

                    </div>
                    <div id="comitdiv1_ds1" class="easyui-panel" title="图表注释信息"
                         style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
             <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="comitmentarea_ds1" name="comitmentarea_ds1"  wrap="virtual ">

             </textarea>
                    </div>

                </div>
                <div>

                </div>
            </div>
            <div id="data2">
                <div id="title2">
                    <span >图表名称</span>
                    <span> <input  class="easyui-textbox" style="width:80%;" name="title2" /> </span>
                </div>
                <!--  显示的字段和对应的中文名称 -->
                <div id='param2'>
                    <span >预显示字段及中文名 </span>
                    <span> <input  class="easyui-textbox" style="width:80%" name="param2"/> </span>
                </div>
                <%--<div>
                   &lt;%&ndash; <span > 唯一标示字段</span>
      <span id="uniq2">
      <input class="easyui-textbox" type="text"  name="uniq2" value="name"/>
     </span>&ndash;%&gt;
                </div>--%>
                <div id="datasql21">
                    <div id="datasql21" class="easyui-panel" title=" 请输入sql(带{pt})"
                         style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                        <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="datasql2" name="datasql2"  wrap="virtual ">  </textarea>
                        <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->
                    </div>
                    <div id="comitdiv1_ds2" class="easyui-panel" title="图表注释信息"
                         style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
             <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="comitmentarea_ds2" name="comitmentarea_ds2"  wrap="virtual ">

             </textarea>
                    </div>
                </div>



            </div>
            <div id="data3" >
                <div id="title3">
                    <span >图表名称</span>
                    <span> <input  class="easyui-textbox" style="width:80%;" name="title3" /> </span>
                </div>
                <div id='param3'>
                    <span >预显示字段及中文名 </span>
                    <span> <input   class="easyui-textbox" style="width:80%" name="param3"/> </span>
                </div>
              <%--  <div>
                  &lt;%&ndash;  <span > 唯一标示字段</span>
      <span id="uniq3">
      <input class="easyui-textbox" type="text"  name="uniq3" value="name"/>
     </span>&ndash;%&gt;
                </div>--%>
                <div id="datasql31">

                    <div id="datasql31" class="easyui-panel" title=" 请输入sql(带{pt})"
                         style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                        <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="datasql3" name="datasql3"  wrap="virtual ">  </textarea>
                        <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->
                    </div>
                    <div id="comitdiv1_ds3" class="easyui-panel" title="图表注释信息"
                         style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
             <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="comitmentarea_ds3" name="comitmentarea_ds3"  wrap="virtual ">

             </textarea>
                    </div>
                </div>



            </div>

            <div id="divsql2">
                <input type="hidden" id="message" />

                <input type="submit" id="btn1"  value="提交"></input>
            </div>

        </form>
    </div>

    <div title="双轴报表配置区域" style="padding:10px">

        <form action="${basePath }/config/mix1" id="form3" class="easyui-form" method="post" >
            <div style="text-align: center;font-size: 25px;margin-left: 400px;margin-top: 40px;">双轴报表配置区域</div>

            <div id="mix1_div">

                <span >  母菜单名称</span>  <span id="pmenuName">
  <select name="mix1_pmenuName0"  id="mix1_pmenuName0" data-options="required:true">

  </select>

  </span>
                <span >  新增菜单名称</span>  <span id="mix1_menuName"> <input  class="easyui-textbox"  type="text" name="mix1_menuName0" id="mix1_menuName0" data-options="required:true" validType="checkMenuName"  ></span>
                <span >  图例类型（kind）：       </span>
  <span id="mix1_kind">
  <select name="kind">
      <option value="ylines">y轴双轴图</option>

      <%--  <option value="gauge">仪表盘</option>--%>
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
    <span>
    <select id="mix1_report_kind" name="mix1_report_kind" style="width: 150px;" >
                        <option value="日报">日报</option>
                        <option value="周报">周报</option>
                        <option value="月报">月报</option>
                        <option value="季报">季报</option>
                        <option value="年报">年报</option>
                    </select>
     

</span>

                <!-- <span>文件名称</span>  <span> <input class="easyui-textbox" type="text" id="fileName" name="fileName" data-options="required:true">   </span> -->
                <span style="display:none;" > 文件路径  </span>  <span>  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config/mix1"> </span>
            </div>
            <div id="real_time">
                <span>是否实时(realtime)</span>
             <span id="realtime">
                  <select  name="realtime" style="width: 146px;">
                      <option value="00" ></option>
                      <option value="01">实时</option>
                  </select>
             </span>
                <span>时间类型(timetype)</span>
             <span id="timetype">
                  <select  name="timetype" style="width: 146px;">
                      <option value="0" >前一个时间段</option>
                      <option value="1">当前时间段</option>
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
                   <select name="tab_option_1_mix1" id="tab_option_1_mix1" style="max-width: 95px;">

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
                   <select name="tab_option_2_mix1" id="tab_option_2_mix1" style="max-width: 95px;">

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
                   <select name="tab_option_3_mix1" id="tab_option_3_mix1" style="max-width: 95px;">

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
                   <select name="tab_option_4_mix1" id="tab_option_4_mix1" style="max-width: 95px;">

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
                   <select name="tab_option_5_mix1" id="tab_option_5_mix1" style="max-width: 95px;">

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

                <%--  <option value="gauge">仪表盘</option>--%>
            </select>
        </span>


                </span>
            </div>
            <div style="float: left;clear: both; ">


                <div id="mix_divsql1" class="easyui-panel" title="请输入左侧坐标对应sql(带时间参数,单个sql)"
                     style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                    <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="mix1_timersql1" name="mix1_timersql1"  wrap="virtual ">  </textarea>
                    <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->

                </div>

            </div>
            <div >


                <div id="mix_divsql2" class="easyui-panel" title="请输入右侧坐标对应sql(带时间参数，单个sql)"
                     style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                    <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="mix1_timersql2" name="mix1_timersql2"  wrap="virtual ">  </textarea>
                    <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->

                </div>

            </div>
            <div id="mix1_divsql_comit" class="easyui-panel" title="图表注释信息"
                 style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
             <textarea rows="500" cols="50"  style="width:500px;height:200px;"    id="mix1_comitmentarea" name="mix1_comitmentarea"  wrap="virtual ">

           </textarea>

            </div>
            <!--    <div>  <span><a href="http://my.oschina.net/zjItLife/blog/471440">配置说明书</a></span></div> -->

            <div id="mix1_divsql2" style="clear: left;">
                <input type="submit" id="mix1_btn"  value="提交"/>
            </div>

        </form>
    </div>
    </div>


    </body>
</html>