import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class CheckedException {
    //dosya bulanamadı hatası var
    public static void main(String[] args) {

        File file = new File("deneme.txt");//File türünden bir nesne tanımladım.
        FileInputStream fileInputStream = null;// FileInputStream nesnesi oluşturdum.
        try {
            fileInputStream = new FileInputStream(file);//  fileInputStream nesnesine file' ı parametre olarak verdim.
            fileInputStream.read();// fileInputStream nesnesini okudum.
        }
        catch (IOException e)
        {
            System.out.println("hata bulundu "+e);//hata mesajı yazdırdım.
        }
    }
}