public class Oddity {
    public boolean isOdd(int number)
    {
        //return number%2==1; negatif sayılar için çalışmaz
        return number%2!=0;//negatif için çalışır.
        //return (number & 1) == 1  number ile 1 sayisini ikilik tabana göre karşılaştırır.
    }
    public static void main(String[] args) {
        Oddity oddity = new Oddity();

        System.out.println(oddity.isOdd(5));
        System.out.println(oddity.isOdd(6));
        System.out.println(oddity.isOdd(-5));


    }
}
