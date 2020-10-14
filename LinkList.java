package LinearList.SeqList;

import LinearList.Abstract.Abstract;

public abstract class LinkList implements Abstract.Ilist {
    private Node head;
    public LinkList(){
        head = new Node();
    }
    public LinkList(int n,boolean Order) throws Exception{
        this();
        if (Order)

    }

    //用尾插发顺序建立单链表,其中n为单链表的节点个数
    public void create1(int n)throws Exception{

    }
    //用头插法逆位序建立单链表,其中n为单链表的节点个数
    public void create2(int n)throws Exception{

    }
    //将一个存在的带头节点的单列表置空
    public void clear(){
        head.setData(null);
        head.setNext(null);
    }
    //判断带头结点的单链表是否为空
    public
}
