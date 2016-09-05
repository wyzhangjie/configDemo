<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%--<%@ include file="../../common/taglib.jsp" %>--%>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf" %>
<es:contentHeader/>

<div class="panel">


  <form:form id="editForm" method="post" action="${ctx}/config/jqgridCreate" commandName="m" cssClass="form-horizontal">
    <!--上一个地址 如果提交方式是get 需要加上-->
    <%--<es:BackURL hiddenInput="true"/>--%>

    <es:showGlobalError commandName="m"/>
    <%--<form:hidden path="pmenuName"/>--%>

    <div class="control-group">
      <form:label path="pmenuName" cssClass="control-label" >母菜单名称</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="pmenuName" cssClass="validate[required]"  id="pmenuName1" >
          <form:option label="请选择" value=""/>
          <form:options items="${pmenuName}" ></form:options>
        </form:select>
      </div>
    </div>


    <div class="control-group">
      <form:label path="menuName" cssClass="control-label">新增菜单名称</form:label>
      <div class="controls">
        <form:input path="menuName" cssClass="validate[required]" placeholder="新增菜单名称" id="menuName1"/>
      </div>
    </div>


    <div class="control-group">
      <form:label path="pmenuName" cssClass="control-label">表数量</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="tablenum" cssClass="validate[required]"  id="tablenum" >
          <form:option label="请选择" value=""/>
          <form:option label="1" value="1"/>
          <form:option label="2" value="2"/>
          <form:option label="3" value="3"/>
          <form:option label="4" value="4"/>
          <form:option label="5" value="5"/>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="reportKind" cssClass="control-label">报表类型</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="reportKind" cssClass="validate[required]"  id="report_kind" name="reportKind">
          <form:option label="请选择" value=""/>
          <form:options  items="${reportKind}"  itemLabel="value" itemValue="code"  ></form:options>
          <%-- <form:options items="${reportKind}" ></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="realtime" cssClass="control-label">是否实时(realtime)</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="realtime" cssClass="validate[required]">
          <form:option label="请选择" value=""/>
          <form:options items="${realtime}"  itemLabel="value" itemValue="code"  ></form:options>
          <%--      <form:options items="${realtime}" ></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="timetype" cssClass="control-label">时间类型</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="timetype" cssClass="validate[required]">
          <form:option label="请选择" value=""/>
          <form:options items="${timetype}" itemLabel="value" itemValue="code"  ></form:options>
          <%-- <form:options items="${timetype}" ></form:options>--%>
        </form:select>
      </div>
    </div>


    <div class="control-group">
      <form:label path="otherNumJq" cssClass="control-label">多维度项数</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="otherNumJq" cssClass="validate[required]" id="other_num_jq">
          <form:option label="请选择" value=""/>
          <form:option label="1" value="1"/>
          <form:option label="2" value="2"/>
          <form:option label="3" value="3"/>
          <form:option label="4" value="4"/>
          <form:option label="5" value="5"/>
        </form:select>
      </div>
    </div>

    <div class="control-group other_1_jq" id="other_1_jq" >
      <form:label path="option1" cssClass="control-label">条件1:sql</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="sql1" cols="500" rows="10" style="width: 70%"/>
      </div>
    </div>
    <div class="control-group other_2_jq" id="other_2_jq">
      <form:label path="sql2" cssClass="control-label">条件2:sql</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="sql2" cols="500" rows="10" style="width: 70%"/>
      </div>
    </div>
    <div class="control-group other_3_jq" id="other_3_jq">
      <form:label path="sql3" cssClass="control-label">条件3:sql</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="sql3" cols="500" rows="10" style="width: 70%" />
      </div>
    </div>
    <div class="control-group other_4_jq" id="other_4_jq">
      <form:label path="sql4" cssClass="control-label">条件4:sql</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="sql4" cols="500" rows="10" style="width: 70%"/>
      </div>
    </div>
    <div class="control-group other_5_jq" id="other_5_jq">
      <form:label path="sql5" cssClass="control-label">条件5:sql</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="sql5" cols="500" rows="10" style="width: 70%"/>
      </div>
    </div>
    <div id="data1">
    <%--表格信息--%>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="title1" cssClass="control-label" >图表名称</form:label>
      <div class="controls">
        <form:input path="title1"  placeholder="新增表格一图表名称" id="subtitle" />

      </div>
    </div>

    <div class="control-group other_5_jq" id="jqparam1">
      <form:label path="param1" cssClass="control-label">预显示字段及中文名</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="param1" cols="500" rows="10" id="param1 "/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="datasql1" cssClass="control-label">请输入sql(带{pt})</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="datasql1" id="datasql1" name="datasql1" cols="500" rows="10" style="width: 70%"/>

      </div>
    </div>
    <div class="control-group">
      <form:label path="comitmentareaDs1" cssClass="control-label">图表注释信息</form:label>
      <div class="controls" >
        <form:textarea path="comitmentareaDs1" id="comitmentarea_ds1" cols="500" rows="10" style="width: 70%" />
      </div>
    </div>

    <div class="control-group col1">
      <form:label path="iscolor1" cssClass="control-label">是否配置颜色</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="iscolor1" cssClass="validate[required]" id="iscolor1">
          <form:option label="请选择" value=""/>
          <form:option label="是" value="是"/>
          <form:option label="否" value="否"/>
        </form:select>
      </div>
    </div>


    <div class="control-group col1_1">
      <form:label path="col1_data_1_from" cssClass="control-label">数据区间1：</form:label>
      <div class="controls">
        <form:input path="col1_data_1_from"  placeholder="从" id="col1_data_1_from"/>
        -
        <form:input path="col1_data_1_to" placeholder="到" id="col1_data_1_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col1_cols_1" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col1_cols_1"  placeholder="第一段颜色" id="col1_cols_1" />
        <span id="picker1_1"></span>
      </div>
    </div>

    <div class="control-group col1_2">
      <form:label path="col1_data_2_from" cssClass="control-label">数据区间2：</form:label>
      <div class="controls">
        <form:input path="col1_data_2_from"  placeholder="从" id="col1_data_2_from"/>
        -
        <form:input path="col1_data_2_to"  placeholder="到" id="col1_data_2_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col1_cols_2" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col1_cols_2"  placeholder="第二段颜色" id="col1_cols_2" />
        <span id="picker1_2"></span>
      </div>
    </div>

    <div class="control-group col1_3">
      <form:label path="col1_data_3_from" cssClass="control-label">数据区间3：</form:label>
      <div class="controls">
        <form:input path="col1_data_3_from"  placeholder="从" id="col1_data_3_from"/>
        -
        <form:input path="col1_data_3_to"  placeholder="到" id="col1_data_3_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col1_cols_3" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col1_cols_3"  placeholder="第三段颜色" id="col1_cols_3" />
        <span id="picker1_3"></span>
      </div>
    </div>
