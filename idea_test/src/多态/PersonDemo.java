package 多态;

public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp=new PingPangPlayer();
        ppp.setName("张三");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
    }
}
