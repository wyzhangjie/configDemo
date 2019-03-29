
package com.framework.demo.service.impl.showcaseTree;

import com.framework.demo.bo.showcaseTree.ShowcaseTree;
import com.framework.demo.dao.showcaseTree.ShowcaseTreeMapper;
import com.framework.demo.service.showcaseTree.ShowcaseTreeService;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.tree.service.BaseTreeableServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_tree`
 * @author zhjie.zhang
 */
@Service("showcaseTreeService")
public class ShowcaseTreeServiceImpl extends BaseTreeableServiceImpl<ShowcaseTree, Long> implements ShowcaseTreeService  {

    @Autowired
    private ShowcaseTreeMapper showcaseTreeDao;


    public ExtendDaoMapper<ShowcaseTree, Long> getDao() {
        return showcaseTreeDao;
    }


    public void updateSelftAndChild(ShowcaseTree source, Long newParentId, String newParentIds, int newWeight) {

    }
}