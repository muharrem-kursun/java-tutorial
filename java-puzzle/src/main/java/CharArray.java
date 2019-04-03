public class CharArray {
    public static void main(String[] args) {
        char [] number = {'1','2','3'};

        System.out.println(number);
        System.out.println("array : "+ number);//çıktısı array : [C@1b6d3586 oluyor.
        //çözüm yolu bir
        System.out.println("array : "+ String.valueOf(number));
        //çözüm yolu iki
        System.out.print("array : ");
        System.out.println(number);
    }
}
