public class Swap {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;
        System.out.println("değişimden önce ");
        System.out.println("x : "+x+" y : "+ y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("değişimden sonra");
        System.out.println("x : "+x+" y : "+ y);
        x=x^y;//x ile y'yi veya işlemine tabi tutup çıkan değeri x'e yükledik
        y=x^y;//x ile y'yi veya işlemine tabi tutup çıkan değeri y'ye yükledik
        x=x^y;//x ile y'yi veya işlemine tabi tutup çıkan değeri x'e yükledik
        System.out.println("ikinci değişimden sonra");
        System.out.println("x : "+x+" y : "+ y);
    }
}
