public class CharConcanetation {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("A"+"B");
        System.out.println('A'+'B');// A = 65 , B = 66 dır böyle yazarsak 65 + 66 = 131 yazacaktır.
        //char karakterlerini birleştirmenin birinci yolu
        sb.append('A');
        sb.append('B');
        System.out.println(sb);
       //ikinci yol
        System.out.printf("%c%c\n",'A','B');
        //üçüncü yolu
        System.out.println(""+'A'+'B');//"" ile burdan sonra gelen değerin String  olduğunu belirtiyoruz.
//böylece 'A'+'B' ifadesinin "A"+"B" olarak görüyor.
//Bu aynı zamanda  söyle bir olaya daha neden olur.
        System.out.println(""+4+4);//ekrana 8 yazması gerekirken 44 yazıyor.

     }

}
