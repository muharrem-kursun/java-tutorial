package DateAndCalender;

import java.util.Calendar;

public class CalendarExample2 {
    public static void main(String[] args) {
        Calendar  calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);//yıl degerini alır.
        int month = calendar.get(Calendar.MONTH);//ay degerini alır ve aylar 0 dan başlar
        int day = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);//bu aydaki hatfanın kacıncı günü oldugunu alır 1->sunday.
        int day2 = calendar.get(Calendar.DAY_OF_YEAR);//yılın kacıncı günü oldugunu verir.

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(day2);
    }
}
