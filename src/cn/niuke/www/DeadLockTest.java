package cn.niuke.www;

public class DeadLockTest {
    public static String obj1 = "obj1";

    public static String obj2 = "obj2";



    public static void main(String[] args) {
        Thread a = new Thread(new DeadLock1());
        Thread b = new Thread(new DeadLock1());
        a.start();
        b.start();
    }
}
