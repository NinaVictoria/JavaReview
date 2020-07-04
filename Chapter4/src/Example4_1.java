/**
 * @author : Nina
 * @time : 2020/7/4 22:39
 * @description : class and object
 */
public class Example4_1 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println("p1的引用：" + p1);
        System.out.println("p2的引用：" + p2);
        p1.setXY(10, 20);
        p2.setXY(100, 200);
        System.out.println("p1的坐标：" + p1.getX() + "," + p1.getY());
        System.out.println("p2的坐标：" + p2.getX() + "," + p2.getY());

        System.out.println("执行p1=p2");
        p1 = p2;
        System.out.println("p1的引用：" + p1);
        System.out.println("p2的引用：" + p2);

        System.gc();//让Java虚拟机立即进行垃圾回收
    }
}

class Point {
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
