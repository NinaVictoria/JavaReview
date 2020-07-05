import java.io.IOException;

/**
 * @author : Nina
 * @time : 2020/7/5 16:41
 * @description : try catch and Exception
 */
public class Example7_4 {
    public static void main(String[] args) {
        int n = 0, m = 0, t = 1000;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab88");
            t = 8888;
        } catch (NumberFormatException e) {
            System.out.println("发生异常:" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("n=" + n + ",m=" + m + ",t=" + t);
        try {
            System.out.println("故意抛出I/O异常");
            throw new java.io.IOException("我是故意的");
        } catch (IOException e) {
            System.out.println("发生异常：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
