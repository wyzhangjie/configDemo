<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>用户列表</title>
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <b>关键字：</b>
            <input class="easyui-textbox" type="text" id="keyword" name="keyword" data-options="prompt:'用户名/姓名'" size="30" />
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="doAdd()">新增</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdit()">编辑</a>
        </div>
        <div id="a" class="easyui-window" title="新增用户" data-options="closed:true," style="top:120px;width:300px;height:350px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="f" class="easyui-form">
                        <table cellpadding="5">
                            <tr>
                                <td>用户名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>密码:</td>
                                <td><input class="easyui-textbox" type="password" id="password" name="password" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>确认密码:</td>
                                <td><input class="easyui-textbox" type="password" name="rePassword" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>邮箱:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="validType:'email'"/></td>
                            </tr>
                            <tr>
                                <td>手机号:</td>
                                <td><input class="easyui-textbox" type="text" name="phone" data-options="validType:'mobile'"/></td>
                            </tr>
                            <tr>
                                <td>性别:</td>
                                <td><input class="easyui-combobox" id="aSex" name="sex"/></td>
                            </tr>
                            <tr>
                                <td>角色:</td>
                                <td><input class="easyui-combobox" id="aRoleId" name="roleId"></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#f'), 'add_user', $('#a'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#a'));clearForm($('#f'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
        <div id="e" class="easyui-window" title="编辑用户" data-options="closed:true," style="width:300px;height:300px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="ef" class="easyui-form">
                        <table cellpadding="5">
                            <input type="hidden" name="id"/>
                            <tr>
                                <td>用户名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>邮箱:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="validType:'email'"/></td>
                            </tr>
                            <tr>
                                <td>手机号:</td>
                                <td><input class="easyui-textbox" type="text" name="phone" data-options="validType:'mobile'"/></td>
                            </tr>
                            <tr>
                                <td>性别:</td>
                                <td><input class="easyui-combobox" id="eSex" name="sex"/></td>
                            </tr>
                            <tr>
                                <td>角色:</td>
                                <td><input class="easyui-combobox" id="eRoleId" name="roleId"></td>
                            </tr>
                            <tr>
                                <td>状态:</td>
                                <td><input class="easyui-combobox" id="eStatus" name="status"></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#ef'), 'edit_user', $('#e'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#e'));clearForm($('#ef'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/user/model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/user/action.js"></script>