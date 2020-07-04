/**
 * @author: Nina
 * @time: 2020/7/4 13:35
 * @description: 数组
 */
public class Example2_4 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {100, 200, 300};
        System.out.println("数组a的元素个数=" + a.length);
        System.out.println("数组b的元素个数=" + b.length);
        System.out.println("数组a的引用=" + a);
        System.out.println("数组b的引用=" + b);
        System.out.println("执行a=b");
        a = b;
        System.out.println("数组a的元素个数=" + a.length);
        System.out.println("数组b的元素个数=" + b.length);
        System.out.println("数组a的引用=" + a);
        System.out.println("数组b的引用=" + b);
        System.out.println(a[0] + "," + a[1] + "," + a[2]);
        System.out.println(b[0] + "," + b[1] + "," + b[2]);
        char s[] = {'我', '爱', '中', '国'};
        System.out.println(s);
    }
}
