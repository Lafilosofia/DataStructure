package LinearList.SeqList;

import LinearList.Abstract.Abstract;
import com.sun.rowset.internal.WebRowSetXmlReader;

public abstract class SqList implements Abstract.Ilist {
    private Object[] listElem;  //线性表存储空间
    private int curLen;         //线性表的当前长度

    //顺序表类的构造函数,构造一个存储空间容量为maxSize的线性表
    public SqList(int maxSize) {
        curLen = 0;                         //置顺序表的当前长度为0
        listElem = new Object[maxSize];     //为顺序表分配maxSize个存储单元
    }

    //将一个已经存在的线性表置成空表
    public void clear() {
        curLen = 0;     //置顺序表的当前长度为0
    }

    //判断线性表中的数据元素的个数是否为0,为0返回true,否则返回false
    public boolean isEmpty() {
        return curLen == 0;
    }

    //判断线性表中的数据元素的个数并返回其值
    public int length() {
        return curLen;
    }

    //读取到线性表中第i个数据元素并有函数返回其值,其中i的取值范围为0<=i<=legnth - 1,若i不在此范围则抛出异常
    public Object get(int i) throws Exception {
        if (i < 0 | i > curLen - 1)            //如果不在范围内
            throw new Exception("第" + i + "个元素不存在");    //抛出异常
        return listElem[i];                 //返回顺序表中第i个元素
    }

    //在线性表的第i个数据元素之前插入一个x的元素
    public void insert(int i, Object x) throws Exception {
        if (curLen == listElem.length)      //判断顺序表是否已满
            throw new Exception("顺序表已满");   //抛出异常
        if (i < 0 || i > curLen)        //i不合法
            throw new Exception("插入位置不合法");     //抛出异常
        for (int j = curLen; j > i; j--)
            listElem[j] = listElem[j - 1];      //插入位置及其之后的所有数据元素后移一位
        listElem[i] = x;            //插入x
        curLen++;      //表长加1
    }

    //删除线性表的第i个元素
    public void remove(int i) throws Exception {
        if (i < 0 || i > curLen - 1)    //i不合法
            throw new Exception("删除位置不合法");     //抛出异常
        for (int j = 0; j < curLen - 1; j++)
            listElem[j] = listElem[j + 1];      //删除后的所有元素向左移一位
        curLen--;          //表长减1
    }

    //顺序表上的查找算法
    public int indexOf(Object x) {
        int j = 0;  //j指示顺序表中待比较的数据元素,初始值为第0个元素
        while (j < curLen && !listElem[j].equals(x))    //依次比较
            j ++;
        if (j < curLen)     //判断j的位置是否位于顺序表中
            return j;
        else
            return - 1;
    }


}