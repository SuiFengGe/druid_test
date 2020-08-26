package 多态;

public class BaskteballPlayer extends Player{
    public BaskteballPlayer() {
    }

    public BaskteballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员投球");
    }
    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }
}
