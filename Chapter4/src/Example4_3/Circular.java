package Example4_3;

/**
 * @author : Nina
 * @time : 2020/7/4 23:05
 * @description : Circular
 */
public class Circular {
    Circle bottom;
    double height;

    public Circle getBottom() {
        return bottom;
    }

    public void setBottom(Circle bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getVolme() {
        if (bottom == null) {
            return -1;
        } else {
            return bottom.getArea() * height / 3;
        }
    }
}
