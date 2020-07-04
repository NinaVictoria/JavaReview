package Example4_2;

/**
 * @author : Nina
 * @time : 2020/7/4 22:57
 * @description : args in method
 */
public class Example4_2 {
    public static void main(String[] args) {
        Battery battery = new Battery(100);
        System.out.println("Battery's amount is:" + battery.electricityAmount);
        Radio radio = new Radio();
        System.out.println("Open radio,use battery");
        radio.openRadio(battery);
        System.out.println("Battery's amount is:" + battery.electricityAmount);
        System.out.println("Open radio again,use battery");
        radio.openRadio(battery);
        System.out.println("Battery's amount is:" + battery.electricityAmount);
    }
}
