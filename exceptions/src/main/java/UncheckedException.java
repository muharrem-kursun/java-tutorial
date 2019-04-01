public class UncheckedException {
    // 40 sayısını 0'a böldüm böylece sıfıra bölünme hatası aldım
    public static void main(String[] args) {

        int x = 40;
        int y = 0;
        int sonuc  = 0;
        try {
            sonuc = x/y;
        }
        catch (ArithmeticException e)
        {
            System.out.println("hata yakalandı  "+e);

        }

    }
}
