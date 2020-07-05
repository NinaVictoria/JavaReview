/**
 * @author : Nina
 * @time : 2020/7/5 9:24
 * @description : abstract class and method
 */
public class Example5_4 {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.shut();
        animal2.shut();
    }
}

abstract class Animal {
    abstract void shut();
}

class Cat extends Animal {

    @Override
    void shut() {
        System.out.println("喵喵喵...");
    }
}

class Dog extends Animal {

    @Override
    void shut() {
        System.out.println("汪汪汪...");
    }
}