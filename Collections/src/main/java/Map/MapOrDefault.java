package Map;

import java.util.HashMap;
import java.util.Map;

public class MapOrDefault {
    public static void main(String[] args) {
        Map<String, Integer> map = fillData();
        map.put("d",1+ map.getOrDefault("d",0));//value 'ya default value degeri verir.
        //map.put("d",+ map.getOrDefault("d",0));//bu şekilde de çalışır ama deger direkt 0 yükler.
        map.forEach((k,v)->System.out.println(k+" "+v));

    }
    private static Map fillData()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);

        return map;
    }
}
