<%@ include file="../../common/configtaglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/page/config/modify/modifyJqgridDate.css?p==1" />

    <script type="text/javascript" src="<%=basePath%>js/page/config/modify/modifyJqgridDate.js"></script>





<body>


<div id="modiMode2" >

    <form action="${basePath }/config/dqGridmodify" id="form2" class="easyui-form" method="post" >
        <div style="text-align: center;font-size: 25px;margin-left: 474px;margin-top: 40px;margin-bottom: 30px;">表格配置区</div>
        <div id="cdpz1">
            <label >  母菜单名称</label>
            <input type="hidden" id="menuId_dq" name="menuId_dq" value="">
  <span id="pmenuName">
  <select name="pmenuName1"  id="pmenuName1" data-options="required:true"  >

  </select>

  </span>
            <label >  修改的菜单名称</label>
  <span id="menuName">
  <input  class="easyui-textbox"  type="text" name="menuName1" id="menuName1" data-options="required:true" style="width:162px;"   />
  <input type ="hidden" name="grid_catalog" id="grid_catalog" />
  </span>


        </div>
        <div id="tud1ata">
            <label >  图例类型（kind）：       </label>
  <span id="kind">
   <input class="easyui-textbox" style="width:162px" type="text" style="readonly:readonly;" name="jqGrid" value="图表类型"/>

  </span>
            <label> 表数量</label>
 <span>
  <select name="tablenum" id="tablenum">
      <option value="1" selected="selected">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
  </select>
 </span>



        </div>
        <div id="real_time">
            <label>报表类型</label>
    <span>
    <select id="report_kind" name="report_kind"  >
                        <option value="日报">日报</option>
                       <%-- <option value="周报">周报</option>
                        <option value="月报">月报</option>
                        <option value="季报">季报</option>
                        <option value="年报">年报</option>--%>
                    </select>
     

