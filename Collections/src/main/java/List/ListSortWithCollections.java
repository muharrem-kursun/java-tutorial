package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortWithCollections {
    public static void main(String[] args) {
        List<Integer> list = loadData();
        Collections.sort(list);
        //list.forEach(li->System.out.println(li));
        list.forEach(System.out::println);//üsttekide buda aynı işi görür.

        //baska bir sırama yolu
        List<Integer> list1 = loadData();
        Collections.sort(list,(o1,o2)->(o1>o2 ? 1:(o1==o2 ? 0 : -1)));//bir işe yaramadı
        //ben büyükten küçüğe odgru sıralar diye düşünmüştüm ???
        list1.forEach(System.out::println);

    }

    private static List<Integer> loadData()
    {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,62,13,4,85,67,7));
        return list;
    }
}
