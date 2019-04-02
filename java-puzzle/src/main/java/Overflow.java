public class Overflow {
  static  final long MICRO_DAY=24*60*60*1000*1000;//burada çarpma işlemini sanki int bir değişken içinmiş gibi yapıyor.
  static final long MILLES_DAY=24*60*60*1000;
  static final long MICRO_DAY2=24L*60*60*1000*1000;//Burada "L" yazarak bu değişkenin long türünden oldunu belirtiyorum

    public static void main(String[] args) {
        System.out.println(MICRO_DAY);
        System.out.println(MICRO_DAY2);
        System.out.println(MILLES_DAY);
    }
}
