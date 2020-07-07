package Example12_2;

/**
 * @author : Nina
 * @time : 2020/7/7 14:03
 * @description : synchronized
 */
public class Example12_2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setMoney(300);
        Thread accountant = new Thread(bank);
        Thread cashier = new Thread(bank);
        accountant.setName("会计");
        cashier.setName("出纳");
        cashier.start();
        accountant.start();
    }
}
