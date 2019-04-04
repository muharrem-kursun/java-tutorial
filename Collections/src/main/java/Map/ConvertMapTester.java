package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapTester {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        fillData(map);
        String[] dizi = convertArray(map);//map'i diziye dönüştürdüm.
        for (String s:dizi) {
            System.out.println(s);
        }
        List<String> list = convertList(map);
        list.forEach(System.out::println);//foreach ile list yazdırma.

    }

    private static List<String> convertList(Map<String, String> map) {
        List<String > list = new ArrayList<>(map.keySet()) ;//map' ın key'lerini list'e atar.
        return list;
    }

    private static String[] convertArray(Map<String, String> map) {
        return map.keySet().toArray(new String[map.keySet().size()]);//map'ın key'lerini diziye atar.
    }

    private static void fillData(Map<String, String> map) {
        map.put("kırtasiye","kalem");
        map.put("kantin","cay ");
        map.put("restorant","yemek");
    }
}
