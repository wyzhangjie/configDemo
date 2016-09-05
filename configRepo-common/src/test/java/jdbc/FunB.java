package jdbc;

/**
 * @author hassop
 * @Description
 * @date 2016/9/2 0002
 * To change this template use File | Settings | File Templates.
 */
public class FunB extends Func  {
    @Override
    String service() {
        System.out.println("2 的方法被实现了");
        return "2 的方法被实现了";
    }

    @Override
    public boolean match(Func func) {
        if(func.i==2){
             service();
            return true;
        }
        return false;
    }
}
