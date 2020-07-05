/**
 * @author : Nina
 * @time : 2020/7/5 9:12
 * @description : Override
 */
public class Example5_3 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.compute(5.4, 7.3));//调用的是子类重写的方法而非父类的方法
    }
}

class A {
    double compute(double x, double y) {
        return x + y;
    }
}

class B extends A {
    @Override
    double compute(double x, double y) {
        return x * y + super.compute(x, y);//可使用super关键字调用父类的方法
    }
}
