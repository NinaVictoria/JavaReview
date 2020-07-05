import java.util.Date;

/**
 * @author : Nina
 * @time : 2020/7/5 22:50
 * @description : Commonly used class: Class
 */
public class Example8_6 {
    public static void main(String[] args) {
        try {
            Class cs = Class.forName("Rect");
            Rect rect = (Rect) cs.newInstance();
            rect.width = 12.2;
            rect.height = 34.8;
            System.out.println("面积为:" + rect.getArea());
            cs = Class.forName("java.util.Date");
            Date date = (Date) cs.newInstance();
            System.out.println(String.format("%tF %<tT %<tA", date));
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Rect {
    double width, height;

    public double getArea() {
        return width * height;
    }
}