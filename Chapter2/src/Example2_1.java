/**
 * @author : Nina
 * @time : 2020/7/4 11:50
 * @description : 基本数据类型
 */
public class Example2_1 {
    public static void main(String[] args) {

        char word = '好';
        char you = '\u4f60';
        int position = 20202;
        System.out.println("汉字" + word + "的位置是:" + (int) word);
        System.out.println(position + "的位置上的字符是:" + (char) position);
        System.out.println("you:" + you);
    }

}
