import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Dclient {


    public static  void main (String []args)
    {
        Socket csocket = null;
        BufferedReader input = null;
        BufferedReader kinput = null;
        PrintStream output = null;

        Scanner scan = new Scanner(System.in);
        String word = " ";
        String wordIn = " " ;


        try{
            csocket = new Socket("127.0.0.1", 2020);
            input = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
            kinput = new BufferedReader(new InputStreamReader(System.in));
            output = new PrintStream(csocket.getOutputStream());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        try {
            while (true)
            {

                if((wordIn = input.readLine()) != null)
                {
                    System.out.println("server : "+wordIn);
                }

                word = kinput.readLine();
                output.println(word);
                output.flush();
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
