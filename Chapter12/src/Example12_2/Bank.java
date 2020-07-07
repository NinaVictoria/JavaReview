package Example12_2;

/**
 * @author : Nina
 * @time : 2020/7/7 13:57
 * @description :
 */
public class Bank implements Runnable {
    int money = 200;

    public void setMoney(int n) {
        money = n;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("会计"))
            saveOrTake(300);
        else if (Thread.currentThread().getName().equals("出纳"))
            saveOrTake(150);

    }

    private synchronized void saveOrTake(int amount) {
        if (Thread.currentThread().getName().equals("会计")) {
            for (int i = 0; i < 3; i++) {
                money = money + amount / 3;
                System.out.println(Thread.currentThread().getName() + "存入" + amount / 3 + ",账户有" + money + "元,休息一下再存");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (Thread.currentThread().getName().equals("出纳")) {
            for (int i = 0; i < 3; i++) {
                money = money - amount / 3;
                System.out.println(Thread.currentThread().getName() + "取出" + amount / 3 + ",账户有" + money + "元,休息一下再取");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