</span>
            <label>是否实时(realtime)</label>
             <span id="realtime">
                  <select  name="realtime" style="">
                      <option value="00" ></option>
                      <option value="01">实时</option>
                  </select>

                    <span style="display:none;" > 文件路径  </span>  <span>  <input  type="text" id="filePath"  style="display:none;" name="filePath" value="/jsp/config/jqgrid"> </span>

       </span>

        </div>
        <div id="time_type">
            <label>时间类型(timetype)</label>
             <span id="timetype">
                  <select  name="timetype" >
                      <option value="0" >前一个时间段</option>
                      <option value="1">当前时间段</option>
                  </select>
             </span>

        </div>
        <div id="mul_time">
            <label>时间多维度</label>
             <span id="multime">
                  <select  name="multime" >
                      <%--  <option value="0" >否</option>--%>
                      <option value="1">是</option>
                  </select>
             </span>
            <label>显示时间天数</label>   <span><input  class="easyui-textbox" type="text" id="daynum" name="daynum" value="${param.daynum }" data-options="required:true"></span>
        </div>
        <div id="other">
            <label>多维度项数</label>
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
            <label>表名称</label>
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
            <label>表名称</label>
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
            <label>表名称</label>

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
            <label>表名称</label>
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
            <label>表名称</label>
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
            <div id="div_title1">
                <label >图表名称</label>
    <span>
    <input  name="title1" id="title1" />
    </span>
            </div>
            <div id='div_param1'>
                <label >预显示字段及中文名</label>
                <div >
                    <input   style="clear:both;width:740px;height: 30px;"  name="param1" id="param1" />
                    <%-- <textarea cols="50" rows="3" style="width:300px;height:100px;" name="param1"  id="param1" wrap="virtual" ></textarea>--%>
                </div>

            </div>

            <div id="div_datasql1">
                <label>请输入sql<br/>(带{start}和{end})</label>
              <span>
                    <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:291px;"    id="timersql1" name="timersql1"  wrap="virtual ">  </textarea>
              </span>
                <%--  <div id="datasql1" class="easyui-panel" title=" 请输入sql(带{pt})"
                       style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">


                  </div>--%>
            </div>
            <div style="clear:both">
                <span>图表注释信息</span>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:216px;margin-left:-13px"    id="comitmentarea_ds1" name="comitmentarea_ds1"  wrap="virtual ">

             </textarea>
            </div>
            <div id="col1">
                <span>是否配置颜色</span>
            <span>
                <select id="iscolor1" name="iscolor1">
                    <option value="是">是</option>
                    <option value="否" selected ="selected">否</option>
                </select>
            </span>
            </div>
            <div id="col1_show">
                <div id="col1_1"  style="display:block;clear: both;">
                    <span>数据区间1：</span>

                    <span> <input id="col1_data_1_from" name="col1_data_1_from"/> </span>
                    <span> <input id="col1_data_1_to" name="col1_data_1_to"/></span>
                    <%-- <span><select id="col1_cols_1" name="col1_cols_1"></select></span>--%>

                </div>
                <div style="clear:both;padding-left: 299px">
                    <span><input type="text" id="col1_cols_1" name="col1_cols_1" value="#123456" /></span>
                    <span id="picker1_1"></span>
                </div>
                <div id="col1_2" style="clear: both;">
                    <span>数据区间2：</span>

                    <span> <input id="col1_data_2_from" name="col1_data_2_from"/></span>
                    <span><input id="col1_data_2_to" name="col1_data_2_to"/></span>
                    <%--<span><select id="col1_cols_2" name="col1_cols_2"></select></span>--%>

                </div>
                <div style="clear:both;padding-left: 299px">
                    <span> <input type="text" id="col1_cols_2" name="col1_cols_2" value="#123456" /></span>
                    <span id="picker1_2"></span>
                </div>
                <div id="col1_3" style="clear: both;">
                    <span>数据区间3：</span>

                    <span> <input id="col1_data_3_from" name="col1_data_3_from"/></span>
                    <span><input id="col1_data_3_to" name="col1_data_3_to"/> </span>
                    <%--  <span> <select id="col1_cols_3" name="col1_cols_3"></select> </span>--%>

                </div>
                <div style="clear:both;padding-left: 299px">
                    <span>   <input type="text" id="col1_cols_3" name="col1_cols_3" value="#123456" /></span>
                    <span id="picker1_3"></span>
                </div>
            </div>
        </div>
        <div id="data2">
            <div id="div_title2">
                <label >图表名称</label>
        <span>
            <input  name="title2" id="title2" />
         </span>
            </div>
            <!--  显示的字段和对应的中文名称 -->
            <div id='div_param2'>
                <label >预显示字段及中文名 </label>
                <div>
                    <input   style="width:740px;;height: 30px;" name="param2" id="param2"/>
                </div>



            </div>

            <div id="div_datasql2">
                <label>请输入sql<br/>(带{start}和{end})</label>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:291px;;margin-left:37px"    id="timersql2" name="timersql2"  wrap="virtual ">  </textarea>
            </div>
            <div style="clear:both">
                <span>图表注释信息</span>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:216px;margin-left:-12px;"    id="comitmentarea_ds2" name="comitmentarea_ds2"  wrap="virtual ">

             </textarea>
            </div>
            <div id="col2">
                <span>是否配置颜色</span>
            <span>
                <select id="iscolor2" name="iscolor2">
                    <option value="是">是</option>
                    <option value="否" selected ="selected">否</option>
                </select>
            </span>
            </div>
            <div id="col2_show" name="col2_show">

                <div id="col2_1" style="display:block;clear: both;">
                    <span>数据区间1：</span>
                    <span><input id="col2_data_1_from" name="col2_data_1_from"></input> </span>
                    <span><input id="col2_data_1_to" name="col2_data_1_to"/></span>

                </div>
                <div style="clear:both;padding-left: 299px">
                    <span>     <input id="col2_cols_1" name ="col2_cols_1" value="#123456"/>         </span>
                    <span id="picker2_1"></span>
                </div>
                <div id="col2_2" style="clear: both;">
                    <span>数据区间2：</span>
                    <span><input id="col2_data_2_from" name="col2_data_2_from"/></span>
                    <span><input id="col2_data_2_to" name="col2_data_2_to"/></span>

                </div>
                <div style="clear:both;padding-left: 299px">
                 <span>
                    <input id ="col2_cols_2" name="col2_cols_2" value="#123456"/>
                   </span>
                    <span id="picker2_2"></span>
                </div>
                <div id="col2_3" style="clear: both;">
                    <span>数据区间3：</span>
                    <span><input id="col2_data_3_from" name="col2_data_3_from"/> </span>
                    <span><input id="col2_data_3_to" name="col2_data_3_to"/></span>

                </div>
                <div style="clear:both;padding-left: 299px">
                 <span>
                    <input id ="col2_cols_3" name="col2_cols_3" value="#123456"/>
                   </span>
                    <span id="picker2_3"></span>
                </div>
            </div>

        </div>
        <div id="data3" >
            <div id="div_title3">
                <label >图表名称</label>
     <span>
        <input    name="title3" id ="title3"/>
      </span>
            </div>
            <div id='div_param3'>
                <label >预显示字段及中文名 </label>
                <div>
                    <%-- <textarea cols="50" rows="3" style="width:300px;height:100px;display:block;" name="param3"  id="param3" wrap="virtual "></textarea>--%>
                    <input   style="width:740px;height: 30px;" name="param3" id="param3"/>
                </div>


            </div>

            <div id="datasql3">
                <span>请输入sql<br/>(带{start}和{end})</span>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:291px;margin-left:-13px"    id="timersql3" name="timersql3"  wrap="virtual ">  </textarea>
                <%-- <div id="datasql3" class="easyui-panel" title=" 请输入sql(带{pt})"
                      style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
                   <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="timersql3" name="timersql3"  wrap="virtual ">  </textarea>
                 </div>--%>
            </div>
            <div style="clear:both">
                <span>图表注释信息</span>
                <textarea rows="500" cols="50" contenteditable="true"  style="width:745px;height:216px;margin-left:-16px;"    id="comitmentarea_ds3" name="comitmentarea_ds3"  wrap="virtual ">

             </textarea>
            </div>
            <%--<div id="comitdiv1_ds3" class="easyui-panel" title="图表注释信息"
                 style="width:500px;height:200px;padding:10px;background:#fafafa;"          data-options="collapsible:true">
               <textarea rows="500" cols="50"  style="width:450px;height:200px;"    id="comitmentarea_ds3" name="comitmentarea_ds3"  wrap="virtual ">

               </textarea>
            </div>--%>
            <div id="col3">
                <span>是否配置颜色</span>
            <span>
                <select id="iscolor3" name="iscolor3">
                    <option value="是">是</option>
                    <option value="否" selected ="selected">否</option>
                </select>
            </span>
            </div>
            <div id="col3_show">
                <div id="col3_1" style="display:block;clear: both;">
                    <span>数据区间1：</span>
                    <span><input id="col3_data_1_from" name="col3_data_1_from"/></span>
                    <span><input id="col3_data_1_to" name="col3_data_1_to"/></span>


                </div>
                <div style="clear:both;padding-left: 299px">
                 <span>
                    <input id ="col3_cols_1" name="col3_cols_1" value="#123456"/>
                   </span>
                    <span id="picker3_1"></span>
                </div>
                <div id="col3_2" style="clear: both;">
                    <span>数据区间2：</span>
                    <span><input id="col3_data_2_from" name="col3_data_2_from"/> </span>
                    <span><input id="col3_data_2_to" name="col3_data_2_to"/></span>

                </div>
                <div style="clear:both;padding-left: 299px">
                 <span>
                    <input id ="col3_cols_2" name="col3_cols_2" value="#123456"/>
                   </span>
                    <span id="picker3_2"></span>
                </div>
                <div id="col3_3" style="clear: both;">
                    <span>数据区间3：</span>
                    <span><input id="col3_data_3_from" name="col3_data_3_from"><input> </span>
                    <span><input id="col3_data_3_to" name="col3_data_3_to"/></span>

                </div>
                <div style="clear:both;padding-left: 299px">
                 <span>
                    <input id ="col3_cols_3" name="col3_cols_3" value="#123456"/>
                   </span>
                    <span id="picker3_3"></span>
                </div>
            </div>

        </div>

        <div id="divsql2">
            <input type="hidden" id="message" />

            <input type="submit" id="btn1"  value="提交"/>
        </div>

    </form>
</div>




</body>

</html>
