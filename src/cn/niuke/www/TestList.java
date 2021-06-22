package cn.niuke.www;

import java.util.List;

public class TestList {

    public static void main(String[] args) {
        TestList testList = new TestList();
        System.out.println(testList.test());
    }

    public int test(){
        int i=0;
        try{
            i++;
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            i++;
        }
        return i++;
    }
}