</div>
    <div id="data2">
    <div class="control-group">

      <!-- Text input-->
      <form:label path="title2" cssClass="control-label" >图表名称</form:label>
      <div class="controls">
        <form:input path="title2"  placeholder="新增表格二图表名称" id="subtitle" />

      </div>
    </div>

    <div class="control-group other_5_jq" id="jqparam2">
      <form:label path="param2" cssClass="control-label">预显示字段及中文名</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="param2" cols="500" rows="10" id="param2"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="datasql2" cssClass="control-label">请输入sql(带{pt})</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="datasql2" id="datasql2" name="datasql2" cols="500" rows="10" />

      </div>
    </div>
    <div class="control-group">
      <form:label path="comitmentareaDs2" cssClass="control-label">图表注释信息</form:label>
      <div class="controls">
        <form:textarea path="comitmentareaDs2" id="comitmentarea_ds2" cols="500" rows="10" />
      </div>
    </div>

    <div class="control-group col1">
      <form:label path="iscolor2" cssClass="control-label">是否配置颜色</form:label>
      <div class="controls">
        <form:select path="iscolor2" cssClass="validate[required]" id="iscolor2">
          <form:option label="请选择" value=""/>
          <form:option label="是" value="是"/>
          <form:option label="否" value="否"/>
        </form:select>
      </div>
    </div>


    <div class="control-group col1_1">
      <form:label path="col2_data_1_from" cssClass="control-label">数据区间1：</form:label>
      <div class="controls">
        <form:input path="col2_data_1_from"  placeholder="从" id="col2_data_1_from"/>
        -
        <form:input path="col2_data_1_to" placeholder="到" id="col2_data_1_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col2_cols_1" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="title1"  placeholder="第一段颜色" id="col2_cols_1" />
        <span id="picker2_1"></span>
      </div>
    </div>

    <div class="control-group col2_2">
      <form:label path="col2_data_2_from" cssClass="control-label">数据区间2：</form:label>
      <div class="controls">
        <form:input path="col2_data_2_from"  placeholder="从" id="col2_data_2_from"/>
        -
        <form:input path="col2_data_2_to"  placeholder="到" id="col2_data_2_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col2_cols_2" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col2_cols_2"  placeholder="第二段颜色" id="col2_cols_2" />
        <span id="picker2_2"></span>
      </div>
    </div>

    <div class="control-group col2_3">
      <form:label path="col2_data_3_from" cssClass="control-label">数据区间3：</form:label>
      <div class="controls">
        <form:input path="col2_data_3_from"  placeholder="从" id="col2_data_3_from"/>
        -
        <form:input path="col2_data_3_to"  placeholder="到" id="col2_data_3_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col2_cols_3" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col2_cols_3"  placeholder="第三段颜色" id="col2_cols_3" />
        <span id="picker2_3"></span>
      </div>
    </div>
