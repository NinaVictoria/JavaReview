package Example13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author : Nina
 * @time : 2020/7/7 15:54
 * @description : Socket
 */
public class Example13_3_Cilent {
    public static void main(String[] args) {
        String[] mess={"2010世界杯在哪里举行?","巴西进入世界杯了吗?","中国进入世界杯了吗?"};
        Socket mySocket;
        DataInputStream in=null;
        DataOutputStream out=null;
        try{
            mySocket=new Socket("192.168.3.5",45678);
            in=new DataInputStream(mySocket.getInputStream());
            out=new DataOutputStream(mySocket.getOutputStream());
            for(int i=0;i<mess.length;i++){
                out.writeUTF(mess[i]);
                String s=in.readUTF();
                System.out.println("收到来自服务器的回答:"+s);
                Thread.sleep(500);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
