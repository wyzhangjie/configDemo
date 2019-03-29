package com.framework.demo.web.controller.user;

import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sysuser.SysUserService;
import com.framework.demo.web.bind.annotation.CurrentUser;
import com.framework.demo.common.Constants;
import com.github.fartherp.framework.core.web.easyUI.model.EasyUITreeModel;
import com.github.fartherp.framework.core.web.easyUI.service.EasyUITreeService;
import com.github.fartherp.framework.core.web.filter.auth.AuthWrapper;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Auth: CK
 * Date: 2016/5/12
 */

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Resource(name = "sysUserService")
    SysUserService sysUserService;

    @Resource(name = "sysAuthService")
    SysAuthService sysAuthService;
    @Autowired
    private MessageSource messageSource;

    @Resource(name = "menuService")
    MenuService menuService;

    @Resource(name = "easyUITreeService")

    EasyUITreeService easyUITreeService;


    @RequestMapping(value = {"/login"})
    public String login(
            ModelMap model,
            @CurrentUser SysUser user,
            HttpServletRequest request) {
        //表示退出
        if (!StringUtils.isEmpty(request.getParameter("logout"))) {
            model.addAttribute(Constants.MESSAGE, messageSource.getMessage("user.logout.success", null, null));
        }

        //表示用户删除了 @see org.apache.shiro.web.filter.user.SysUserFilter
        if (!StringUtils.isEmpty(request.getParameter("notfound"))) {
            model.addAttribute(Constants.ERROR, messageSource.getMessage("user.notfound", null, null));
        }

        //表示用户被管理员强制退出
        if (!StringUtils.isEmpty(request.getParameter("forcelogout"))) {
            model.addAttribute(Constants.ERROR, messageSource.getMessage("user.forcelogout", null, null));
        }



        //表示用户锁定了 @see org.apache.shiro.web.filter.
        // user.SysUserFilter
        if (!StringUtils.isEmpty(request.getParameter("blocked"))) {
            //     String reason = userStatusHistoryService.getLastReason(user);
            model.addAttribute(Constants.ERROR, messageSource.getMessage("user.blocked", new Object[]{"被锁定"}, null));
        }

        if (!StringUtils.isEmpty(request.getParameter("unknown"))) {
            model.addAttribute(Constants.ERROR, messageSource.getMessage("user.unknown.error", null, null));
        }

        //登录失败了 提取错误消息
        Exception shiroLoginFailureEx =
                (Exception) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        if (shiroLoginFailureEx != null) {
            model.addAttribute(Constants.ERROR, shiroLoginFailureEx.getMessage());
        }

        //如果用户直接到登录页面 先退出一下
        //原因：isAccessAllowed实现是subject.isAuthenticated()---->即如果用户验证通过 就允许访问
        // 这样会导致登录一直死循环
        Subject subject = SecurityUtils.getSubject();
        if (subject != null && subject.isAuthenticated()) {
            subject.logout();
        }
        //如果同时存在错误消息 和 普通消息  只保留错误消息
        if (model.containsAttribute(Constants.ERROR)) {
            model.remove(Constants.MESSAGE);
        }
        return "login";
    }

    @RequestMapping(value = {"/{index}"})
    public String index(@CurrentUser SysUser user, Model model,ServletRequest request) throws InvocationTargetException, IllegalAccessException {
        if(user==null||user.getUsername()==null){
            return "redirect:/user/login";
        }
        List<Menu> allList =  menuService.findAuthSource(user);
        converToMenu(user, model, allList);
        return "index/index";
    }



    private void converToMenu(@CurrentUser SysUser user, Model model, List<Menu> allList) {
        if(allList.size()!=0){
            AuthWrapper authWrapper = new AuthWrapper();
            EasyUITreeModel easyUITreeModel = new EasyUITreeModel();
            List<Object> l = easyUITreeService.findChildren(allList,()

                  );

            authWrapper.setMenuList(l);
          //  model.addAttribute("menus", JSON.toJSONString(authWrapper));
            easyUITreeModel.setId(o.getId());
            easyUITreeModel.setText(o.getName());
            easyUITreeModel.setUrl(o.getPath());
            easyUITreeModel.setPid(Integer.parseInt(o.getParentId().toString()));
            easyUITreeModel.setOpen(false);



            model.addAttribute("menus", authWrapper.getMenuList());
            model.addAttribute("username", user.getUsername());
        }
    }
}
