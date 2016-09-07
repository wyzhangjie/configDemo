<%@ tag import="utils.SpringUtils" %>
<%@ tag import="com.framework.demo.sys.sysGroup.bo.SysGroup" %>
<%@ tag import="com.framework.demo.service.sys.sysGroup.service.SysGroupService" %>
<%@ tag pageEncoding="UTF-8"%>
<%@ attribute name="id" type="java.lang.Long" required="true" description="当前要展示的用户的id" %>
<%!private SysGroupService groupService;%>
<%

    if(groupService == null) {
        groupService = SpringUtils.getBean(SysGroupService.class);
    }

    SysGroup group = groupService.findById(id);

    if(group == null) {
        out.write("<span class='label label-important'>删除的数据，请修改</span>");
        return;
    }

    StringBuilder s = new StringBuilder();
    s.append(String.format("<a class='btn btn-link no-padding' href='%s/admin/sys/group/%d'>", request.getContextPath(), id));
    s.append(group.getName());
    s.append("</a>");
    out.write(s.toString());
%>
