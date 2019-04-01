import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class Mclient {

    Socket socket1 ;
    BufferedReader bufferedReader ;
    BufferedReader kbufferedReader1 ;
    PrintWriter printWriter ;
    Scanner scanner = new Scanner(System.in);
    String input = null;
    String output = null;
    String name = null;
    ArrayList<MclientThread> arrayList ;
    public  Mclient (String name)
    {
        this.name=name;
        start();
    }

    public void start()
    {
        try {
            socket1 = new Socket("127.0.0.1",9999);
            bufferedReader = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
            kbufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
            printWriter = new PrintWriter(socket1.getOutputStream());
            arrayList = new ArrayList<MclientThread>();
            printWriter.println(name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        write();
    }
    public void write()
    {
        //System.out.println(" Bir isim giriniz");
       // name =scanner.nextLine();

        try{
            MclientThread mclientThread = new MclientThread(bufferedReader);
            arrayList.add(mclientThread);
            mclientThread.start();
            while (true)
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
            socket1.close();
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

    new  Mclient(name);
    }
}
