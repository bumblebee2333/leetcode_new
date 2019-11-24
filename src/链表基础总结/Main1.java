package 链表基础总结;

public class Main1 {
    public static void main(String[] args) {
        Animal b=new Bird(); //向上转型
        b.eat();
        ((Bird) b).fly();
    }
}

class Animal
{
    public void eat()
    {
        System.out.println("父类的 eating...");
    }
}
class Bird extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("子类重写的父类的  eatting...");
    }
    public void fly()
    {
        System.out.println("子类新方法  flying...");
    }
}

