package Example12_1;

/**
 * @author : Nina
 * @time : 2020/7/7 10:59
 * @description :
 */
public class SpeakElephant extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            System.out.print("大象" + i + "   ");
        }
    }
}
