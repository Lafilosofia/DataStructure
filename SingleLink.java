package com.dataStructure;

public class SingleLink {
    /**
     * 链表类中持有节点的引用
     */
    private Node head;

    public SingleLink() {
        this.head = new Node();
    }

    class Node {
        Object data;//数据区域
        Node next;//指向下一个区域

        /**
         * 头节点
         */
        Node() {
            this.data = "head";
            this.next = null;
        }

        /**
         * 非头节点
         */
        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * 链表中新增节点 尾部插入
     * 重点：将新节点链到头节点的尾部
     */
    public Node insertTail(Object val) {
        Node newNode = new Node(val);
        //如何链接到头的尾部
        //1.当头节点为空 2.不为空要移动

        Node temp = null;
        temp = head;
        //循环当不为空时进行查询
        while(temp.next!=null){
            temp.next = temp.next.next;

        }
        temp.next = newNode;
        newNode.next = null;

        return newNode;
    }
    //头部插入
    public Node insertHead(Object val){
        Node temp = new Node();
        temp.next = temp;
        return  temp;
    }
    //打印链表
    public void show(){
    //链表所有的操作必须从头节点开始
        Node temp = null;
        temp = head;
        while(temp != null){
            //不输出头节点
            System.out.println(temp.data + "->" + temp.next);
            temp = temp.next;
        }
    }
}