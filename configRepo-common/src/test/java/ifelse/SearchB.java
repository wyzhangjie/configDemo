package ifelse;

import java.util.Map;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
public class SearchB extends SearchRegistry {
    public SearchB() {
        super(2);
    }

    public String doSearch() {
        System.out.println("B");
        return  "B";
    }



    @Override
    public String doSearch(Map<String, Object> params) {
        return doSearch();
    }
}
