package List.Stack;


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push(" merhaba");//eleman ekledim
        stack.push(" nasılsın");
        System.out.println("stack ' in ilk hali  :  "+stack);//stack'i ekrana yazdırdım.

        System.out.println("stack ' ten pop işlemi yaparsak : "+stack.pop());//stackten veri aldım eğer stackten veri çekersen o veri kuyruktan silinir.

        System.out.println("stack ' in son hali "+stack);
    }
}
