import java.util.LinkedList;
import java.util.Queue;

public class queueExercise {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<String>();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        System.out.println("i."+q);
        System.out.println("ii."+q.peek());
        q.remove();
        q.remove();
        System.out.println("iii.updated one after removing A & B: "+q);
        System.out.println("iv.First Node: "+q.peek());
        System.out.println("v.Size of Queue: "+q.size());

    }
}

