package com.test.test;

/**
 * synchronized修饰普通方法
 */
public class SynchronizedTest {
    public synchronized void run(){
        System.out.println(1);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(2);
    }

    public static void main(String[] args) {
       /* SynchronizedTest synchronizedTest = new SynchronizedTest();
        new Thread(()->synchronizedTest.run()).start();
        new Thread(()->synchronizedTest.run()).start();*/

        SynchronizedTest synchronizedTest1 = new SynchronizedTest();
        SynchronizedTest synchronizedTest2 = new SynchronizedTest();
        new Thread(()->synchronizedTest1.run()).start();
        new Thread(()->synchronizedTest2.run()).start();
    }
}
