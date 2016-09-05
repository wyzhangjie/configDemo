package ifelse;

import java.util.Map;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
public interface Search {

    boolean match(Search search);

    String doSearch(Map<String, Object> params);
}
