public class Ternary {
    public static void main(String[] args) {

        int number1=0;
        int number2 = 20;
        char word = 'f';

        //her ikisinin aynı tip oldugu durum
        System.out.println(true ? number2 : number1);//number2'yi yazar  false olsaydı number1'i yazardı.
        System.out.println(number2>15 ? number2 : number1);//number2'yi yazar  false olsaydı number1'i yazardı.
        System.out.println(number2<15 ? number2 : number1);//number1 i yazar  true olsaydı number2'yi yazardı.
        System.out.println(false ? number2 : number1);//number1 'i yazar  true olsaydı number2'yi yazardı.

        // her ikisinin farklı tipte olduğu durum
        System.out.println(true ? word : 0);//ekrana f değerini yazar
        System.out.println(false ? number1  : word); //ekrana normalde f degerini yazmasını beklerken 102 degerini yazıyor ->
        //-> yani f' in ASCI karşılığını yazıyor bunun nedeni numberin türünün int olması
        System.out.println(true ? word : number1);// yer değişimide sonucu değiştirmiyor
    }
}

