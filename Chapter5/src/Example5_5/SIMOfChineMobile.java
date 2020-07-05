package Example5_5;

/**
 * @author : Nina
 * @time : 2020/7/5 9:35
 * @description :
 */
public class SIMOfChineMobile extends SIM {
    String number;

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String giveCropName() {
        return "Chine Mobile";
    }
}
