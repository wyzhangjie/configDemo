package com.framework.demo.web.controller.user;

import cn.vansky.framework.common.util.DateUtil;
import cn.vansky.framework.core.util.JsonResp;
import cn.vansky.framework.core.web.controller.RandomImageController;
import cn.vansky.framework.core.web.easyUI.model.EasyUITreeModel;
import cn.vansky.framework.core.web.easyUI.service.EasyUITreeService;
import cn.vansky.framework.core.web.filter.auth.AuthWrapper;
import cn.vansky.framework.core.web.filter.auth.GeneralAuthWrapper;
import cn.vansky.security.ISecurity;
import cn.vansky.security.single.MD5;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.user.SysUser;
import com.framework.demo.dto.user.UserDto;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.sysuser.SysUserService;
import com.framework.demo.vo.user.UserPageVo;
import com.framework.demo.web.controller.AbstractController;
import io.netty.handler.codec.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/12
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends AbstractController {

    @Resource(name = "sysUserService")
    SysUserService sysUserService;



    @Resource(name = "menuService")
    MenuService menuService;

    @Resource(name = "easyUITreeService")
    EasyUITreeService easyUITreeService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,@RequestParam("validateCode") String validateCode,HttpServletRequest httpRequest) {
     //验证码
        String valideCode = httpRequest.getSession().getAttribute(RandomImageController.LOGIN_VALIDATE_STRING).toString();
      if(!validateCode.equalsIgnoreCase(valideCode)){
          return JsonResp.asData().error("验证码出错").toJson();
      }
        ISecurity security = new MD5();
        Map<String, Object> m = new HashMap<String, Object>(2);
        m.put("userName", username);
        m.put("userPassword", security.encryptToBase64(password));
        SysUser user = sysUserService.findUserByMap(m);
        if (null != user) {
            List<Menu> allList;
            if("root".equalsIgnoreCase(username)){
                allList   =    menuService.findAll();
            }else{
                //菜单数据加载
                allList = menuService.findAuthWrapper(user.getUserid());
            }


            if(allList.size()!=0){
                AuthWrapper authWrapper = new AuthWrapper();
                List<Object> l = easyUITreeService.findChildren(allList, new EasyUITreeService.ModelCall<Menu>() {
                    @Override
                    public EasyUITreeModel convert(Menu o) {
                        EasyUITreeModel model = new EasyUITreeModel();
                        model.setId(o.getId());
                        model.setText(o.getName());
                        model.setUrl(o.getPath());
                        model.setPid(o.getParentId());
                        model.setOpen(false);
                        return model;
                    }
                });
                authWrapper.setMenuList(l);
                if (allList != null && !allList.isEmpty()) {
                    return JsonResp.asList().addAll(authWrapper.getMenuList()).toJson();
                }
                httpRequest.getSession().setAttribute("username",username);
            }
            return JsonResp.asEmpty().error("没有菜单,请找管理员").toJson();
        }
        return JsonResp.asData().error("用户名或密码错误").toJson();
    }




    @ResponseBody
    @RequestMapping(value = "/menu")
    public String menu(@RequestParam("username") String username,HttpServletRequest httpRequest) {
        //验证码

        SysUser user = sysUserService.findUserByName(username);
        if (null != user) {
            List<Menu> allList;
            if("root".equalsIgnoreCase(username)){
                allList   =    menuService.findAll();
            }else{
                //菜单数据加载
                allList = menuService.findAuthWrapper(user.getUserid());
            }


            if(allList.size()!=0){
                AuthWrapper authWrapper = new AuthWrapper();
                List<Object> l = easyUITreeService.findChildren(allList, new EasyUITreeService.ModelCall<Menu>() {
                    @Override
                    public EasyUITreeModel convert(Menu o) {
                        EasyUITreeModel model = new EasyUITreeModel();
                        model.setId(o.getId());
                        model.setText(o.getName());
                        model.setUrl(o.getPath());
                        model.setPid(o.getParentId());
                        model.setOpen(false);
                        return model;
                    }
                });
                authWrapper.setMenuList(l);
                if (allList != null && !allList.isEmpty()) {
                    return JsonResp.asList().addAll(authWrapper.getMenuList()).toJson();
                }
                httpRequest.getSession().setAttribute("username",username);
            }
            return JsonResp.asEmpty().error("没有菜单,请找管理员").toJson();
        }
        return JsonResp.asData().error("用户名或密码错误").toJson();
    }




    public static void main(String[] args){
        ISecurity security = new MD5();
        System.out.println(security.encryptToBase64("123456"));
    }
}
