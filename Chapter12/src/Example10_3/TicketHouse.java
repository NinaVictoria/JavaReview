package Example10_3;

/**
 * @author : Nina
 * @time : 2020/7/7 14:14
 * @description : 模拟售票柜台，零钱不够时，先等待下一位顾客买票，买完再唤醒原先
 * 等待的线程，判断零钱是否够
 */
public class TicketHouse implements Runnable{
    int fiveAmount=30,tenAmount=10,twentyAmount=0;
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("A"))
            saleTicket(20);
        else if(Thread.currentThread().getName().equals("B"))
            saleTicket(10);
        else if(Thread.currentThread().getName().equals("C"))
            saleTicket(5);
    }

    private synchronized void saleTicket(int money){
        if(money==5){
            fiveAmount+=1;
            System.out.println("收到5元，给"+Thread.currentThread().getName()+"票。");
            System.out.println("柜台有"+fiveAmount+"张5元，"+tenAmount+"张10元，"+twentyAmount+"张20元。合计"+(fiveAmount*5+tenAmount*10+twentyAmount*20)+"元\n");
        }else if(money==10){
            while (fiveAmount<1){
                try {
                    System.out.println("零钱不够，先等待一会");
                    wait();
                    System.out.println(Thread.currentThread().getName()+"继续买票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            fiveAmount-=1;
            tenAmount+=1;
            System.out.println("收到10元，给"+Thread.currentThread().getName()+"票。找回5元。");
            System.out.println("柜台有"+fiveAmount+"张5元，"+tenAmount+"张10元，"+twentyAmount+"张20元。合计"+(fiveAmount*5+tenAmount*10+twentyAmount*20)+"元\n");
        }else if(money==20){
            while (fiveAmount<3&&(tenAmount<1||fiveAmount<1)){
                try {
                    System.out.println("零钱不够，先等待一会");
                    wait();
                    System.out.println(Thread.currentThread().getName()+"继续买票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(fiveAmount>=3){
                fiveAmount-=3;
                twentyAmount+=1;
                System.out.println("收到20元，给"+Thread.currentThread().getName()+"票。找回15元(3张5元)。");
                System.out.println("柜台有"+fiveAmount+"张5元，"+tenAmount+"张10元，"+twentyAmount+"张20元。合计"+(fiveAmount*5+tenAmount*10+twentyAmount*20)+"元\n");
            }else {
                fiveAmount-=1;
                tenAmount-=1;
                twentyAmount+=1;
                System.out.println("收到20元，给"+Thread.currentThread().getName()+"票。找回15元(1张10元、1张5元)。");
                System.out.println("柜台有"+fiveAmount+"张5元，"+tenAmount+"张10元，"+twentyAmount+"张20元。合计"+(fiveAmount*5+tenAmount*10+twentyAmount*20)+"元\n");
            }

        }
        notifyAll();
    }
}
