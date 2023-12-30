public class llAddNodeFront {


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

        // Method to insert a new node at the front of the linked list
        public void push(int newData) {
            // 1 & 2: Allocate the Node & Put in the data
            Node newNode = new Node(newData);

            // 3. Make next of new Node as head
            newNode.next = head;

            // 4. Move the head to point to the new Node
            head = newNode;
        }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

        }

        // Main method for testing
        public static void main(String[] args) {
            // Create a linked list
            llAddNodeFront linkedList = new llAddNodeFront();

            // Insert some nodes at the front
            linkedList.push(3);
            linkedList.push(7);
            linkedList.push(1);
            linkedList.push(9);

            // Print the linked list
            System.out.print("Linked List after push operations: ");
            linkedList.printList();
        }
    }


