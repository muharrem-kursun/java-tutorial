import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class MserverThread extends  Thread{

    BufferedReader bufferedReader = null;
    Mserver mserver = null;
    BufferedReader kbufferedreader = null;
    PrintWriter printWriter = null;
    Socket socket = null;
    String input = null;
    boolean shouldRun = true;
    int id =0;
    public MserverThread(Socket socket , Mserver mserver) {
        this.socket = socket;
        this.mserver = mserver;
        id++;
    }
    @Override
    public void run() {
        String name = "";
        try {

                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                kbufferedreader = new BufferedReader(new InputStreamReader(System.in));
                printWriter = new PrintWriter(socket.getOutputStream());

            try {


                    name = bufferedReader.readLine();
                    System.out.println(name +" odaya katıldı   "+new Date());


                while (shouldRun) {
                        try {
                            input = bufferedReader.readLine();
                        }
                        catch (Exception e)
                        {
                            System.out.println( name +"   odadan ayrıldı  " +new Date());
                            break;
                        }

                            System.out.println( input);
                            sendStringToAllClient(input);



                }
            }
            catch (NullPointerException e1)
                {
                    e1.printStackTrace();
                    mserver.mserverThreads.remove(id-1);
                    socket.close();
                    printWriter.close();
                    bufferedReader.close();
                    kbufferedreader.close();
                } catch (Exception e)
                {
                    e.printStackTrace();

                }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {

            socket.close();
            printWriter.close();
            bufferedReader.close();
            kbufferedreader.close();
            mserver.mserverThreads.remove(id-1);
        }
        catch (Exception e)
        {

        }


    }



    public void sendStringToClient(String text)
    {
        printWriter.println(text);
        printWriter.flush();
    }

    public void sendStringToAllClient(String text)
    {
     for(int i = 0; i < mserver.mserverThreads.size(); i++)
     {
         MserverThread mserverThread = mserver.mserverThreads.get(i);
         mserverThread.sendStringToClient(text);
     }
    }
}
