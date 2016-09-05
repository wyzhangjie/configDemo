package jdbc;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
public class FuncA extends Func   {
    @Override
    public boolean match(Func func) {
        if(func.i==1){
            service();
            return true;
        }
        return false;
    }

    @Override
    String service() {
        System.out.println("2 的方法被实现了");
        return "1 的方法被实现了";
    }
}
