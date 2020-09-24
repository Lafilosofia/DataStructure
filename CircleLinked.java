package com.dataStructure;

/**
 * 循环链表
 */

/**
 * 循环链表
 *
 */
public class CircleLinked{
    private Node head ;//头节点
    private int size ;//长度
    /**
     * 添加节点
     * @param element
     * @return
     */
    public Node add(Object element){
        Node newNode = new Node(element);
        //链表没有头节点
        if(size==0){
            head = newNode;
            head.next= head;
        }else{
            Node target = head;
            //遍历找到最后一个节点
            while(target.next!=head){
                target = target.next;
            }
            target.next = newNode;
            newNode.next = head;

        }
        size++;
        return newNode;
    }

    /**
     * 在指定位置插入节点
     * @param index
     * @param obj
     */
    public Node insert(int index,Object obj){
        if(index<0||index>=size){
            return null;
        }
        Node newNode = new Node(obj);
        //插入到头节点的位置
        if(index==0){
            newNode.next= head;
            head= newNode;
        }else{
            Node target = head;
            Node previous = head;
            int pos = 0;
            while(pos!=index){
                previous = target;
                target = target.next;
                pos++;
            }
            previous.next = newNode;
            newNode.next=target;


        }
        size++;
        return newNode;
    }

    /**
     * 删除头部元素
     * @return
     */
    public Node removeHeadNode(){
        if(size>0){
            Node node = head;
            Node target = head;
            while (target.next!=head){
                target = target.next;
            }
            head = head.next;
            target.next = head;
            size--;
            return node;
        }else
        {
            return null;
        }

    }

    /**
     * 输出链表元素
     */
    public void show(){
        if(size>0){
            Node node = head;
            int length= size;
            System.out.print("[");
            while(length>0){
                if(length==1)
                    System.out.println(node.data);
                else{
                    System.out.println(node.data+",");
                }
                node = node.next;
                length--;
            }
            System.out.println("]");
        }else{
            System.out.println("[]");
        }

    }
    public static void main(String[] args) {
        CircleLinked circleLinked = new CircleLinked();
        System.out.println(circleLinked.add("新节点"));
        System.out.println(circleLinked.add("第二个节点"));
        System.out.println(circleLinked.insert(1,"第三个节点"));
        circleLinked.show();
    }
}