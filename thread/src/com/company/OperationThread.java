package com.company;

public class OperationThread implements Runnable{
    int a,b,belirle,sonuc;
    OperationsImpl opimlp;

    public OperationThread(int a, int b, int belirle) {
        this.a = a;
        this.b = b;
        this.belirle = belirle;
        opimlp=new OperationsImpl();
    }

    @Override
    public void run() {//Her Thread run metodunun içindeki işi ve bu metot otamatik olarak tetiklenir.

        if(belirle==1)
        {
            sonuc = opimlp.toplama(a,b);
            System.out.println(" Toplama : "+sonuc);
        }
        else if(belirle==2)
        {
            sonuc = opimlp.cikarma(a,b);
            System.out.println(" Cikarma : "+sonuc);
        }
        else if (belirle==3)
        {
            sonuc = opimlp.carpma(a,b);
            System.out.println("Carpma : "+sonuc);
        }
        else if(belirle==4)
        {
            sonuc = opimlp.bolme(a,b);
            System.out.println("Bolme : "+sonuc);
        }
    }


}
