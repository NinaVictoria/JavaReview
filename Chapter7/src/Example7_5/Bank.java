package Example7_5;

/**
 * @author : Nina
 * @time : 2020/7/5 17:25
 * @description :
 */
public class Bank {
    private int money;

    public void income(int in, int out) throws BankException {
        if (in <= 0 || out >= 0 || in + out <= 0) {
            throw new BankException(in, out);
        }
        int netIncome = in + out;
        System.out.println("本次计算出的纯收入是" + netIncome + "元");
        money = money + netIncome;
    }

    public int getMoney() {
        return money;
    }
}
