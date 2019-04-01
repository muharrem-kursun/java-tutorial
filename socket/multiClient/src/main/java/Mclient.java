import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class Mclient {

    private Socket socket;
    private BufferedReader bufferedReader ;
    private  BufferedReader kbufferedReader1 ;
    private PrintWriter printWriter ;
    private String output = null;
    private String name = null;

    public  Mclient (String name)
    {
        this.name=name;
        start();
    }

    public void start()
    {
        try { //gerekli nesneleri oluşturuyoruz.
            socket = new Socket("127.0.0.1",9999);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            kbufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
            printWriter = new PrintWriter(socket.getOutputStream());

            printWriter.println(name);//server'a ilk olarak adını göndermesi için
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        write();
    }
    public void write()
    {
        try{// Burada okuma ve gönderme işlemi yapıyoruz.
            MclientThread mclientThread = new MclientThread(bufferedReader);
            mclientThread.start();
            while (true)//veriyi okuyup gönderiyoruz.
            {

                output = kbufferedReader1.readLine();
                printWriter.println(name +"  : "+output);
                printWriter.flush();


            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //kapatma işlemleri için
        try{
            socket.close();
            printWriter.close();
            bufferedReader.close();
            kbufferedReader1.close();
            System.out.println(name + "  kapatildi ");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bir ad giriniz. ");
    String name =scanner.nextLine();
    Mclient mclient = new  Mclient(name);
    }
}
