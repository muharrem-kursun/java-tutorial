public class StringPool {
    public static void main(String[] args) {
        String string1 = "java8";
        String string2 = "java"+"8";

        System.out.println(string1==string2);

        String string3 = "java8";
        final String number ="8";
        String string4 = "java"+number;
        System.out.println(string3==string4);//true döner çünkü number değişkeni sabit değişken özelliği gösterir.

        String string5 = "java8";
        String number2 ="8";
        String string6 = "java"+number2;
        System.out.println(string5==string6);//false
        //eger intern metodunu kullanırsak sabit eşitlik olamayan değişkenleride kapsar.
        System.out.println(string5.intern()==string6.intern());//true

        String string7 = "java8";
        String string8 = "java"+getString();
        System.out.println(string7==string8);
        //equals metodu
        String string9 = new String("java8");
        String string10 = new String("java8");
        System.out.println(string9==string10);
        System.out.println(string9.equals(string10));//true
    }

    private static String getString() {
        return "8";
    }
}

