package com.deom02;

public class EatableDemo {
    public static void main(String[] args) {
        Eatable e=new EatableImple();
        useEatalbe(e);
        //Lambda表达式
        useEatalbe(()->{
            System.out.println("一天一苹果，医生远离我");
        });
    }
    private static void useEatalbe(Eatable e){
        e.eat();
    }
}
