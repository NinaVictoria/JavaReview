package Example4_3;

/**
 * @author : Nina
 * @time : 2020/7/4 23:02
 * @description : Circle
 */
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
