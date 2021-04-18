package cn.niuke.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author liyuan zheng
 * @date 2020/10/15 14:20
 */
public class TestSys {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }
}
