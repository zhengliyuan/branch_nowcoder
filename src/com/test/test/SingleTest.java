package com.test.test;

public class SingleTest {
    //饿汉式
   /* private static SingleTest instance = null;

    private SingleTest(){};

    public static SingleTest getInstance(){
        instance = new SingleTest();
        return instance;
    }*/

    //饱汉式
    /*private static SingleTest instance = null;
    private SingleTest(){};
    public static SingleTest getInstance(){
        if(instance == null){
            instance = new SingleTest();
        }
        return instance;
    }*/

    //线程安全的单例模式
    private static SingleTest instance = null;
    private SingleTest(){};
    public static SingleTest getInstance(){
        if(instance == null){
            synchronized (SingleTest.class){
                if(instance == null){
                    instance = new SingleTest();
                }
            }
        }
        return instance;
    }
}
