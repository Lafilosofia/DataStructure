package LinearList.SeqList;

public class Node {
    private Object data;    //存放节点值
    private Node next;      //后继节点的引用
    //带参数的构造函数
    public Node(Object data,Node next){
        this.data = data;
        this.next = next;
    }

    public Node() {
        this(null,null);
    }

    public Object getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(Object data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
}