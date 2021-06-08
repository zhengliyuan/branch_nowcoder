package com.test.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer,Object> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,2);
        map.put(3,2);
    }
}
