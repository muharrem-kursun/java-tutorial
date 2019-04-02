public class CompoundAssignment {

    public static void main(String[] args) {
        int x = 50;
        long y = 20;
        String ad = "muharrem  ";
        Object soyad = "kurşun  ";
        y+=x;
       // x=x+y; bu ile üstteki işlem aynı gibi görünebilir ama bu işlem casting ister.
        System.out.println(y);

        ad+=soyad;
        System.out.println(ad);
        ad+=y;
        System.out.println(ad);
    }
}
