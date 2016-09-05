<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%--<%@ include file="../../common/taglib.jsp" %>--%>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf" %>
<es:contentHeader/>


<div class="panel">


    <form:form id="editForm" method="post"  action="${ctx}/config/echartsCreate" commandName="m" cssClass="form-horizontal">
        <!--上一个地址 如果提交方式是get 需要加上-->
        <%--<es:BackURL hiddenInput="true"/>--%>

        <es:showGlobalError commandName="m"/>
        <%--<form:hidden path="pmenuName"/>--%>

        <div class="control-group">
            <form:label path="pmenuName" cssClass="control-label">母菜单名称</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:select path="pmenuName" cssClass="validate[required]"  id="pmenuName0" >
                    <form:option label="请选择" value=""/>
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

            <!-- Text input-->
            <form:label path="legend" cssClass="control-label" id="legend"  >图例（legend）</form:label>
            <div class="controls">
                <form:input path="legend" cssClass="validate[required]" placeholder="图例"/>

            </div>
        </div>



        <div class="control-group">
            <form:label path="kind" cssClass="control-label">图例类型</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:select path="kind" cssClass="validate[required]" id="kind">
                    <form:option label="请选择" value=""/>
                    <form:options items="${kind}"  itemLabel="value" itemValue="code"  ></form:options>
                    <%--  <form:options items="${kind}"></form:options>--%>
                </form:select>
            </div>
        </div>

        <div class="control-group">

            <!-- Text input-->
            <form:label path="catalog" cssClass="control-label" >横坐标（category）</form:label>
            <div class="controls">
                <form:input path="catalog"  placeholder="横坐标（category）" id="catalog"/>

            </div>
        </div>

        <div class="control-group">

            <!-- Text input-->
            <form:label path="stack" cssClass="control-label" >是否合并</form:label>
            <div class="controls">
                <form:input path="stack"  placeholder="不合并不用填写" id="stack" />

            </div>
        </div>
        <div class="control-group">

            <!-- Text input-->
            <form:label path="title" cssClass="control-label" >图形主标题</form:label>
            <div class="controls">
                <form:input path="title"  placeholder="图形主标题" id="title"/>

            </div>
        </div>
        <div class="control-group">

            <!-- Text input-->
            <form:label path="subtitle" cssClass="control-label" >图形的副标题</form:label>
            <div class="controls">
                <form:input path="subtitle"  placeholder="图形的副标题" id="subtitle" />

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
            <form:label path="ispercent" cssClass="control-label">是否包含百分号</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:select path="ispercent" cssClass="validate[required]">
                    <form:option label="请选择" value=""/>
                    <form:options items="${ispercent}" itemLabel="value" itemValue="code"  ></form:options>
                    <%-- <form:options items="${ispercent}" ></form:options--%>>
                </form:select>
            </div>
        </div>

        <div class="control-group">
            <form:label path="maxandmin" cssClass="control-label">最大值和最小值配置</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:select path="maxandmin" cssClass="validate[required]">
                    <form:option label="请选择" value=""/>
                    <form:options items="${maxandmin}"  itemLabel="value" itemValue="code"  ></form:options>
                    <%--<form:options items="${maxandmin}"></form:options>--%>
                </form:select>
            </div>
        </div>
        <div class="control-group">
            <form:label path="average" cssClass="control-label">平均值配置</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:select path="average" cssClass="validate[required]">
                    <form:option label="请选择" value=""/>
                    <form:options items="${average}" itemLabel="value" itemValue="code" ></form:options>
                    <%--  <form:options items="${average}" ></form:options>--%>
                </form:select>
            </div>
        </div>

        <div class="control-group">
            <form:label path="othernum" cssClass="control-label">多维度项数</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:select path="othernum" cssClass="validate[required]" id="other_num">
                    <form:option label="请选择" value=""/>
                    <form:option label="1" value="1"/>
                    <form:option label="2" value="2"/>
                    <form:option label="3" value="3"/>
                    <form:option label="4" value="4"/>
                    <form:option label="5" value="5"/>
                </form:select>
            </div>
        </div>
        <div class="control-group other_1" id="other_1" >
            <form:label path="option1" cssClass="control-label">条件1:sql</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:textarea path="option1" cols="500" rows="10"  />
            </div>
        </div>
        <div class="control-group other_2" id="other_2">
            <form:label path="option2" cssClass="control-label">条件2:sql</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:textarea path="option2" cols="500" rows="10" />
            </div>
        </div>
        <div class="control-group other_3" id="other_3">
            <form:label path="option3" cssClass="control-label">条件3:sql</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:textarea path="option3" cols="500" rows="10" />
            </div>
        </div>
        <div class="control-group other_4" id="other_4">
            <form:label path="option4" cssClass="control-label">条件4:sql</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:textarea path="option4" cols="500" rows="10" />
            </div>
        </div>
        <div class="control-group other_5" id="other_5">
            <form:label path="option5" cssClass="control-label">条件5:sql</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:textarea path="option5" cols="500" rows="10" />
            </div>
        </div>

        <div class="control-group">
            <form:label path="timersql" cssClass="control-label">请输入sql(带{pt})</form:label>
            <div class="controls">
                    <%--  <form:input path="name" cssClass="validate[required,custom[username],ajax[ajaxNameCall]]" placeholder="5到10个字母、数字、下划线"/>--%>
                <form:textarea path="timersql" id="timersql" name="timersql" cols="500" rows="10" style="width: 70%" />

            </div>
        </div>
        <div class="control-group">
            <form:label path="comitment" cssClass="control-label">图表注释信息</form:label>
            <div class="controls">
                <form:textarea path="comitment" id="comitmentarea" cols="500" rows="10" style="width: 70%" />


            </div>
        </div>

        <div class="control-group divsql2">
            <!-- Button -->
            <button type="submit" class="btn center">
                提交
            </button>
        </div>
    </form:form>
</div>

<es:contentFooter/>