</div>
    <div id="data3">
    <div class="control-group">

      <!-- Text input-->
      <form:label path="title3" cssClass="control-label" >图表名称</form:label>
      <div class="controls">
        <form:input path="title3"  placeholder="新增表格三图表名称" id="subtitle" />

      </div>
    </div>

    <div class="control-group " id="jqparam3">
      <form:label path="param3" cssClass="control-label">预显示字段及中文名</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="param3" cols="500" rows="10" id="param3"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="datasql3" cssClass="control-label">请输入sql(带{pt})</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="datasql3" id="datasql3" name="datasql3" cols="500" rows="10" style="width: 70%" />

      </div>
    </div>
    <div class="control-group">
      <form:label path="comitmentareaDs3" cssClass="control-label">图表注释信息</form:label>
      <div class="controls">
        <form:textarea path="comitmentareaDs3" id="comitmentarea_ds3" cols="500" rows="10" style="width: 70%"/>
      </div>
    </div>

    <div class="control-group ">
      <form:label path="iscolor3" cssClass="control-label">是否配置颜色</form:label>
      <div class="controls">
        <form:select path="iscolor3" cssClass="validate[required]" id="iscolor3">
          <form:option label="请选择" value=""/>
          <form:option label="是" value="是"/>
          <form:option label="否" value="否"/>
        </form:select>
      </div>
    </div>


    <div class="control-group ">
      <form:label path="col3_data_1_from" cssClass="control-label">数据区间1：</form:label>
      <div class="controls">
        <form:input path="col3_data_1_from"  placeholder="从" id="col3_data_1_from"/>
        -
        <form:input path="col3_data_1_to" placeholder="到" id="col3_data_1_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col3_cols_1" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="title1"  placeholder="第一段颜色" id="col3_cols_1" />
        <span id="picker3_1"></span>
      </div>
    </div>

    <div class="control-group col3_2">
      <form:label path="col3_data_2_from" cssClass="control-label">数据区间2：</form:label>
      <div class="controls">
        <form:input path="col3_data_2_from"  placeholder="从" id="col3_data_2_from"/>
        -
        <form:input path="col3_data_2_to"  placeholder="到" id="col3_data_2_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col3_cols_2" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col3_cols_2"  placeholder="第二段颜色" id="col3_cols_2" />
        <span id="picker3_2"></span>
      </div>
    </div>

    <div class="control-group col3_3">
      <form:label path="col3_data_3_from" cssClass="control-label">数据区间3：</form:label>
      <div class="controls">
        <form:input path="col3_data_3_from"  placeholder="从" id="col3_data_3_from"/>
        -
        <form:input path="col3_data_3_to"  placeholder="到" id="col3_data_3_to"/>
      </div>
    </div>
    <div class="control-group">

      <!-- Text input-->
      <form:label path="col3_cols_3" cssClass="control-label" >颜色</form:label>
      <div class="controls">
        <form:input path="col3_cols_3"  placeholder="第三段颜色" id="col3_cols_3" />
        <span id="picker3_3"></span>
      </div>
    </div>
</div>
    <div class="control-group ">
      <!-- Button -->
      <button type="submit" class="btn center">
        提交
      </button>
    </div>
  </form:form>
</div>


<es:contentFooterforjq/>