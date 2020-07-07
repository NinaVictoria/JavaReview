package Example12_1;

/**
 * @author : Nina
 * @time : 2020/7/7 11:02
 * @description : Multi Thread
 */
public class Example12_1 {
    public static void main(String[] args) {
        SpeakCar speakCar = new SpeakCar();
        SpeakElephant speakElephant = new SpeakElephant();
        speakCar.start();
        speakElephant.start();
        for (int i = 0; i < 30; i++) {
            System.out.print("主线" + i + "   ");
        }
    }
}
