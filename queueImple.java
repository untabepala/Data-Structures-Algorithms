import java.util.LinkedList;
import java.util.Queue;

//linkedlist queue
public class queueImple {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("apple");
        q.add("banana");
        q.add("cherry");
        System.out.println(q);

        String f=q.remove();
        System.out.println(f);

        System.out.println(q);

        q.add("jack");
        String peekedone=q.peek();
        System.out.println(peekedone);

        System.out.println(q);
    }

}
