import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author: Nina
 * @time: 2020/7/4 13:24
 * @description: 输入数据
 */
public class Example2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double x = scanner.nextDouble();
        while (x != 0) {
            sum += x;
            x = scanner.nextDouble();
        }
        System.out.println("sum=" + sum);
    }
}
