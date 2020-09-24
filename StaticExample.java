package com.dataStructure;

import java.util.HashMap;

public class StaticExample {
    final static int a = 5;//整个类只有一份
    int b = 6;
    T t;

    public static void main(String[] args) {
        System.out.println(StaticExample.a);
        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.b);
        StaticExample staticExample1 = new StaticExample();
        System.out.println(staticExample1.b);
        int b = 1;

        new HashMap<>(); //O(1)
        for (int i = 0;i < 10;i ++){
            for (int j = 0;j < 10;j ++){

            }
        }
    }
}
