package shiro;

import junit.framework.Assert;
import org.apache.shiro.authz.permission.WildcardPermission;
import org.junit.Test;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/6 0006
 * To change this template use File | Settings | File Templates.
 */

public class WildcardPermissionTest {

    @Test
    public void testWildcardPermission(){
        String wildcardString ="newsletter:edit:13";
        WildcardPermission wildcardPermission = new WildcardPermission(wildcardString);
        wildcardString="user:view:13";
        boolean t =wildcardPermission.implies(new WildcardPermission("user:view:13"));
        Assert.assertTrue(!t);
    }
}
