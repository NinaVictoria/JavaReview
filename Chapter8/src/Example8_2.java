/**
 * @author : Nina
 * @time : 2020/7/5 21:11
 * @description : Commonly used class: StringBuffer
 */
public class Example8_2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("大家好");
        System.out.println("buffer:" + buffer);
        System.out.println("length:" + buffer.length());
        System.out.println("capacity:" + buffer.capacity());

        buffer.setCharAt(0, 'w');
        buffer.setCharAt(1, 'e');
        System.out.println("buffer:" + buffer);

        buffer.insert(2, " are all");
        System.out.println("buffer:" + buffer);
        int index = buffer.indexOf("好");
        buffer.replace(index, buffer.length(), " right.");
        System.out.println("buffer:" + buffer);
        System.out.println("length:" + buffer.length());
        System.out.println("capacity:" + buffer.capacity());
    }
}
