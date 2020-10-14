package LinearList.Abstract;

/**
 * 线性表的置空clear(); 将一个已经存在的线性表置成空表
 * 线性表判空操作isEmpty(); 判断线性表是否为空,若为空,返回true,否则返回false
 * 线性表长度 length();
 * 取元素get(i);
 * 插入操作 insert(i,x); 在线性表第i个元素之前插入一个值为x的值,0<=i<=length()
 * 删除操作 remove(i); 删除并返回线性表中第i个元素
 * 查找操作 indexOf(i)
 * 输出操作 display(i) 输出线性表中的各个元素的值
 *
 */
public class Abstract {
    public interface Ilist{
        public void clear();
        public boolean isEmpty();
        public int length();
        public Object get();
        public void insert();
        public void remove();
        public int indexOf();
        public void display();
    }
}
