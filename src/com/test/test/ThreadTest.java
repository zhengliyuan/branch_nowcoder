package com.test.test;

public class ThreadTest extends Thread{
    int i=0;
    @Override
    public void run() {
        for(;i<100;i++){
            System.out.println(getName()+""+i);
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start();
    }
}
