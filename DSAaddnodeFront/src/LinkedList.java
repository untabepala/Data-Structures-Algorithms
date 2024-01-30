class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class LinkedList {
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }else{
            Node currentNode;
            currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
    }
    public void print(){
        Node currentNode;
        currentNode=head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
    //adding front
    public void addFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

}
class display{
    public static void main(String[] args) {


        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.addFront(50);
        ll.print();
    }}
