/*
package Algorithm.Generic;

import javafx.scene.shape.Circle;

import javax.imageio.stream.ImageInputStream;
import java.awt.*;

public class MemoryCell {
    private Object storedValue;
    public Object get(){
        return storedValue;
    }
    public void set(Object x){
        storedValue = x;
    }
}

class TestMemoryCell {
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.set("123");
        String val = (String)m.get();
        System.out.println("Contents are:" + val);
    }
}

class WrapperExamp{
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.set(new int[]);
        Integer wrapperVal = (Integer)m.get();
        int val = wrapperVal.intValue();
        System.out.println("Contents are :" + val);
    }
}

class FindMaxExamp{
    public static Comparable findMax(Comparable[] a){
        int k = 0;
        for (int i = 1;i < a.length;i ++){
            if (a[i].compareTo(a[k]) > 0)
                k = i;
        }
        return a[k];
    }

    public static void main(String[] args) {
        Shape[] sh1 = {new Circle(2.0),new Square(3.0),new Rectangle(3.0,4.0)};
        String[] st1 = {"Joe","Bob","Bill","Zeke"};
        System.out.println(findMax(sh1));
        System.out.println(findMax(st1));
    }
}
*/
