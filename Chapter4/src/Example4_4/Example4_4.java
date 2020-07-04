package Example4_4;

/**
 * @author : Nina
 * @time : 2020/7/4 23:21
 * @description : Overload method
 */
public class Example4_4 {
    public static void main(String[] args) {
        GetMax g = new GetMax();
        System.out.println(g.getMax(9.2, 5.6666));
        System.out.println(g.getMax(9.2, 9.222, 9.222222));
    }
}

class GetMax {
    double getMax(double a, double b) {
        return a > b ? a : b;
    }

    double getMax(double a, double b, double c) {
        double max = (a > b ? a : b);
        return max > c ? max : c;
    }
}