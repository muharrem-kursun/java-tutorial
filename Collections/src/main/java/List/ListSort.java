package List;
import java.util.Arrays;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        List<String> list1 = add();
        list1.sort(null);//normal sıralama yapıyoruz
        list1.forEach(System.out::println);

        List<String> list2 = add();
        list2.sort(( sort1 , sort2) -> sort1.compareToIgnoreCase(sort2));//küçük büyük haft ayrımı yapmadan sıralama yapıyoruz
        list2.forEach(System.out :: println);

        List<String> list3 = add();
        list3.sort(String :: compareToIgnoreCase);//küçük büyük haft ayrımı yapmadan sıralama yapıyoruz
        list3.forEach(System.out :: println );
    }
    public  static List<String> add()
    {
        return Arrays.asList("Ali","ahmet","Mehmet");
    }
}
