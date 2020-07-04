package Example4_3;

/**
 * @author : Nina
 * @time : 2020/7/4 23:09
 * @description : object as a member in another class
 */
public class Example4_3 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circular circular = new Circular();
        circular.setBottom(circle);
        circular.setHeight(5);
        System.out.println("圆锥的体积：" + circular.getVolme());
        System.out.println("圆锥底的面积：" + circular.getBottom().getArea());
        System.out.println("圆锥底的引用为：" + circular.getBottom());

        Circle circle1 = new Circle(12.5);
        System.out.println("换一个圆作为底");
        circular.setBottom(circle1);
        System.out.println("圆锥的体积：" + circular.getVolme());
        System.out.println("圆锥底的面积：" + circular.getBottom().getArea());
        System.out.println("圆锥底的引用为：" + circular.getBottom());
    }


}
