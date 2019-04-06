package List.Queue;


import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class QueueExample {
    public static void main(String[] args) {
        String name ;
        Queue<String> queue  =new LinkedList<String>();
        queue.add("ilk eleman");
        queue.add("ikinci eleman");
        queue.add("üçüncü eleman");
        System.out.println("Queue ' nin ilk hali : "+queue);
        name = queue.remove();//remove işlemi ilk elemanı siler ve geriye sildiği elemanın değerini dönderir.
        System.out.println("remove 'dan sonra queue : "+queue + "silinen deger :  "+ name);
        name = queue.poll();//kuyruktaki ilk elemanın değerini alır ve elemanı kuyruktan siler eğer eleman yoksa null degeri dönderir.
        System.out.println("pool ' dan sonra name degeri : "+name);
        System.out.println("Queue' nin son hali : "+queue);
    }
}
