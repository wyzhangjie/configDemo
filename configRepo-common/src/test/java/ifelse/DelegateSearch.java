package ifelse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hassop
 * @Description
 * @date 2016/9/3 0003
 * To change this template use File | Settings | File Templates.
 */
public class DelegateSearch extends SearchRegistry {

    List<Search> search = new ArrayList<Search>();

    public DelegateSearch() {
        super(Integer.MAX_VALUE);
    }

    public boolean match(int p) {
        return false;
    }

    public String doSearch(Map<String, Object> params) {
        for (Search s : search) {
            if (s.match((Search)params.get("type"))) {
                return s.doSearch(params);
            }
        }
        return null;
    }

    public void addSearch(Search search) {
        this.search.add(search);
    }


}
