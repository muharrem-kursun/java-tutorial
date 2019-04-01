import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Mserver {
    //gerekli nesneleri tanımlayıp ilklendiriyoruz.
    protected ArrayList<MserverThread> mserverThreads = new ArrayList<MserverThread>();
    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private boolean shouldRun =true;//while kontrolü için
    public Mserver() {

        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("server 9999 portunu dinliyor");
            while (shouldRun)
            {
                socket = serverSocket.accept();//socket ile bağlentı sağlandı
                MserverThread mserverThread = new MserverThread(socket,this);//MserverThread nesnesi oluşturuyorum ve this ile bu sınıfı referans ediyorum.
                mserverThreads.add(mserverThread);//arrayliste ekleme yapıyorum.
                mserverThread.start();//Thread 'i başlattım

            }
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        try{
            serverSocket.close();//serverSocketi kapatmak için

        }
        catch (Exception e)
        { e.printStackTrace();
        }

    }
    public static void main(String []args)
    {
       Mserver mserver = new Mserver();//yapıcı methodun tetiklenmesi için
        
    }
}
