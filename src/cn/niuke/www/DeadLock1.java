package cn.niuke.www;

public class DeadLock1 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Lock1 running");
            while (true){
                synchronized (DeadLockTest.obj1){
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);
                    synchronized (DeadLockTest.obj2){
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
