package jvm;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-19-14:22
 */
public class B {
    public A a;

    public B(){
        System.out.println("a初始化完成");
    }

    public void print(){
        a = new A();
        a.pring();
        System.out.println("b");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
