package Example7_5;

/**
 * @author : Nina
 * @time : 2020/7/5 17:22
 * @description :
 */
public class BankException extends Exception {
    String message;

    public BankException(int m, int n) {
        message = "入账资金" + m + "是负数或支出" + n + "是正数，不符合系统要求.";
    }

    public String warnMessage() {
        return message;
    }
}
