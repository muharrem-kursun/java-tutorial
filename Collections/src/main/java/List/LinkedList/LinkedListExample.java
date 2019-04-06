package List.LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        LinkedList<String> linkedList1 = new LinkedList<String>();

        linkedList.add("deneme");//eleman ekler
        linkedList.add("ldldll");
        linkedList.add("ldllds");
        linkedList.add(5,"jjdfk");//belirli bir indise eleman ekler.
        linkedList1.add("kkldksdkl");
        linkedList.addAll(linkedList1);//Belirli bir collection nesnesi ekler
        linkedList.addAll(5,linkedList1);//belirli bir indisten itibaren bir collection nesnesi ekler
        linkedList.addFirst("first");//listenin en başına ekler
        linkedList.addLast("last ");//Listenin En Sonuna Ekler
        linkedList.contains(linkedList1);//Listenin içinde eleman varmı diye bakar.



    }
}
