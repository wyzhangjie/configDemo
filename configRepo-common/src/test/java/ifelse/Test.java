package ifelse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hassop
 * @Description
 * @date 2016/9/3 0003
 * To change this template use File | Settings | File Templates.
 */

public class Test {
    public static void main(String[] args) {
        DelegateSearch delegateSearch = new DelegateSearch();
        delegateSearch.addSearch(new SearchA());
        delegateSearch.addSearch(new SearchB());
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("type",new SearchA());
        delegateSearch.doSearch(params);
    }
}
