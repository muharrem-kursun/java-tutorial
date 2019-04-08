package Enum;
enum Telephone{
    LG, SAMSUNG, VESTEL, IPHONE;//büyük harf olma kuralı yok ama genel standart böyle
     }

public class Enum {
    Telephone marka;//enum türünde bir değişken tanımladık

    public static void main(String[] args) {
        Enum tenum = new Enum();
        tenum.marka= Telephone.LG;
        System.out.println(tenum.marka);
    }
}
