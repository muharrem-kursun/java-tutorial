package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("deneme1","deneme2");//birinci eleman ekleme yöntemi
        List<String> anotherList = new ArrayList<String>();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        anotherList.add("eyüp");//ikinci eleman ekleme yöntemi
        anotherList.add("emir");

        list.forEach(System.out::println);//foreach ile okuma yapıyoruz.

        for (String isim: anotherList) {//foreach ile okuma yapıyoruz.
            System.out.println(isim);
        }

        for (int i =0 ; i<numbers.size();i++)//for ile okuma yapıyoruz.
        {
            System.out.println(numbers.get(i));
        }

    }
}
