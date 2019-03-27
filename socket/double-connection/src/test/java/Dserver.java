import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Dserver {
    public static void main(String [] args)
    {
        ServerSocket serverSocket = null;
        Socket socket = null;
        PrintWriter printWriter = null;
        BufferedReader kbufferedReader = null;
        BufferedReader bufferedReader = null;
        Scanner scanner = new Scanner(System.in);
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
            printWriter = new PrintWriter(socket.getOutputStream());
            kbufferedReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try {

            while(true)
            {
              
               output = kbufferedReader.readLine();
               printWriter.println(output);
               printWriter.flush();
               if((input=bufferedReader.readLine())!=null)
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
