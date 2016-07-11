<<%@ page language="java" contentType="text/html; charset=utf-8"
          pageEncoding="utf-8"%>
<%@ include file="../../common/configtaglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>

<script type="text/javascript" src="<%=basePath%>js/page/config/modify/ylineModify.js"></script>
    <link href="<%=basePath%>css/page/config/modify/ylineModify.css?pp=1" type="text/css" rel="stylesheet" />

</head>

<body>


<div id="modiMode3"  >
    <form action="${basePath }/config/mix1Modify" id="form3" class="easyui-form" method="post" >
        <div style="text-align: center;font-size: 25px;margin-left: 490px;margin-top: 40px;margin-bottom:30px">双轴报表修改区域</div>

        <div id="mix1_div">

            <label >  母菜单名称</label>
            <span id="pmenuName">
             <input type="hidden" id ="mix1_menuId" name="mix1_menuId" value="">
                  <select name="mix1_pmenuName0"  id="mix1_pmenuName0" data-options="required:true">

             </select>

            </span>
            <label >  新增菜单名称</label>
            <span id="mix1_menuName">
                <input  type="text" name="mix1_menuName0" id="mix1_menuName0" data-options="required:true"  >
            </span>


        </div>
        <div id="tud1ata">
            <label >  图例类型（kind）：       </label>
  <span id="mix1_kind">
  <select name="kind">
      <option value="ylines">y轴双轴图</option>

      <%--  <option value="gauge">仪表盘</option>--%>
  </select>
  </span>
            <label> 图例（legend） </label>  <span>
            <input   type="text" id="mix1_legend" name="mix1_legend" value="" data-options="required:true"> </span>

        </div>
        <div id="tu2data">
            <label> 横坐标(catagory) </label>
            <span>   <input  type="text" id="mix1_catalog" name="mix1_catalog" value="" data-options="required:true"> </span>
            <label> 是否要合并（stack）</label>
            <span>      <input  type="text" id="mix1_stack" name="mix1_stack" value="" > </span>



            <!-- <span>文件名称</span>  <span> <input class="easyui-textbox" type="text" id="fileName" name="fileName" data-options="required:true">   </span> -->
            <span style="display:none;" > 文件路径  </span>  <span>  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config/mix1"> </span>
        </div>
        <%--  <div><span><a href="http://my.oschina.net/zjItLife/blog/464577">配置说明书</a></span></div>--%>

        <div id="real_time">
            <label>图形的主标题</label>   <span><input  class="easyui-textbox" type="text" id="mix1_title" name="mix1_title" value="null" data-options="required:true"></span>
            <label>图形的副标题</label> <span> <input  class="easyui-textbox" type="text" id="mix1_subtitle" name="mix1_subtitle" value="" >  </span>


        </div>
        <div id="other">
            <label>报表类型</label>
    <span>
    <select id="mix1_report_kind" name="mix1_report_kind"  >
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
        <div id="timet">
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
                      <option value="00" >两侧都不包含</option>
                      <option value="01">左侧不包含右侧包含</option>
                      <option value="10" >左侧包含右侧不包含</option>
                      <option value="11">两侧都包含</option>
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
        <div id="mix1_num">
            <label>多维度项数</label>
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
            <label>表名称</label>
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
                   <select name="tab_option_1_mix1" id="tab_option_1_mix1" >

                   </select>

               </span>
        </div>

        <div id="other_2_mix1"  class="other_2_mix1">
            <label>表名称</label>
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
                   <select name="tab_option_2_mix1" id="tab_option_2_mix1">

                   </select>

               </span>
        </div>
        <div id="other_3_mix1" class="other_3_mix1">
            <label>表名称</label>
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
                   <select name="tab_option_3_mix1" id="tab_option_3_mix1">

                   </select>

               </span>
        </div>
        <div id="other_4_mix1" class="other_4_mix1">
            <label>表名称</label>
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
                   <select name="tab_option_4_mix1" id="tab_option_4_mix1" >

                   </select>

               </span>
        </div>
        <div id="other_5_mix1" class="other_5_mix1">
            <label>表名称</label>
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
                   <select name="tab_option_5_mix1" id="tab_option_5_mix1" >

                   </select>

               </span>
        </div>
        <div id="tu3data">
            <label>左侧坐标名称</label><span><input type="text" id="yAxis0" name="yAxis0"></span>
            <label>左侧坐标图例类型名称</label>
        <span>
            <select name="kind1" id="kind1">
                <option value="line">线型</option>
                <option value="bar">柱状图</option>

                <%--  <option value="gauge">仪表盘</option>--%>
            </select>
        </span>


        </div>
        <div id="tu4data">
            <label>右侧坐标名称</label>
        <span>
            <input type="text" id="yAxis1" name="yAxis1">
        </span>
            <label>右侧坐标图例类型名称</label>



        <span>
            <select name="kind2" id="kind2">
                <option value="line">线型</option>
                <option value="bar" selected="selected">柱状图</option>

                <%--  <option value="gauge">仪表盘</option>--%>
            </select>
        </span>


            </span>
        </div>
        <div id="imptant">
            <div id="sql1" style="float: left;clear: both; ">


                <label id="left">请输入左侧坐标<br/>对应sql(带时间参数)</label>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:291px;margin-left:282px;margin-top: -125px;"    id="mix1_timersql1" name="mix1_timersql1"  wrap="virtual ">  </textarea>

            </div>
            <div id="sql2"  >
                <%-- <label>请输入右侧坐标对应sql(带时间参数)</label>--%>
                <label  id="right">请输入右侧坐标<br/>对应sql(带时间参数)</label>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:291px;margin-left:282px;margin-top: -125px;"    id="mix1_timersql2" name="mix1_timersql2"  wrap="virtual ">  ${param.timersql } </textarea>


                <%--<div id="mix_divsql2" class="easyui-panel" title="请输入右侧坐标对应sql(带时间参数)"
                     style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                    <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="mix1_timersql2" name="mix1_timersql2"  wrap="virtual ">  </textarea>
                    <!--              <textarea  id="timersql" name="timersql" style="width:500px;height:200px;"  data-options="required:true" wrap="physical" > </textarea> -->

                </div>--%>

            </div>
            <div id="comit1" >
                <label id="comit">图表注释信息</label>
                  <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:216px;margin-left:248px;margin-top: -107px;"    id="mix1_comitmentarea" name="mix1_comitmentarea"  wrap="virtual ">
                 </textarea>

            </div>

        </div>

        <!--    <div>  <span><a href="http://my.oschina.net/zjItLife/blog/471440">配置说明书</a></span></div> -->

        <div id="mix1_divsql2" style="clear: left;">
            <input type="hidden" id="message" />
            <input type="submit" id="mix1_btn"  value="提交"/>
        </div>

    </form>

</div>
</div>




</body>

</html>
