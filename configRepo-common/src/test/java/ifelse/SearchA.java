package ifelse;

import java.util.Map;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
public class SearchA extends SearchRegistry {

    public SearchA() {
        super(1);
    }

    public String doSearch() {
        System.out.println("A");
        return "A";
    }

    public String doSearch(Map<String, Object> params) {
        return doSearch();
    }
}
