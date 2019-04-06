package List.TreeMap;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1,"birinci");//eleman ekleme
        treeMap.put(2, "ikinci");//eleman ekleme
        treeMap.put(3,"ücüncü");//eleman ekleme

        Set set =  treeMap.entrySet();// treeMap' i set'e atadık
        Iterator iterator = set.iterator();// set için bir iterator tanımladık
        while(iterator.hasNext())//iteratorde bir sonraki eleman varmı kontrolu yaptık
        {
            Map.Entry mentry = (Map.Entry) iterator.next();//iteratordeki degeri Map.entry türüne cast edip mentry değişkenine yükledik.
            System.out.print("key : "+ mentry.getKey() + " value : ");
            System.out.println(mentry.getValue());

        }


    }



}
