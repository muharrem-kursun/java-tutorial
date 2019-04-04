package Map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {
    public static void main(String[] args) {
        Map<String,Integer> map = createMap();
        Integer calculatedValue = map.computeIfAbsent("k",it-> 0);
        //eger key degeri aynı olan bir ifade yok ise map'e ekler
        //ve geriye value degerini dönderir.
        System.out.println(calculatedValue);
        map.keySet().forEach(key ->System.out.println(key + "  " + map.get(key) ));//foreach döngüsü ile ekrana key ve value'yi yazıyoruz.
        //map.get(key)  value degerini verir


    }

    private static Map<String, Integer> createMap() {
        Map<String ,Integer> map = new HashMap<>();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);
        map.put("d",0);

        return map;
    }
}
