/**
 * @author : Nina
 * @time : 2020/7/5 10:15
 * @description : interface and Overload
 */
public class Example6_2 {
    public static void main(String[] args) {
        ComputeAverage computeAverage;
        computeAverage=new A();
        System.out.println("11.2和12.3的算术平均值为"+computeAverage.average(11.2,12.3));

        computeAverage=new B();
        System.out.println("11.2和12.3的几何平均值为"+computeAverage.average(11.2,12.3));
    }
}

interface ComputeAverage{
    public double average(double a,double b);
}

class A implements ComputeAverage{

    @Override
    public double average(double a, double b) {
        return (a+b)/2;
    }
}

class B implements ComputeAverage{

    @Override
    public double average(double a, double b) {
        return Math.sqrt(a*b);
    }
}