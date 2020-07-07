package Example10_3;

import java.util.Random;

/**
 * @author : Nina
 * @time : 2020/7/7 14:23
 * @description : synchronized
 */
public class Example10_3 {
    public static void main(String[] args) {
        TicketHouse ticketHouse = new TicketHouse();
//        Thread a=new Thread(ticketHouse);
//        Thread b=new Thread(ticketHouse);
//        Thread c=new Thread(ticketHouse);
//        a.setName("A");
//        b.setName("B");
//        c.setName("C");
//        a.start();
//        b.start();
//        c.start();
        Thread thread;
        int i;
        while (true) {
            thread = new Thread(ticketHouse);
            Random random = new Random();
            i = random.nextInt(5);
            switch (i) {
                case 0:
                    thread.setName("A");
                    break;
                case 1:
                    thread.setName("B");
                    break;
                default:
                    thread.setName("C");
                    break;

            }
            thread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
