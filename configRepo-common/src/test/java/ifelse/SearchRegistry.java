package ifelse;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
 public abstract class SearchRegistry  implements Search  {
    public SearchRegistry(int i){
        this.i = i;
    }

    public int i;

    public boolean match(Search search) {
        if(this.getClass().isAssignableFrom(search.getClass())){
            return true;
        }
        return false;
    }
}
