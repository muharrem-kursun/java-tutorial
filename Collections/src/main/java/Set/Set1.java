package Set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String [] args) {
        Set<String> set = new HashSet<>();
        set.add("merhaba");
        set.add("merhaba");
        set.add("merhaba");
        set.forEach(System.out::println);
        System.out.println(set.size());//boyutuna 1 yazar
        /*
        * Görüldüğü üzere set aynı elemandan  sadece bir tane alabilir.
        *
         */




}
}
