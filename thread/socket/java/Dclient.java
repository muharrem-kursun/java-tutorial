import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Dclient {


    public static  void main (String []args)
    {
        //ilklendirmeler yapıldı.
        Socket csocket = null;
        BufferedReader input = null;
        BufferedReader kinput = null;
        PrintStream output = null;
        String word = " ";
        String wordIn = " " ;


        try{
            csocket = new Socket("127.0.0.1", 2020);
            input = new BufferedReader(new InputStreamReader(csocket.getInputStream()));//serverdan gelen veriyi almak için
            kinput = new BufferedReader(new InputStreamReader(System.in));//veri yazmak için
            output = new PrintStream(csocket.getOutputStream());//yazdığımız veriyi servere göndermek için
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        try {
            while (true)
            {

                if((wordIn = input.readLine()) != null)//serverdan gelen veriyi alır.
                {
                    System.out.println("server : "+wordIn);
                }

                word = kinput.readLine();//veri girmek için
                output.println(word);
                output.flush();//akış temizler read ve write zincirlerini kırar.
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                output.close();
                input.close();
                csocket.close();


            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
