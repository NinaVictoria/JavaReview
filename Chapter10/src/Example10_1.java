import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Nina
 * @time : 2020/7/6 9:57
 * @description : Class: File
 */
public class Example10_1 {
    public static void main(String[] args) {
        File file = new File("new.txt");
        if (!file.exists())
            try {
                if(file.createNewFile())
                    System.out.println("文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println(file.getName()+"是可读的吗？"+ file.canRead());
        System.out.println(file.getName()+"是可写的吗？"+ file.canWrite());
        System.out.println(file.getName()+"的长度"+ file.length());
        System.out.println(file.getName()+"的绝对路径"+ file.getAbsolutePath());
//        file.delete();
        String s="新年快乐！";
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            fileOutputStream.write((s+"\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
