public class deletingNode {

        private Node head;

        public void deleteWithValue(int data) {
            if (head == null) {
                return;
            }

            // Check if the head node contains the value to be deleted
            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;

            // Traverse the linked list to find the node with the specified value
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

        // Other methods and Node class definition go here
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


