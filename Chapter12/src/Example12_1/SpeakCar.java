package Example12_1;

/**
 * @author : Nina
 * @time : 2020/7/7 11:01
 * @description :
 */
public class SpeakCar extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.print("汽车" + i + "   ");
        }
    }
}
