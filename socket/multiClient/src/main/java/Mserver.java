import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Mserver {
    ArrayList<MserverThread> mserverThreads = new ArrayList<MserverThread>();
      ServerSocket serverSocket = null;
     Socket socket = null;
      boolean shouldRun =true;
    public Mserver() {

        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("server 9999 portunu dinliyor");
            while (shouldRun)
            {
                socket = serverSocket.accept();
                MserverThread mserverThread = new MserverThread(socket,this);
                mserverThreads.add(mserverThread);
                mserverThread.start();

            }
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        try{
            serverSocket.close();

        }
        catch (Exception e)
        {

        }

    }
    public static void main(String []args)
    {
       new Mserver();
        
    }
}
