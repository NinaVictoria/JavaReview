package Example5_5;

/**
 * @author : Nina
 * @time : 2020/7/5 9:32
 * @description : open and close principle
 */
public class Example5_5 {
    public static void main(String[] args) {
        SIM sim1 = new SIMOfChineMobile();
        sim1.setNumber("1234");
        SIM sim2 = new SIMOfChineUnicom();
        sim2.setNumber("5678");

        Telephone telephone = new Telephone();
        System.out.println("---使用SIM卡1---");
        telephone.useSIM(sim1);
        telephone.showMessage();
        System.out.println("---使用SIM卡2---");
        telephone.useSIM(sim2);
        telephone.showMessage();
    }
}
