package Example10_5;

import java.io.*;

/**
 * @author : Nina
 * @time : 2020/7/6 16:53
 * @description : ObjectInputStream and ObjectOutputStream
 */
public class Example10_5 {
    public static void main(String[] args) {
        TV tv=new TV();
        tv.name="TCL TV";
        tv.price=2000;

        File file=new File(".\\src\\Example10_5\\TV.txt");
        try{
            //Write into file
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tv);
            objectOutputStream.close();
            //Read from file
            FileInputStream fileInputStream=new FileInputStream(file);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            TV tvOut=(TV) objectInputStream.readObject();
            objectInputStream.close();

            tvOut.speak();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class TV implements Serializable{
    String name;
    int price;

    void speak(){
        System.out.println("I am "+name+",price is "+price);
    }
}