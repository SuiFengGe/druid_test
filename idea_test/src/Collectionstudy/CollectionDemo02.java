package Collectionstudy;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c=new ArrayList<String>();
        //boolean add(E e):添加元素
        System.out.println(c.add("hello"));
        c.add("world");
        System.out.println(c.contains("world"));
        System.out.println(c.size());
        System.out.println(c);
    }


}
