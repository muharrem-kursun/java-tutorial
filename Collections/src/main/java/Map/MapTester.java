package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        fillData(map);
        map.forEach((k ,v) ->System.out.printf("%s %s%n",k,v));//foreach'le ekrana yazdırdım.
        map.remove("kırtasiye");//silme işlemini yapıyorum.
        map.put("Intellij IDEA","java");//ekleme işlmeni yapıyorum.
        map.forEach((k,v)-> System.out.println(k + "  " + v));
    }

    private static void fillData(Map<String, String> map) {
        map.put("kırtasiye","silgi");
        map.put("elektronik","bilgisayar");
    }
}
