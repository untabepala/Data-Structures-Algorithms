public class lladdnodeGivenPlace {

        // Node class definition
        static class Node {
            int data;
            Node next;

            // Constructor to create a new node with the given data
            Node(int newData) {
                data = newData;
                next = null;
            }
        }

        // Head of the linked list
        Node head;

        // Method to insert a new node after the given previous node
        public void insertAfter(Node prevNode, int newData) {
            // 1. Check if the given Node is null
            if (prevNode == null) {
                System.out.println("The given previous node cannot be null");
                return;
            }

            // 2. Allocate the Node &
            // 3. Put in the data
            Node newNode = new Node(newData);

            // 4. Make next of new Node as next of prev_node
            newNode.next = prevNode.next;

            // 5. Make next of prev_node as new_node
            prevNode.next = newNode;
        }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Main method for testing
        public static void main(String[] args) {
            // Create a linked list
            lladdnodeGivenPlace linkedList = new lladdnodeGivenPlace();

            // Insert some nodes
            linkedList.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(4);

            linkedList.head.next = second;
            second.next = third;

            // Print the linked list before insertion
            System.out.print("Linked List before insertion: ");
            linkedList.printList();

            // Insert a new node with data 3 after the second node
            linkedList.insertAfter(second, 3);

            // Print the linked list after insertion
            System.out.print("Linked List after insertion: ");
            linkedList.printList();
        }
    }


