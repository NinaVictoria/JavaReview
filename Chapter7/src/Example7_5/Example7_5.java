package Example7_5;

/**
 * @author : Nina
 * @time : 2020/7/5 17:21
 * @description : Custom exception
 */
public class Example7_5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.income(200, -100);
            bank.income(300, -200);
            bank.income(400, -300);
            bank.income(200, 100);
            bank.income(9999, -100);

        } catch (BankException e) {
            System.out.println(e.warnMessage());
        }
        System.out.println("银行目前有" + bank.getMoney() + "元");
    }
}
