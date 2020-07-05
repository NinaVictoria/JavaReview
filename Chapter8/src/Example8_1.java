/**
 * @author : Nina
 * @time : 2020/7/5 20:48
 * @description : Commonly used class: String
 */
public class Example8_1 {
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5, s6;
        s1 = new String("aaa");
        s2 = new String("aaa");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s3 = "bbb";
        s4 = new String("bbb");
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        s5 = "ccc";
        s6 = "ccc";
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);

        System.out.println(s1.startsWith("a"));
        System.out.println(s2.compareTo("aa"));
        System.out.println(s1.contains("aa"));

    }
}
