package Example13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Nina
 * @time : 2020/7/7 15:54
 * @description : Socket
 */
public class Example13_3_Server {
    public static void main(String[] args) {
        String [] answer={"南非","进入世界杯了","哈哈，问题真逗"};
        ServerSocket serverSocketForClient=null;
        Socket socketOnServer=null;
        DataOutputStream out=null;
        DataInputStream in=null;
        try {
            serverSocketForClient=new ServerSocket(45678);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            System.out.println("等待客户呼叫");
            socketOnServer=serverSocketForClient.accept();
            out=new DataOutputStream(socketOnServer.getOutputStream());
            in=new DataInputStream(socketOnServer.getInputStream());
            for(int i=0;i<answer.length;i++){
                String s=in.readUTF();
                System.out.println("服务器端收到的提问："+s);
                out.writeUTF(answer[i]);
                Thread.sleep(500);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
