package test;

import java.util.Date;

public class SystemDemo {
    public static void main(String[] args) {
//        long start=System.currentTimeMillis();
////        for(int i=0;i<10000;i++){
////            System.out.println(i);
////
////        }
////        long end =System.currentTimeMillis();
////        System.out.println(end-start);
        Date d=new Date();
        long time=System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
