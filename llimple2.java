public class llimple2 {
    static class Node{
        int value;
        Node next;
    }

    public static void main(String[] args) {
        Node head=null;
        Node one=null;
        Node two=null;
        Node three=null;

        //allocate 3 nodes in the heap
        one=new Node();
        two=new Node();
        three=new Node();

        //assign value values
        one.value=10;
        two.value=20;
        three.value=30;

        //connect nodes
        one.next=two;
        two.next=three;
        three.next=null;

        //print the linked list value
        head=one;
        while(head!=null){
            System.out.println(head.value);
            head=head.next;

        }
    }
}
