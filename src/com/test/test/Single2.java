package com.test.test;

public class Single2 {
    //饱汉式
  /*  private static Single2 instance = null;

    private Single2(){};

    private static Single2 getInstance(){
        if(instance == null){
            instance = new Single2();
        }
        return instance;
    }*/

  /*  //饿汉式
    private static Single2 instance = new Single2();
    private Single2(){};
    private static Single2 getInstance(){
        return instance;
    }*/

  //线程安全的单例模式
    private static volatile Single2 instance = null;
    private Single2(){};
    private static Single2 getInstance(){
        if(instance == null){
            synchronized (Single2.class){
                if(instance == null){
                    instance = new Single2();
                }
            }
        }
        return instance;
    }
}
