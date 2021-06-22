package com.test.test;

public class VolatileTest {
    public static volatile int race = 0;
    public static void increase(){
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[20];

        for(int i=0;i<THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<100;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        //等待所有线程结束
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);
    }
}
