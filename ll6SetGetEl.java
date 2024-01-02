import java.util.LinkedList;

public class ll6SetGetEl {
    public static void main(String[] args) {
        LinkedList<String> l_list=new LinkedList<String>();
        l_list.add("B");
        l_list.add("C");
        l_list.addLast("G");
        l_list.addFirst("A");
        l_list.add(3,"D");
        l_list.add("E");
        l_list.add("F");
        System.out.println("Linked List : "+l_list);
        Object element=l_list.get(3);
        System.out.println("Element returned by get(): "+element);
        l_list.set(3,"J");
        System.out.println("Linked list after change: "+l_list);
    }
}
