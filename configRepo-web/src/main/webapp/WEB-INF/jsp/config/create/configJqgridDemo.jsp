<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="../../common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>jq表格配置</title>
    <link rel="stylesheet" type="text/css"
          href="<%=basePath%>css/page/config/create/configJqgridDemo.css?v=7"/>
    <script type="text/javascript" src="<%=basePath%>js/page/config/create/configJqgridDemo.js?v=9" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>js/page/config/otherOption.js?v=1" charset="utf-8"></script>

</head>
<body >
<div style="margin:20px 0 10px 0;"></div>

<div id="title">表格报表配置区域</div>
<form  id="form2" action="<%=basePath%>config/jqgridCreate" class="easyui-form" method="post" >
    <%--<div style="text-align: center;font-size: 25px;margin-left: 400px;margin-top: 40px;">表格报表配置区域</div>--%>
    <div id="cdpz1">
        <span >  母菜单名称</span>  <span id="pmenuName">
  <select name="pmenuName"  id="pmenuName1" data-options="required:true">

  </select>

  </span>
        <span >  新增菜单名称</span>  <span id="menuName"> <input  class="easyui-textbox"  type="text" name="menuName" id="menuName1" data-options="required:true" validType="checkMenuName" ></span>
        <span >  图例类型（kind） </span>
  <span id="kind">
   <input class="easyui-textbox" type="text" style="readonly:readonly;" name="kind" value="图表类型"/>
  </span>

    </div>
    <div id="tud1ata">
        <span> 表数量</span>
 <span>
  <select name="tablenum" id="tablenum" >
      <option value="0" selected="selected">0</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
  </select>
 </span>

        <span>报表类型</span>
    <span>
    <select id="report_kind" name="reportKind"  >
                        <option value="日报">日报</option>
                        <option value="周报">周报</option>
                        <option value="月报">月报</option>
                        <option value="季报">季报</option>
                        <option value="年报">年报</option>
                    </select>
    

