import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author : Nina
 * @time : 2020/7/7 15:37
 * @description : InetAddress
 */
public class Example13_2 {
    public static void main(String[] args) {
        try{
            InetAddress address_1=InetAddress.getByName("www.taobao.com");
            System.out.println(address_1.toString());
            InetAddress address_2=InetAddress.getLocalHost();
            System.out.println(address_2.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
