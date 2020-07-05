/**
 * @author : Nina
 * @time : 2020/7/5 10:40
 * @description : Inner class
 */
public class Example7_1 {
    public static void main(String[] args) {
        RedCowFarm farm = new RedCowFarm("East Farm");
        farm.showCowMessage();
        farm.redCow.speak();
    }
}

class RedCowFarm {
    static String formName;
    RedCow redCow;

    public RedCowFarm() {
    }

    public RedCowFarm(String s) {
        formName = s;
        redCow = new RedCow(150, 112, 5000);
    }

    public void showCowMessage() {
        redCow.speak();
    }


    class RedCow {
        String cowName = "Red Bull";
        int height, weight, price;

        public RedCow(int height, int weight, int price) {
            this.height = height;
            this.weight = weight;
            this.price = price;
        }

        void speak() {
            System.out.println("I am " + cowName + ",weight " + weight + "kg.");
        }
    }
}
