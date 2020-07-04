import java.util.Scanner;

/**
 * @author: Nina
 * @time: 2020/7/4 13:43
 * @description: 折半查找
 */
public class Example2_5 {
    public static void main(String[] args) {
        int start, middle, end;
        int a[] = {20, -2, 23, 89, 333, -98, -74};
        final int N = a.length;
        //选择法排序
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        //折半查找
        start = 0;
        end = N;
        middle = (start + end) / 2;
        while (number != a[middle]) {
            if (number > a[middle])
                start = middle;
            else if (number < a[middle])
                end = middle;
            middle = (start + end) / 2;
            count++;
            if (count > N / 2)
                break;
        }
        if (count > N / 2)
            System.out.println(number + "不在数组中");
        else System.out.println(number + "在数组中");

    }
}
