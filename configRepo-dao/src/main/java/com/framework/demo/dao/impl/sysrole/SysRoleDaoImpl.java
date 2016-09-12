package com.framework.demo.dao.impl.sysrole;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.dao.sysRole.SysRoleDao;
import com.framework.demo.dao.sysRole.SysRoleMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/12 0012
 * To change this template use File | Settings | File Templates.
 */
@Repository("sysRoleDao")
public class SysRoleDaoImpl extends ConfigurableBaseSqlMapDao<SysRole, Long> implements SysRoleDao {

    @Autowired
    SysRoleMapper sysRoleMapper;


    public DaoMapper<SysRole, Long> getDaoMapper() {
        return null;
    }

    @Resource(name = "sqlSessionFactory")

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }


    public Set<SysRole> findByUserId(Long id) {
        return sysRoleMapper.findByUserId(id);
    }
}
