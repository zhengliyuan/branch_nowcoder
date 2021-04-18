package cn.niuke.www;

/**
 * @author liyuan zheng
 * @date 2020/10/25 23:03
 */
public class Single {
    /*//饿汉式
    private static Single instance = new Single();
    private Single(){};
    public static Single getInstance(){
        return instance;
    }*/
    //饱汉式
    private static Single instance = null;
    private Single(){};
    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }
}
