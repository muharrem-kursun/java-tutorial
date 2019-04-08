package DateAndCalender;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
       Date date = new Date();
        Date date1 = new Date();
       long result = 0;
       long d = date.getTime();//1970 ten bu güne kadar olan toplam milisaniye
        System.out.println(d);
        //diğer yöntem
        long d1 = System.currentTimeMillis();
        result =  d1/1000;
        System.out.println("saniye : "+result);
        result /=60;
        System.out.println("dakika: "+result);
        result/=60;
        System.out.println("saat : "+result);
        result/=24;
        System.out.println("gun  : "+result);
        result/=365;
        System.out.println("Yil : "+result);

        //karşılaştırma

        int compare = date.compareTo(date1);
        System.out.println(compare);
        // ekrana 0 yazarsa eşit ekrana 1 yazarsa date büyük, ekrana -1 yazarsa date küçüktür.

    }
}
