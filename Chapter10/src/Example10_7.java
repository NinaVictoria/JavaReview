import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : Nina
 * @time : 2020/7/6 19:18
 * @description : ProgressMonitorInoutStream : InputStream with Progress bar
 */
public class Example10_7 {
    public static void main(String[] args) {
        byte[] b=new byte[30];
        try{
            FileInputStream inputStream=new FileInputStream(".\\src\\Example10_7.java");
            ProgressMonitorInputStream in=new ProgressMonitorInputStream(null,"读取java文件",inputStream);
            ProgressMonitor p=in.getProgressMonitor();
            while (in.read(b) != -1){
                String s=new String(b);
                System.out.print(s);
                Thread.sleep(500);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
