package DateAndCalender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//getInstance() metodu GregorianCalendar türünden bir nesne dönderir
        System.out.println(calendar instanceof GregorianCalendar);//calendar nesnesinin GregorianCalendar türünden bir nesne olup olmadığını kontrol ediyor
        System.out.println(calendar);
        Date date = calendar.getTime();//getTime metodu date türünde bir değer geri dönderir.
        System.out.println(date);
    }
}
