public class lladdnodeEnd {

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

        // Method to append a new node at the end of the linked list
        public void append(int newData) {
            // 1. Allocate the Node &
            // 2. Put in the data
            // 3. Set next as null
            Node newNode = new Node(newData);

            // 4. If the Linked List is empty, make the new node as head
            if (head == null) {
                head = new Node(newData);
                return;
            }

            // 4. This new node is going to be the last node, so make next of it as null
            newNode.next = null;

            // 5. Else, traverse till the last node
            Node last = head;
            while (last.next != null)
                last = last.next;

            // 6. Change the next of the last node
            last.next = newNode;
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
            lladdnodeEnd linkedList = new lladdnodeEnd();

            // Append some nodes
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);

            // Print the linked list
            System.out.print("Linked List after append operations: ");
            linkedList.printList();
        }
    }


