import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Dserver {
    public static void main(String [] args)
    {
     //ilklendirmeleri yapıyoruz
        ServerSocket serverSocket = null;
        Socket socket = null;
        PrintWriter printWriter = null;
        BufferedReader kbufferedReader = null;
        BufferedReader bufferedReader = null;
        String input= " ";
        String output=" ";
        int port = 2020;
        try{
            serverSocket = new ServerSocket(port);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try{
            socket = serverSocket.accept();
            printWriter = new PrintWriter(socket.getOutputStream());//client e veri göndermek için
            kbufferedReader = new BufferedReader(new InputStreamReader(System.in));//değer girmek için
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//client ten gelen veriyi almak için
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try {

            while(true)
            {
                // System.out.println("birseyler gir");
                output = kbufferedReader.readLine();//veri girişi için
                printWriter.println(output);//client e veri yolluyoruz
                printWriter.flush();//akış temizler read ve write zincirlerini kırar.
                if((input=bufferedReader.readLine())!=null)//client ten gelen veri null değilse ekrana yazıyoruz
                {
                    System.out.println(" Client :  "+ input);
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                printWriter.close();
                socket.close();
                serverSocket.close();
                bufferedReader.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }


        }
    }



}
