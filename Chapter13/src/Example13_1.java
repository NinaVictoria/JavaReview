import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author : Nina
 * @time : 2020/7/7 15:28
 * @description : read the resources in URL
 */
public class Example13_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        URL url;
        Thread readURL;
        Look look=new Look();
        System.out.println("输入URL(例如 http://www.baidu.com):");
        String source=scanner.nextLine();
        try {
            url=new URL(source);
            look.setUrl(url);
            readURL=new Thread(look);
            readURL.start();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
