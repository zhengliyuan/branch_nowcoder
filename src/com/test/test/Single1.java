package com.test.test;

/**
 * @author liyuan zheng
 * @date 2020/11/23 19:17
 */
public class Single1 {
    /*//饿汉式
    private static Single1 instance = new Single1();
    private Single1(){};
    public static Single1 getInstance(){
        return instance;
    }*/
    /*//饱汉式
    private static Single1 instance = null;
    private Single1(){};
    private static Single1 getInstance(){
        if(instance == null){
            instance = new Single1();
        }
        return instance;
    }*/
    //线程安全的单例模式
    private static Single1 instance = null;
    private Single1(){};
    private static Single1 getInstance(){
        if(instance == null){
            synchronized(Single1.class){
                if(instance == null){
                    instance = new Single1();
                }
            }
        }
        return instance;
    }
}
