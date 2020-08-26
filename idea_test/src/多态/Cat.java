package 多态;
/*
多态中成员访问特点
成员变量：编译看左边，执行看左边
成员方法：编译看左边，执行看右边
*/
public class Cat extends Animal {
    public int age=20;
    public int weight=10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
