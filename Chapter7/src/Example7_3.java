/**
 * @author : Nina
 * @time : 2020/7/5 11:01
 * @description : Anonymous class about interface
 */

interface SpeakHello {
    void speak();
}

class HelloMachine {
    public void turnON(SpeakHello speakHello) {
        speakHello.speak();
    }
}

public class Example7_3 {
    public static void main(String[] args) {
        HelloMachine helloMachine = new HelloMachine();
        helloMachine.turnON(() -> System.out.println("Hello,you are welcome!"));//lambda表达式，Java8新特性
        helloMachine.turnON(new SpeakHello() {
            @Override
            public void speak() {
                System.out.println("你好，欢迎光临！");
            }
        });
    }

}
