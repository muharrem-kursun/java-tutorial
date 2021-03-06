import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class MserverThread extends  Thread{

    private BufferedReader bufferedReader = null;
    private Mserver mserver = null;
    private BufferedReader kbufferedreader = null;
    private PrintWriter printWriter = null;
    private Socket socket = null;
    private String input = null;
    private boolean shouldRun = true;
    private int id =0;
    private String name = "";
    public MserverThread(Socket socket , Mserver mserver) {
        this.socket = socket;
        this.mserver = mserver;
        id++;//silme işlemi için
    }
    @Override
    public void run() {

        try {

                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//gelen veriyi okumak için
                kbufferedreader = new BufferedReader(new InputStreamReader(System.in));//veri girmek için
                printWriter = new PrintWriter(socket.getOutputStream());//veri göndermek için

            try {


                    name = bufferedReader.readLine();
                    System.out.println(name +" odaya katıldı   "+new Date());//odaya katılan kullanıcılar yazılıyor.


                while (shouldRun) {
                        try {
                            input = bufferedReader.readLine();//veriyi okumak için
                        }
                        catch (Exception e)
                        {
                            System.out.println( name +"   odadan ayrıldı  " +new Date());//odaya katılan kullanıcıtı yazdırmak için
                            break;
                        }

                            System.out.println( input); //mesajı sever ekranına basmak için
                            sendStringToAllClient(input);//mesajı tüm clientlere göndermek için

                }
            }
            catch (NullPointerException e1)
                { //kapatma işlemleri için
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
        try { // kapatma işlemleri için

            socket.close();
            printWriter.close();
            bufferedReader.close();
            kbufferedreader.close();
            mserver.mserverThreads.remove(id-1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }



    private  void sendStringToClient(String text)
    {
        printWriter.println(text);
        printWriter.flush();
    }

    private void sendStringToAllClient(String text)
    {
     for(int i = 0; i < mserver.mserverThreads.size(); i++)
     {
         MserverThread mserverThread = mserver.mserverThreads.get(i);
         mserverThread.sendStringToClient(text);
     }
    }
}
