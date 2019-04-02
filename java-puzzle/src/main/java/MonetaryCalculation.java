import java.math.BigDecimal;

public class MonetaryCalculation  { //parasal hesaplama

    public static void main(String[] args) {
        System.out.println(2.0 - 1.0);
        System.out.println(2.0 - 1.1);
        System.out.println(2.0 - 1.2);
        System.out.println(2.0 - 1.3);
        System.out.println(2.0 - 1.4);
        System.out.println(2.0 - 1.5);
        System.out.println(2.0 - 1.6);
        System.out.println(2.0 - 1.7);
        System.out.println(2.0 - 1.8);
        System.out.println(2.0 - 1.9);
        System.out.println(2.0 - 2.0);
        //printf("%.2f") çözümü

        System.out.printf("aslında olması gereken  "+"%.2f \n",2.0-1.1);
        System.out.printf("aslında olması gereken  "+"%.2f \n",2.0-1.4);
        System.out.printf("aslında olması gereken  "+"%.2f \n",2.0-1.6);
        System.out.printf("aslında olması gereken  "+"%.2f \n",2.0-1.7);
        System.out.printf("aslında olması gereken  "+"%.2f \n",2.0-1.8);
        System.out.printf("aslında olması gereken"+"%.2f \n",2.0-1.9);

        //diğer çözüm BigDecimal sınıfının String contructor'u
        System.out.println(new BigDecimal("2.0").subtract( new BigDecimal("1.1")));
        System.out.println(new BigDecimal("2.0").subtract( new BigDecimal("1.4")));
        System.out.println(new BigDecimal("2.0").subtract( new BigDecimal("1.6")));
        System.out.println(new BigDecimal("2.0").subtract( new BigDecimal("1.7")));
        System.out.println(new BigDecimal("2.0").subtract( new BigDecimal("1.8")));
        System.out.println(new BigDecimal("2.0").subtract( new BigDecimal("1.9")));
    }
}
