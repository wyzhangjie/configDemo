package java8;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-22-09:37
 */
public class SysTest {
    public static void main(String[] args) {
        try{
            System.exit(0);
        } catch (Exception e){

        }finally {
            System.out.println("In the finally block");
        }
    }
}
