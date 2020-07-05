/**
 * @author : Nina
 * @time : 2020/7/5 9:00
 * @description : extends about private member
 */
public class Example5_2 {
    public static void main(String[] args) {
        ChinaPeople chinaPeople = new ChinaPeople();
        System.out.println("子类未继承的父类成员变量为averHeight,值为" + chinaPeople.getAverHeight());

        chinaPeople.setHeight(178);
        System.out.println("子类对象的实例变量height的值为" + chinaPeople.getHeight());

        System.out.println("chinaPeople.instanceof(People):" + (chinaPeople instanceof People));
    }
}

class People {
    private int averHeight = 177;

    public int getAverHeight() {
        return averHeight;
    }
}

class ChinaPeople extends People {
    int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}