/**
 * @author : Nina
 * @time : 2020/7/4 14:25
 * @description : if语句swap
 */
public class Example3_2 {
    public static void main(String[] args) {
        int a = 9, b = 7, temp;
        if (a > b) {
            temp = a;
            a=b;
            b=temp;
        }
        System.out.println(a+","+b);
    }
}
