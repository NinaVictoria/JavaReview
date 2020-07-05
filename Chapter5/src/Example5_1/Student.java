package Example5_1;

/**
 * @author : Nina
 * @time : 2020/7/5 8:40
 * @description : student extends people
 */
public class Student extends People {
    int number;

    void tellNumber() {
        System.out.println("学号是" + number);
    }

    int add(int x, int y) {
        return x + y;
    }
}
