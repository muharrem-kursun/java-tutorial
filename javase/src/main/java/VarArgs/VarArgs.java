package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        varArgs(9,65,55);
        varArgs('c',43,3434,34);
    }
    public  static  void varArgs(int ...x)
    {
        System.out.println(x.length);
    }
    public  static  void varArgs(char c,int ...x)
    {
        System.out.println(x.length);
    }
    /*	void method3(int...x , char c) {
		// Var-arg parametresi en sonda olmalidir
	}*/

/*	void method4(int ...z,int... x) {
		// Sadece bir tane var-arg parametresi kullanilabilir.
	}*/

/*	void method5(int x...) {
	 	// 3 nokta parametre isminden once gelmelidir.
	}*/
}
