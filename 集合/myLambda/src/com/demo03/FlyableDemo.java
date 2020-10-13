package com.demo03;

public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyable方法
        useFlyABLE((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }
    private static void useFlyABLE(Flyable f){
        f.fly("风和日丽，清空万里");
    }
}
