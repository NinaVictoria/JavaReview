package Example5_5;

/**
 * @author : Nina
 * @time : 2020/7/5 9:37
 * @description :
 */
public class Telephone {
    SIM card;

    public void useSIM(SIM card) {
        this.card = card;
    }

    public void showMessage() {
        System.out.println("使用的卡是" + card.giveCropName() + "提供的");
        System.out.println("号码是" + card.getNumber());
    }
}
