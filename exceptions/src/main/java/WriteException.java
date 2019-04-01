public class WriteException {
    //eger 5 ten büyük sayı girilirse sayi 5 ten büyük diye yazdırma yaptım.
    public WriteException(int number)
    {
        runtimeException(number);//metodu tetikledim
    }
    public  void runtimeException(int number)
    {
        if (number>5)
        throw new RuntimeException("girilen sayi 5 ten buyuk"); // kendi çalışma zamanı hata mesajımı yazdım.
    }
    public static void main(String[] args) {

        WriteException writeException = new WriteException(6);// 6 sayısını yapıcıya gönderdim
    }
}
