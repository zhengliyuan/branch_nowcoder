package cn.niuke.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassLoader {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(10);
        list.add(2,2);
        System.out.println(list.get(0));
    }
}
