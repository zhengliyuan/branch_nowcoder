package cn.niuke.www;

/**
 * @author liyuan zheng
 * @date 2020/10/25 23:07
 */
public class ThreadTest {
    public static void main(String[] args) {
        final Object a = new Object();
        final Object b = new Object();
        Thread threada = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(a){
                    try {
                        System.out.println("a");
                        Thread.sleep(2000);
                        synchronized (b){
                            System.out.println("b");
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadb = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(b){
                    try {
                        System.out.println("b");
                        Thread.sleep(2000);
                        synchronized (a){
                            System.out.println("a");
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
