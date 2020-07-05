package Example8_3;

import java.util.Calendar;

/**
 * @author : Nina
 * @time : 2020/7/5 21:22
 * @description : CalendarBean
 */
public class CalendarBean {
    int year = 0, month = 0;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String[] getCalender() {
        String[] a = new String[42];
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int weedDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int day = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            day = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            day = 30;
        else if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                day = 29;
            else day = 28;
        }
        for (int i = 0; i < weedDay; i++)
            a[i] = " ";
        for (int i = weedDay, n = 1; i < weedDay + day; i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        for (int i = weedDay + day; i < a.length; i++)
            a[i] = " ";
        return a;
    }
}
