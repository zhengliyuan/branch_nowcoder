package cn.niuke.www;

public class DeadLock2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Lock2 running");
            while (true){
                synchronized (DeadLockTest.obj2){
                    System.out.println("Lock2 lock obj2");
                    Thread.sleep(3000);
                    synchronized (DeadLockTest.obj1){
                        System.out.println("Lock2 lock obj1");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
