/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.resource.web.controller;


import cn.vansky.framework.core.orm.mybatis.plugin.search.enums.BooleanEnum;
import cn.vansky.framework.core.orm.mybatis.plugin.search.enums.SearchOperator;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.tree.bo.Treeable;
import cn.vansky.framework.tree.convert.ConvertTool;
import cn.vansky.framework.tree.convert.ZtreeConvertTool;
import cn.vansky.framework.tree.model.ztree.SimpleZtree;
import cn.vansky.framework.tree.model.ztree.Ztree;
import cn.vansky.framework.tree.service.BaseTreeableService;
import com.google.common.collect.Lists;
import com.framework.demo.common.Constants;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.framework.demo.web.bind.annotation.PageableDefaults;
import com.framework.demo.web.controller.BaseController;
import com.framework.demo.web.controller.permission.PermissionList;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
/**
 * <p>User: hyssop
 * <p>Date: 13-2-22 下午4:15
 * <p>Version: 1.0
 */
public abstract class BaseTreeableController<T extends BaseTreeableService, M extends Treeable<ID>, ID  extends Serializable>
        extends BaseController {

    protected T baseService;

    protected PermissionList permissionList = null;

    public void setResourceIdentity(String resourceIdentity) {
        if (!StringUtils.isEmpty(resourceIdentity)) {
            permissionList = PermissionList.newPermissionList(resourceIdentity);
        }
    }
    protected void setCommonData(Model model) {
        model.addAttribute("booleanList", BooleanEnum.values());
    }
    @RequestMapping(value = {"", "main"}, method = RequestMethod.GET)
    public String main() {

        if (permissionList != null) {
            permissionList.assertHasViewPermission();
        }

        return viewName("main");
    }

    @RequestMapping(value = "tree", method = RequestMethod.GET)
    @PageableDefaults(sort = {"parent_ids=asc", "weight=asc"})
    public String tree(
            HttpServletRequest request,
            @RequestParam(value = "searchName", required = false) String searchName,
            @RequestParam(value = "async", required = false, defaultValue = "false") boolean async,
            Searchable searchable, Model model) throws InvocationTargetException, IllegalAccessException {

        if (permissionList != null) {
            permissionList.assertHasViewPermission();
        }

        List<M> models = null;

        if (!StringUtils.isEmpty(searchName)) {
            searchable.addSearchParam("name_like", searchName);
            models = this.baseService.findBySearchable(searchable).getContent();
            if (!async) { //非异步 查自己和子子孙孙
                searchable.removeSearchFilter("name_like");
                List<M> children = baseService.findChildren(models, searchable);
                models.removeAll(children);
                models.addAll(children);
            } else { //异步模式只查自己

            }
        } else {
            if (!async) {  //非异步 查自己和子子孙孙
                models = this.baseService.findBySearchable(searchable).getContent();
            } else {  //异步模式只查根 和 根一级节点
                models = this.baseService.findRootAndChild(searchable);
            }
        }
        model.addAttribute("trees",
                convertToSimpleZtreeList(
                        models,
                        async,
                        true));

        return viewName("tree");
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String view(@PathVariable("id") M m, Model model) {
        if (permissionList != null) {
            permissionList.assertHasViewPermission();
        }
        setCommonData(model);
        model.addAttribute("m", m);
        model.addAttribute(Constants.OP_NAME, "查看");
        return viewName("editForm");
    }

    @RequestMapping(value = "{id}/update", method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") M m, Model model, RedirectAttributes redirectAttributes) {

        if (permissionList != null) {
            permissionList.assertHasUpdatePermission();
        }
        if (m == null) {
            redirectAttributes.addFlashAttribute(Constants.ERROR, "您修改的数据不存在！");
            return redirectToUrl(viewName("success"));
        }
        setCommonData(model);
        model.addAttribute("m", m);
        model.addAttribute(Constants.OP_NAME, "修改");
        return viewName("editForm");
    }

    @RequestMapping(value = "{id}/update", method = RequestMethod.POST)
    public String update(
            Model model,
            @ModelAttribute("m") M m, BindingResult result,
            RedirectAttributes redirectAttributes) {
        if (permissionList != null) {
            permissionList.assertHasUpdatePermission();
        }
        if (result.hasErrors()) {
            return updateForm(m, model, redirectAttributes);
        }
        this.baseService.saveOrUpdate(m);
        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "修改成功");
        return redirectToUrl(viewName("success"));
    }

    @RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
    public String deleteForm(@PathVariable("id") M m, Model model) {
        if (permissionList != null) {
            permissionList.assertHasDeletePermission();
        }
        setCommonData(model);
        model.addAttribute("m", m);
        model.addAttribute(Constants.OP_NAME, "删除");
        return viewName("editForm");
    }
    @RequestMapping(value = "{id}/delete", method = RequestMethod.POST)
    public String deleteSelfAndChildren(
            Model model,
            @ModelAttribute("m") M m, BindingResult result,
            RedirectAttributes redirectAttributes) {
        if (permissionList != null) {
            permissionList.assertHasDeletePermission();
        }
        if (m.isRoot()) {
            result.reject("您删除的数据中包含根节点，根节点不能删除");
            return deleteForm(m, model);
        }
        List<M> data = this.baseService.findAll();
        for(M da:data){
        }
        this.baseService.deleteSelfAndChild(m);
        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "删除成功");
        return redirectToUrl(viewName("success"));
    }


    @RequestMapping(value = "batch/delete")
    public String deleteInBatch(
            @RequestParam(value = "ids", required = false) ID[] ids,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) throws InvocationTargetException, IllegalAccessException {


        if (permissionList != null) {
            permissionList.assertHasDeletePermission();
        }

        //如果要求不严格 此处可以删除判断 前台已经判断过了
        Searchable searchable = Searchable.newSearchable().addSearchFilter("id", SearchOperator.in, ids);
        List<M> mList = this.baseService.findBySearchable(searchable).getContent();
        for (M m : mList) {
            if (m.isRoot()) {
                redirectAttributes.addFlashAttribute(Constants.ERROR, "您删除的数据中包含根节点，根节点不能删除");
                return redirectToUrl(backURL);
            }
        }

        this.baseService.deleteSelfAndChild(mList);
        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "删除成功");
        return redirectToUrl(backURL);
    }


    @RequestMapping(value = "{parent}/appendChild", method = RequestMethod.GET)
    public String appendChildForm(@PathVariable("parent") M parent, Model model) {


        if (permissionList != null) {
            permissionList.assertHasCreatePermission();
        }

        setCommonData(model);
        if (!model.containsAttribute("child")) {
            model.addAttribute("child", newModel());
        }

        model.addAttribute(Constants.OP_NAME, "添加子节点");

        return viewName("appendChildForm");
    }

    @RequestMapping(value = "{parent}/appendChild", method = RequestMethod.POST)
    public String appendChild(
            Model model,
            @PathVariable("parent") M parent,
            @ModelAttribute("child") M child, BindingResult result,
            RedirectAttributes redirectAttributes) {


        if (permissionList != null) {
            permissionList.assertHasCreatePermission();
        }

        setCommonData(model);

        if (result.hasErrors()) {
            return appendChildForm(parent, model);
        }

        this.baseService.appendChild(parent, child);
        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "添加子节点成功");
        return redirectToUrl(viewName("success"));
    }

    @RequestMapping(value = "{source}/move", method = RequestMethod.GET)
    @PageableDefaults(sort = {"parent_ids=asc", "weight=asc"})
    public String showMoveForm(
            HttpServletRequest request,
            @RequestParam(value = "async", required = false, defaultValue = "false") boolean async,
            @PathVariable("source") M source,
            Searchable searchable,
            Model model) throws InvocationTargetException, IllegalAccessException {

        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        List<M> models = null;

        //排除自己及子子孙孙
        searchable.addSearchFilter("id", SearchOperator.ne, source.getId());
        searchable.addSearchFilter(
                "parentIds",
                SearchOperator.notLike,
                source.makeSelfAsNewParentIds() + "%");

        if (!async) {
            models = this.baseService.findBySearchable(searchable).getContent();
        } else {
            models = this.baseService.findRootAndChild(searchable);
        }

        model.addAttribute("trees", convertToSimpleZtreeList(
                models,
                async,
                true));

        model.addAttribute(Constants.OP_NAME, "移动节点");

        return viewName("moveForm");
    }

    @RequestMapping(value = "{source}/move", method = RequestMethod.POST)
    @PageableDefaults(sort = {"parent_ids=asc", "weight=asc"})
    public String move(
            HttpServletRequest request,
            @RequestParam(value = "async", required = false, defaultValue = "false") boolean async,
            @PathVariable("source") M source,
            @RequestParam("target") M target,
            @RequestParam("moveType") String moveType,
            Searchable searchable,
            Model model,
            RedirectAttributes redirectAttributes) throws InvocationTargetException, IllegalAccessException {

        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        if (target.isRoot() && !moveType.equals("inner")) {
            model.addAttribute(Constants.ERROR, "不能移动到根节点之前或之后");
            return showMoveForm(request, async, source, searchable, model);
        }

        this.baseService.move(source, target, moveType);

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "移动节点成功");
        return redirectToUrl(viewName("success"));
    }

    @RequestMapping(value = "{parent}/children", method = RequestMethod.GET)
    @PageableDefaults(sort = {"parent_ids=asc", "weight=asc"})
    public String list(
            HttpServletRequest request,
            @PathVariable("parent") M parent,
            Searchable searchable, Model model) throws UnsupportedEncodingException, InvocationTargetException, IllegalAccessException {

        if (permissionList != null) {
            permissionList.assertHasViewPermission();
        }

        if (parent != null) {
            searchable.addSearchFilter("parent_id", SearchOperator.eq, parent.getId());
        }

        model.addAttribute("page", this.baseService.findBySearchable(searchable));

        return viewName("listChildren");
    }


    /**
     * 仅返回表格数据
     *
     * @param searchable
     * @param model
     * @return
     */
    @RequestMapping(value = "{parent}/children", headers = "table=true", method = RequestMethod.GET)
    @PageableDefaults(sort = {"parent_ids=asc", "weight=asc"})
    public String listTable(
            HttpServletRequest request,
            @PathVariable("parent") M parent,
            Searchable searchable, Model model) throws UnsupportedEncodingException, InvocationTargetException, IllegalAccessException {

        list(request, parent, searchable, model);
        return viewName("listChildrenTable");

    }
    /////////////////////////////////////ajax///////////////////////////////////////////////

    @RequestMapping(value = "ajax/load")
    @PageableDefaults(sort = {"parent_ids=asc", "weight=asc"})
    @ResponseBody
    public Object load(
            HttpServletRequest request,
            @RequestParam(value = "async", defaultValue = "true") boolean async,
            @RequestParam(value = "asyncLoadAll", defaultValue = "false") boolean asyncLoadAll,
            @RequestParam(value = "searchName", required = false) String searchName,
            @RequestParam(value = "id", required = false) ID parentId,
            @RequestParam(value = "excludeId", required = false) ID excludeId,
            @RequestParam(value = "onlyCheckLeaf", required = false, defaultValue = "false") boolean onlyCheckLeaf,
            Searchable searchable) throws InvocationTargetException, IllegalAccessException {


        M excludeM = (M)this.baseService.findById(excludeId);

        List<M> models = null;

        if (!StringUtils.isEmpty(searchName)) {//按name模糊查
            searchable.addSearchParam("name_like", searchName);
            models = this.baseService.findAllByName(searchable, excludeM);
            if (!async || asyncLoadAll) {//非异步模式 查自己及子子孙孙 但排除
                searchable.removeSearchFilter("name_like");
                List<M> children = this.baseService.findChildren(models, searchable);
                models.removeAll(children);
                models.addAll(children);
            } else { //异步模式 只查匹配的一级

            }
        } else { //根据有没有parentId加载

            if (parentId != null) { //只查某个节点下的 异步
                searchable.addSearchFilter("parent_id", SearchOperator.eq, parentId);
            }

            if (async && !asyncLoadAll) { //异步模式下 且非异步加载所有
                //排除自己 及 子子孙孙
                this.baseService.addExcludeSearchFilter(searchable, excludeM);

            }

            if (parentId == null && !asyncLoadAll) {
                models = this.baseService.findRootAndChild(searchable);
            } else {
                models = this.baseService.findBySearchable(searchable).getContent();
            }
        }

        return convertToSimpleZtreeList(
                models,
                async && !asyncLoadAll && parentId != null,
                onlyCheckLeaf);
    }

    @RequestMapping(value = "ajax/{parent}/appendChild", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object ajaxAppendChild(HttpServletRequest request, @PathVariable("parent") M parent) {


        if (permissionList != null) {
            permissionList.assertHasCreatePermission();
        }
        M child = (M) newModel();
        child.setName("新节点");
        this.baseService.appendChild(parent, child);
        return convertToSimpleZtree(child, true, true);
    }

    @RequestMapping(value = "ajax/{id}/delete", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object ajaxDeleteSelfAndChildren(@PathVariable("id") ID id) {


        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        M tree = (M) this.baseService.findById(id);
        this.baseService.deleteSelfAndChild(tree);
        return tree;
    }

    @RequestMapping(value = "ajax/{id}/rename", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object ajaxRename(HttpServletRequest request, @PathVariable("id") M tree, @RequestParam("newName") String newName) {


        if (permissionList != null) {
            permissionList.assertHasUpdatePermission();
        }

        tree.setName(newName);
        this.baseService.saveOrUpdate(tree);
        return convertToSimpleZtree(tree, true, true);
    }


    @RequestMapping(value = "ajax/{sourceId}/{targetId}/{moveType}/move", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object ajaxMove(
            @PathVariable("sourceId") M source, @PathVariable("targetId") M target,
            @PathVariable("moveType") String moveType) {


        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }


        this.baseService.move(source, target, moveType);

        return source;
    }


    @RequestMapping("ajax/autocomplete")
    @PageableDefaults(value = 30)
    @ResponseBody
    public Set<String> autocomplete(
            Searchable searchable,
            @RequestParam("term") String term,
            @RequestParam(value = "excludeId", required = false) ID excludeId) throws InvocationTargetException, IllegalAccessException {

        return this.baseService.findNames(searchable, term, excludeId);
    }


    @RequestMapping(value = "success")
    public String success() {
        return viewName("success");
    }


    protected String redirectToUrl(String backURL) {
        if (!StringUtils.isEmpty(backURL)) {
            return super.redirectToUrl(backURL);
        }
        return super.redirectToUrl(viewName("success"));
    }



   private List convertToSimpleZtreeList(List<M> m, final boolean open, final boolean onlyCheckLeaf) {
       List<SimpleZtree<SimpleZtree,ID>> ztree = Lists.newArrayList();
       if (m == null || m.isEmpty()) {
           return ztree;
       }
       ConvertTool c = new ZtreeConvertTool();
       return c.findChildren(m, new ConvertTool.ModelCall<M, SimpleZtree>() {
           public SimpleZtree convert(M m) {
               SimpleZtree ztree = new SimpleZtree();
               ztree.setId((ID) m.getId());
               ztree.setpId((ID) m.getParentId());
               ztree.setName(m.getName());
               ztree.setIsParent(!m.isLeaf());
               ztree.setIconSkin(m.getIcon());
               ztree.setOpen(open);
               ztree.setRoot(m.isRoot());
               if (onlyCheckLeaf && ztree.getIsParent()) {
                   ztree.setNocheck(true);
               } else {
                   ztree.setNocheck(false);
               }
               return ztree;
           }
       });
    }

    private SimpleZtree convertToSimpleZtree(M m, final boolean open, final boolean onlyCheckLeaf){
        SimpleZtree ztree = new SimpleZtree();
        ztree.setId((ID) m.getId());
        ztree.setpId((ID) m.getParentId());
        ztree.setIsParent(!m.isLeaf());
        ztree.setName(m.getName());
        ztree.setIconSkin(m.getIcon());
        ztree.setOpen(open);
        ztree.setRoot(m.isRoot());
        if (onlyCheckLeaf && ztree.getIsParent()) {
            ztree.setNocheck(true);
        } else {
            ztree.setNocheck(false);
        }
        return ztree;
    }
    public abstract void setBaseService(T baseService);
}



