import java.util.LinkedList;

public class ll5CheckingSize {
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
        int size=l_list.size();
        System.out.println("Size of linked list= "+size);
    }
}
