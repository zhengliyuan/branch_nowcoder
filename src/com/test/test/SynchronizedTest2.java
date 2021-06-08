package com.test.test;

public class SynchronizedTest2 {

    public synchronized static void run(){
        System.out.println(1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }

    public static void main(String[] args) {
        SynchronizedTest2 synchronizedTest1 = new SynchronizedTest2();
        SynchronizedTest2 synchronizedTest2 = new SynchronizedTest2();

        new Thread(()->synchronizedTest1.run()).start();
        new Thread(()->synchronizedTest2.run()).start();
    }
}