</span>
        <span>是否实时(realtime)</span>
             <span id="realtime">
                  <select  name="realtime" >
                      <option value="00" ></option>
                      <option value="01">实时</option>
                  </select>
             </span>
    </div>
    <div id="time_type">
        <span>时间类型(timetype)</span>
             <span id="timetype">
                  <select  name="timetype">
                      <option value="0" >前一个时间段</option>
                      <option value="1">当前时间段</option>
                  </select>
             </span>
    </div>
    <div id="other">
        <span>多维度项数</span>
               <span>
                   <select id="other_num_jq" name="otherNumJq">
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
        <span>条件1:sql</span>
               <span>
                   <textarea rows="500" cols="50" id="a" name="sql1" contenteditable="true" wrap="virtual " style="height: 80px; resize: none;">
                   </textarea>
               </span>
    </div>

    <div id="other_2_jq" class="other_2_jq">
        <span>条件2:sql</span>
               <span>
                   <textarea rows="500" cols="50" id="sql2" name="sql2" contenteditable="true" wrap="virtual " style="height: 80px; resize: none;">
                   </textarea>
               </span>
    </div>
    <div id="other_3_jq" class="other_3_jq">
        <span>条件3:sql</span>
               <span>
                   <textarea rows="500" cols="50" id="sql3" name="sql3" contenteditable="true" wrap="virtual " style="height: 80px; resize: none;">
                   </textarea>
               </span>
    </div>
    <div id="other_4_jq" class="other_4_jq">
        <span>条件4:sql</span>
               <span>
                   <textarea rows="500" cols="50" id="sql4" name="sql4" contenteditable="true" wrap="virtual " style="height: 80px; resize: none;">
                   </textarea>
               </span>
    </div>
    <div id="other_5_jq" class="other_5_jq">
        <span>条件5:sql</span>
               <span>
                   <textarea rows="500" cols="50" id="sql5" name="sql5" contenteditable="true" wrap="virtual " style="height: 80px; resize: none;">
                   </textarea>
               </span>
    </div>

    <div id="data1">
        <div id="comit1">新增表格一信息填写</div>
        <hr>
        <!--  显示的字段和对应的中文名称 -->
        <div id="title1">
            <span >图表名称</span>
            <span> <input  class="easyui-textbox"  name="title1" /> </span>
        </div>
        <div id='jqparam1'>
            <span >预显示字段及中文名</span>
            <%--<div id="jqparam1" name="param1" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="param1" name="param1" style="height:30px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
        <div id="data_sql1">
            <span >请输入sql(带{pt})</span>
            <%--<div id="datasql1" name="datasql1" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="datasql1" name="datasql1" style="height:80px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
        <div id="datacomit1">
            <span >图表注释信息</span>
            <%--<div id="comitmentarea_ds1" name="comitmentarea_ds1" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="comitmentarea_ds1" name="comitmentareaDs1" style="height:80px;" contenteditable="true" wrap="virtual ">  </textarea>
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
            <div style="clear:both;padding-left: 178px;">
                <span><input type="text" id="col1_cols_1" name="col1_cols_1" value="#123456" /></span>
                <span id="picker1_1"></span>
            </div>
        <div id="col1_2" style="clear: both;">
            <span>数据区间2：</span>

           <span> <input id="col1_data_2_from" name="col1_data_2_from"/></span>
            <span><input id="col1_data_2_to" name="col1_data_2_to"/></span>
            <%--<span><select id="col1_cols_2" name="col1_cols_2"></select></span>--%>

        </div>
            <div style="clear:both;padding-left: 178px;">
                <span> <input type="text" id="col1_cols_2" name="col1_cols_2" value="#123456" /></span>
                <span id="picker1_2"></span>
            </div>
        <div id="col1_3" style="clear: both;">
            <span>数据区间3：</span>

             <span> <input id="col1_data_3_from" name="col1_data_3_from"/></span>
            <span><input id="col1_data_3_to" name="col1_data_3_to"/> </span>
          <%--  <span> <select id="col1_cols_3" name="col1_cols_3"></select> </span>--%>

        </div>
            <div style="clear:both;padding-left: 178px;">
                <span>   <input type="text" id="col1_cols_3" name="col1_cols_3" value="#123456" /></span>
                <span id="picker1_3"></span>
            </div>
        </div>
    </div>

    <div id="data2">
        <div id="comit2">新增表格二信息填写</div>
        <hr>
        <div id="title2">
            <span >图表名称</span>
            <span> <input  class="easyui-textbox"  name="title2" /> </span>
        </div>
        <!--  显示的字段和对应的中文名称 -->
        <div id='jqparam2'>
            <span >预显示字段及中文名 </span>
           <%-- <div id="jqparam2" name="param2" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="param2" name="param2" style="height:30px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
        <div id="data_sql2">
            <span >请输入sql(带{pt})</span>
            <%--<div id="datasql2" name="datasql2" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="datasql2" name="datasql2" style="height:80px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
        <div id="datacomit2">
            <span >图表注释信息</span>
            <%--<div id="comitmentarea_ds2" name="comitmentarea_ds2" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="comitmentarea_ds2" name="comitmentareaDs2" style="height:80px;" contenteditable="true" wrap="virtual ">  </textarea>
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
                <span><input id="col2_data_1_from" name="col2_data_1_from"/> </span>
                <span><input id="col2_data_1_to" name="col2_data_1_to"/></span>

            </div>
            <div style="clear:both;padding-left: 178px;">
                <span>     <input id="col2_cols_1" name ="col2_cols_1" value="#123456"/>         </span>
                <span id="picker2_1"></span>
            </div>
            <div id="col2_2" style="clear: both;">
                <span>数据区间2：</span>
                <span><input id="col2_data_2_from" name="col2_data_2_from"/></span>
                <span><input id="col2_data_2_to" name="col2_data_2_to"/></span>

            </div>
            <div style="clear:both;padding-left: 178px;">
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
            <div style="clear:both;padding-left: 178px;">
                 <span>
                    <input id ="col2_cols_3" name="col2_cols_3" value="#123456"/>
                   </span>
                <span id="picker2_3"></span>
            </div>
        </div>

    </div>

    <div id="data3" >
        <div id="comit3">新增表格三信息填写</div>
        <hr>
        <div id="title3">
            <span >图表名称</span>
            <span> <input  class="easyui-textbox"  name="title3" /> </span>
        </div>
        <div id='jqparam3'>
            <span >预显示字段及中文名 </span>
            <%--<div id="jqparam3" name="param3" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="param3" name="param3" style="height:30px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
        <div id="data_sql3">
            <span >请输入sql(带{pt})</span>
            <%--<div id="datasql3" name="datasql3" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="datasql3" name="datasql3" style="height:80px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
        <div id="datacomit3">
            <span >图表注释信息</span>
            <%--<div id="comitmentarea_ds3" name="comitmentarea_ds3" contenteditable="true"><br /></div>--%>
            <textarea rows="500" cols="50"  id="comitmentarea_ds3" name="comitmentareaDs3" style="height:80px;" contenteditable="true" wrap="virtual ">  </textarea>
        </div>
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
            <div style="clear:both;padding-left: 178px;">
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
            <div style="clear:both;padding-left: 178px;">
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
            <div style="clear:both;padding-left: 178px;">
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

</body>
</html>
