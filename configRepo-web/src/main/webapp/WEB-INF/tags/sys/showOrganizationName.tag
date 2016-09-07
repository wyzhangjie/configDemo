<%@ tag pageEncoding="UTF-8"%>
<%@ tag import="com.google.common.collect.Lists" %>
<%@ tag import="utils.SpringUtils" %>
<%@ tag import="com.framework.demo.service.sysOrganization.SysOrganizationService" %>
<%@ tag import="com.framework.demo.dto.sysOrganization.SysOrganization" %>
<%@ tag import="java.util.List" %>
<%@ attribute name="id" type="java.lang.Long" required="true" description="当前要展示的组织机构的名字" %>
<%@ attribute name="showParents" type="java.lang.Boolean" required="false" description="是否显示父亲 默认包含" %>
<%@ attribute name="includeRoot" type="java.lang.Boolean" required="false" description="是否包含根 默认true" %>
<%!private SysOrganizationService organizationService;%>
<%

    if(showParents == null) {
        showParents = true;
    }
    if(includeRoot == null) {
        includeRoot = true;
    }

    if(organizationService == null) {
        organizationService = SpringUtils.getBean(SysOrganizationService.class);
    }

    SysOrganization organization = organizationService.findById(id);

    if(organization == null) {
        out.write("<span class='label label-important'>删除的数据，请修改</span>");
        return;
    }

    List<String> names = Lists.newArrayList();
    if (organization != null) {
        names.add(organization.getName());

       /* if(showParents == true) {
            List<SysOrganization> parents = organizationService.findAncestor(organization.getParentIds());
            for(SysOrganization o : parents) {
                if(includeRoot == false && organization.isRoot()) {
                    continue;
                }
                names.add(o.getName());
            }
        }*//* if(showParents == true) {
            List<SysOrganization> parents = organizationService.findAncestor(organization.getParentIds());
            for(SysOrganization o : parents) {
                if(includeRoot == false && organization.isRoot()) {
                    continue;
                }
                names.add(o.getName());
            }
        }*/

    }

    StringBuilder s = new StringBuilder();
    s.append(String.format("<a class='btn btn-link no-padding' href='%s/admin/sys/organization/organization/%d'>", request.getContextPath(), id));

    for(int l = names.size() - 1, i = l; i >= 0; i--) {
        if(i != l) {
            s.append(" &gt; ");
        }
        s.append(names.get(i));
    }

    s.append("</a>");
    out.write(s.toString());

%>
