<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf" %>
<es:contentHeader/>


<div class="panel">


  <form:form id="editForm" method="post" action="${ctx}/config/easydatagridmodify" commandName="m" cssClass="form-horizontal">
    <!--上一个地址 如果提交方式是get 需要加上-->
    <%--<es:BackURL hiddenInput="true"/>--%>

    <es:showGlobalError commandName="m"/>

    <%--<form:hidden path="pmenuName"/>--%>

    <div class="control-group">
      <form:label path="pmenuName" cssClass="control-label">母菜单名称</form:label>
      <form:hidden path="id"/>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="pmenuName" cssClass="validate[required]"  id="pmenuName0" >
          <form:options items="${pmenuName}"></form:options>
        </form:select>

      </div>
    </div>

    <div class="control-group">
      <form:label path="menuName" cssClass="control-label">新增菜单名称</form:label>
      <div class="controls">
        <form:input path="menuName" cssClass="validate[required]" placeholder="新增菜单名称" id="menuName0"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="kind" cssClass="control-label">图例类型</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="kind" cssClass="validate[required]" id="kind">
          <form:option value="easyuigrid">Datagrid</form:option>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>


    <div class="control-group">
      <form:label path="width" cssClass="control-label">宽度</form:label>
      <div class="controls">
        <form:input path="width" cssClass="validate[required]" placeholder="宽度[auto或数字如400]" id="width"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="height" cssClass="control-label">高度</form:label>
      <div class="controls">
        <form:input path="height" cssClass="validate[required]" placeholder="高度[auto或数字如400]" id="height"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="title" cssClass="control-label">标题</form:label>
      <div class="controls">
        <form:input path="title" cssClass="validate[required]" placeholder="标题" id="title"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="kind" cssClass="control-label">列宽自适应</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="fitColumns" cssClass="validate[required]" id="fitColumns">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="resizeHandle" cssClass="control-label">可拖动边</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="resizeHandle" cssClass="validate[required]" id="resizeHandle">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="autoRowHeight" cssClass="control-label">自适应行高</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="autoRowHeight" cssClass="validate[required]" id="autoRowHeight">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>
    <div class="control-group">
      <form:label path="stripe" cssClass="control-label">是否带条纹</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="stripe" cssClass="validate[required]" id="stripe">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="method" cssClass="control-label">提交方法</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="method" cssClass="validate[required]" id="method">
          <form:option value="post" label="POST"></form:option>
          <form:option value="get" label="GET"></form:option>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>
    <div class="control-group">
      <form:label path="nowrap" cssClass="control-label">是否带条纹</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="nowrap" cssClass="validate[required]" id="nowrap">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="idField" cssClass="control-label">id字段名称</form:label>
      <div class="controls">
        <form:input path="idField" placeholder="id字段名称" id="idField"/>
      </div>
    </div>
    <div class="control-group">
      <form:label path="url" cssClass="control-label">提交链接</form:label>
      <div class="controls">
        <form:input path="url" cssClass="validate[required]" placeholder="提交链接" id="url"/>
      </div>
    </div>
    <div class="control-group">
      <form:label path="loadMsg" cssClass="control-label">后台提交时的提示语</form:label>
      <div class="controls">
        <form:input path="loadMsg" cssClass="validate[required]" placeholder="后台提交时的提示语" id="loadMsg"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="pagination" cssClass="control-label">是否显示分页栏</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="pagination" cssClass="validate[required]" id="pagination">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="pagination" cssClass="control-label">是否显示行号</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="rownumbers" cssClass="validate[required]" id="rownumbers">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="singleSelect" cssClass="control-label">是否行单选</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="singleSelect" cssClass="validate[required]" id="singleSelect">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>
    <div class="control-group">
      <form:label path="ctrlSelect" cssClass="control-label">是否ctr控制多选</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="ctrlSelect" cssClass="validate[required]" id="ctrlSelect">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>
    <div class="control-group">
      <form:label path="selectOnCheck" cssClass="control-label">点击行选中checkbox</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="selectOnCheck"  id="selectOnCheck">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"></form:options>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="pagePosition" cssClass="control-label">页信息显示位置</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="pagePosition" cssClass="validate[required]" id="pagePosition">
          <form:option value="bottom" selected="selected">bottom</form:option>
          <form:option value="both">both</form:option>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="pageSize" cssClass="control-label">页大小</form:label>
      <div class="controls">
        <form:input path="pageSize" cssClass="validate[required]" placeholder="页大小" id="pageSize"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="pageList" cssClass="control-label">页列表信息</form:label>
      <div class="controls">
        <form:input path="pageList" cssClass="validate[required]" placeholder="页列表信息" id="pageList"/>
      </div>
    </div>


    <div class="control-group">
      <form:label path="sortName" cssClass="control-label">可排序列</form:label>
      <div class="controls">
        <form:input path="sortName" cssClass="validate[required]" placeholder="可排序列" id="sortName"/>
      </div>
    </div>

    <div class="control-group">
      <form:label path="sortOrder" cssClass="control-label">排序方式</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="sortOrder" cssClass="validate[required]" id="sortOrder">
          <form:option value="desc" selected="selected">降序</form:option>
          <form:option value="asc">升序</form:option>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="multiSort" cssClass="control-label">是否支持多列排序</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="multiSort" cssClass="validate[required]" id="multiSort">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>

    <div class="control-group">
      <form:label path="remoteSort" cssClass="control-label">服务端是否排序</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:select path="remoteSort" cssClass="validate[required]" id="remoteSort">
          <form:options items="${boolean}"  itemLabel="info" itemValue="value"  ></form:options>
          <%--  <form:options items="${kind}"></form:options>--%>
        </form:select>
      </div>
    </div>
    <div class="control-group " id="param">
      <form:label path="param" cssClass="control-label">预显示字段及中文名</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="param" cols="500" rows="10" id="param" style="width: 70%"/>
      </div>
    </div>
    <div class="control-group sql" id="sql">
      <form:label path="sql" cssClass="control-label">查询sql</form:label>
      <div class="controls">
          <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
        <form:textarea path="sql" cols="500" rows="10" style="width: 70%" />
      </div>
    </div>


    <div class="control-group">
      <!-- Button -->
      <button type="submit" id="btn" class="  center">
        提交
      </button>
    </div>
  </form:form>
</div>

<es:contentFooterforEasyUi/>