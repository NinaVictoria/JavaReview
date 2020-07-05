package Example8_3;

/**
 * @author : Nina
 * @time : 2020/7/5 21:22
 * @description : Commonly used class:Calendar
 * print a calendar of a month
 */
public class Example8_3 {
    public static void main(String[] args) {
        CalendarBean calendarBean = new CalendarBean();
        calendarBean.setYear(2020);
        calendarBean.setMonth(7);
        String[] a = calendarBean.getCalender();
        char[] str = "日一二三四五六".toCharArray();
        for (char c : str) {
            System.out.printf("%5c", c);
        }
        for (int i = 0; i < a.length; i++) {
            if (i % 7 == 0)
                System.out.println("");
            System.out.printf("%5s", a[i]);
        }
    }

}
