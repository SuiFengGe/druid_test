package Collectionstudy;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<String> c=new ArrayList<String>();
        //添加元素：Boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        //输出集合对象
        System.out.println(c);

    }
}
