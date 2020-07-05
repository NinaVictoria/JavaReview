/**
 * @author : Nina
 * @time : 2020/7/5 17:36
 * @description : assert booleanExpression:messageException
 */
public class Example7_6 {
    public static void main(String[] args) {
        int[] score = {80, 90, 76, 50, -30, 99};
        int sum = 0;
        for (int number : score) {
            assert number >= 0 : "成绩不能是负数";
            sum += number;
        }
        System.out.println("总成绩：" + sum);
    }
}
