package com.dataStructure;

/**
 * 单链表
 */
public class MyLinked {
    private Entry head; //链表的头节点
    public MyLinked(){
        head = new Entry();
    }

    //节点
    class Entry{
        int data;
        Entry next;

        public Entry(){
            this.data = -1;
            this.next = null;
        }

        public Entry(int data){
            this.data = data;
            this.next = null;
        }
    }

    //链表头中插入节点
    public void insertNode(int val){
        Entry entry = new Entry(val);
        entry.next = head.next;   //头节点链接到当前节点
        head.next = entry;
    }

    //链表尾部插入节点
    public void insertTail(int val){
        Entry temp = null;
        Entry entry = new Entry(val);
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = entry;
        entry.next = null;
    }

    //获取链表长度
    public int getLength(){
        Entry temp;
        int length = 0;
        temp = head.next;
        while(temp.next != null){
            length ++;
            temp = temp.next;
        }
        return length;
    }

    //指定位置插入
    public boolean insertPosition(int pos,int val){
        if (pos < 0 || pos > this.getLength()){
            return false;   //如果位置大于当前链表的长度或小于0,返回false
        }else{
            Entry temp = head;
            for (int i = 0;i < pos - 1;i ++){
                temp = temp.next;
            }
            Entry entry = new Entry(val);
            entry.next = temp.next;
            temp.next = entry;
            return true;
        }
    }

    //打印链表
    public void displayLinked(){
        Entry temp = null;
        temp = head;
        while(temp.next != null){
            System.out.println(temp.next.data + ":" + temp.next + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinked linked = new MyLinked();
        linked.insertTail(10);
        linked.insertTail(20);
        linked.insertTail(30);
        linked.displayLinked();
        linked.insertPosition(2,50);
        linked.displayLinked();
    }

}

