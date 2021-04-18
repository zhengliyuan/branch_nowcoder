package com.test.test;

/**
 * @author liyuan zheng
 * @date 2020/10/27 19:16
 */
public class Single {
    //饿汉式
    /*private static Single instance = new Single();
    private Single(){};
    public static Single getInstance(){
        return instance;
    } */
    /*//饱汉式
    private static Single instance = null;
    private Single(){};
    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }*/
    //线程安全的单例模式
    private static Single instance = null;
    private Single(){};
    public static Single getInstance(){
        if(instance == null){
            synchronized (Single.class){
                if(instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}
