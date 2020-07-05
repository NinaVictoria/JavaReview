/**
 * @author : Nina
 * @time : 2020/7/5 22:45
 * @description : String.format
 */
public class Example8_5 {
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(String.format("%,+d", n));
        double number = 98765.4321321;
        System.out.println(String.format("%011.3f", number));
    }
}
