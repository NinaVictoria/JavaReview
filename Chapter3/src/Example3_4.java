import java.util.Scanner;

/**
 * @author : Nina
 * @time : 2020/7/4 14:47
 * @description : Scanner
 */
public class Example3_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        int m=0;
        while(scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m=m+1;
            sum+=x;
        }
        System.out.println(m+"个数的平均值为"+sum/m);
        System.out.println(m+"个数的和为"+sum);
    }
}
