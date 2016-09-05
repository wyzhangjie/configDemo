<%@ tag import="com.framework.demo.utils.SpringUtils" %>
<%@ tag import="com.framework.demo.bo.sysRole.SysRole" %>
<%@ tag import="com.framework.demo.conf.service.sysRole.SysRoleService" %>
<%@ tag pageEncoding="UTF-8"%>
<%@ attribute name="id" type="java.lang.Long" required="true" description="当前要展示的组织机构的名字" %>
<%!private SysRoleService roleService;%>
<%

    if(roleService == null) {
        roleService = SpringUtils.getBean(SysRoleService.class);
    }

    SysRole role = roleService.findById(id);
    if(role == null) {
        out.write("<span class='label label-important'>删除的数据，请修改</span>");
        return;
    }

    StringBuilder s = new StringBuilder();
    s.append(String.format("<a class='btn btn-link no-padding' href='%s/admin/sys/permission/role/%d'>", request.getContextPath(), id));
    s.append(String.format("<span title='%s'>%s[%s]</span>", role.getDescription(), role.getName(), role.getRole()));
    s.append("</a>");
    out.write(s.toString());

%>
