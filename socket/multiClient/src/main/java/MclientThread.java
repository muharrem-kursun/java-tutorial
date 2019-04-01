import java.io.BufferedReader;

public class MclientThread extends Thread{

    private BufferedReader bufferedReader;

    public MclientThread(BufferedReader bufferedReader )
    {
        this.bufferedReader = bufferedReader;//this ile bu sayfadaki bufferedReader nesnesini referans verip gelen nesneyi içine atıyorum.

    }
    @Override
    //okuma ve ekrana yazma işlemleri için
    public void run() {

        while (true)
        {
            try {
                String s=bufferedReader.readLine();
                System.out.println(s);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }


    }
}
