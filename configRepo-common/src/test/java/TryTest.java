import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hassop
 * @Description
 * @date 2016/8/19 0019
 * To change this template use File | Settings | File Templates.
 */
public class TryTest {
    private final static ReentrantLock clientLock = new ReentrantLock();
    public static final String test() {
        String t = "";

        try {
            clientLock.lock();
            t = "try";
            System.out.println("加锁成功");
            return t;
        } catch (Exception e) {
            // result = "catch";
            t = "catch";
            return t;
        } finally {
            t = "finally";

            clientLock.unlock();

            System.out.println("解锁成功");
            return t;
         //加上返回finnally
        }
    }

    public static void main(String[] args) {
        System.out.println(TryTest.test());
    }
}
