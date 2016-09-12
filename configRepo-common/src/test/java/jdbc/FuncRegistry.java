package jdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
public class FuncRegistry extends Func implements IFuncRegistry  {

    List<Func> funcs = new ArrayList<Func>();

    public void addFunc(Func func) {
        funcs.add(func);
    }

    public void deleteFunc(Func func) {
        funcs.remove(func);
    }

    String service() {
        Iterator<Func> iterable = funcs.iterator();
        while (iterable.hasNext()){

            iterable.next().match(this);
        }
        return null;
    }


    public void setI( int i){
        super.i = i;
    }

    public static void main(String[] args) {
        FuncRegistry funcRegistry = new FuncRegistry();
        funcRegistry.addFunc(new FuncA());
        funcRegistry.addFunc(new FunB());
        funcRegistry.setI(2);
        funcRegistry.service();
    }

    public boolean match(Func func) {
        return true;
    }
}
