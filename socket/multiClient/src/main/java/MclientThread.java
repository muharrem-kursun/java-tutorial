import java.io.BufferedReader;

public class MclientThread extends Thread{
    BufferedReader bufferedReader  ;

    public MclientThread(BufferedReader bufferedReader )
    {
        this.bufferedReader = bufferedReader;

    }
    @Override
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
