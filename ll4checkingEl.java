import java.util.LinkedList;

public class ll4checkingEl {
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
        boolean chk_value=l_list.contains("G");
        if (chk_value){
            System.out.println("List contains the G");
        }else{
            System.out.println("List doesn't contains the G");
        }
    }
}
