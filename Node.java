package com.dataStructure;

/**
 * 节点类
 */
public class Node {
    Object data;    //数据区域
    Node next;  //指向下一个区域

    //头节点
    Node(){
        this.data = "head";
        this.next = null;
    }

    //非头节点
    Node(Object data){
        this.data = data;
        this.next = null;
    }
}
