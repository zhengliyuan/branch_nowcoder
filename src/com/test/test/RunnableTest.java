package com.test.test;

public class RunnableTest implements Runnable{
    private int i =0;
    @Override
    public void run() {
        for(i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }


    public static void main(String[] args) {
        new RunnableTest().run();
    }
}
