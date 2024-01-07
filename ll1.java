import java.util.Iterator;
import java.util.LinkedList;

public class ll1 {
    public static void main(String[] args) {


    LinkedList<String> list_one=new LinkedList<String>();

    list_one.add("Manuusha");
    list_one.add("Kalum");
    list_one.add("Nethmi");
    list_one.add("Maheshi");
        Iterator<String> itr=list_one.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


}}
