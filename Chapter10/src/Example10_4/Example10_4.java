package Example10_4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 * @author : Nina
 * @time : 2020/7/6 16:24
 * @description : RandomAccessFile
 */
public class Example10_4 {
    public static void main(String[] args) {
        RandomAccessFile inAndOut=null;
        int [] data ={1,2,3,4,5,6,7,8,9};
        try {
            inAndOut=new RandomAccessFile(".\\src\\Example10_4\\a.txt","rw");
            for (int i=0;i<data.length;i++){
                inAndOut.writeInt(data[i]);
            }
            for (int i=data.length-1;i>=0;i--){
                inAndOut.seek(i*4);
                System.out.printf("\t%d",inAndOut.readInt());
            }
//            long length=inAndOut.length();
//            long position=0;
//            inAndOut.seek(position);
//            while (position<length){
//                String str= inAndOut.readLine();
//                byte [] b=str.getBytes("iso-8859-1");
//                str=new String(b);
//                position= inAndOut.getFilePointer();
//                System.out.println(str);
//            }

            inAndOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
