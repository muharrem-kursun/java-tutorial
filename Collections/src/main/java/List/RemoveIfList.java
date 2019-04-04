package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfList {
    public static void main(String[] args) {
        List<String> list= add();
        list.removeIf(s -> s.toLowerCase().contains("a"));//içinde a olanları siler
        //ama burada toLowerCase() yaptıgı için büyük küçük farketmez çünkü  toLowerCase() string'deki tüm harfleri küçük yapar.
        list.forEach(s -> System.out.println(s));
    }

    private static List<String> add() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ali " ,"ahmet","mehmet"));
        return list;
    }
}
