package com.dataStructure;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample <T>{
    public static void main(String[] args) {
        Map map = new TreeMap<Integer,String>();
        map.put(1,"ddd");
        map.put(4,"aaa");
        map.put(2,"uuu");
        map.put(100,"ooo");
        System.out.println(map);

    }

    public void op(T t){

    }
}
