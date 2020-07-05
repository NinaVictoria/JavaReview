package Example8_4;

import java.util.Arrays;

/**
 * @author : Nina
 * @time : 2020/7/5 22:39
 * @description : Commonly used class: Random
 */
public class Example8_4 {
    public static void main(String[] args) {
        int [] a=GetRandomNumber.getRandomNumber(100,10);
        System.out.println(Arrays.toString(a));
    }
}
