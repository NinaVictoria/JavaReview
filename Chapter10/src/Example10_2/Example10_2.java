package Example10_2;

import java.io.*;

/**
 * @author : Nina
 * @time : 2020/7/6 10:44
 * @description : FileReader and FileWriter
 * read character in a.txt and append in b.txt
 */
public class Example10_2 {
    public static void main(String[] args) {
        File sourceFile=new File(".\\src\\Example10_2","a.txt");
        File targetFile=new File(".\\src\\Example10_2","b.txt");
        char [] c=new char[19];
        try{
            Writer out=new FileWriter(targetFile,true); //append 是否刷新（覆盖）目标文件
            Reader in= new FileReader(sourceFile);
            int n=-1;
            while ((n=in.read(c))!=-1){ //每次读取一个字符
                out.write(c,0,n);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
