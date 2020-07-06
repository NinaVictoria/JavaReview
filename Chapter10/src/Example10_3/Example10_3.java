package Example10_3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : Nina
 * @time : 2020/7/6 16:08
 * @description : BufferedReader and BufferedWriter
 */
public class Example10_3 {
    public static void main(String[] args) {
        File fRead=new File(".\\src\\Example10_3","English.txt");
        File fWrite=new File(".\\src\\Example10_3","EnglishCount.txt");
        try{
            Writer writer=new FileWriter(fWrite);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            Reader reader=new FileReader(fRead);
            BufferedReader bufferedReader=new BufferedReader(reader);
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                StringTokenizer fenxi= new StringTokenizer(str);
                int count=fenxi.countTokens();
                str=str+" 句子中单词个数："+count;
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            writer.close();
            reader=new FileReader(fWrite);
            bufferedReader=new BufferedReader(reader);
            String s=null;
            System.out.println(fWrite.getName()+"内容:");
            while ((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
