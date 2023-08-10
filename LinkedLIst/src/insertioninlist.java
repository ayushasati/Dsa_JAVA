
    import java.util.*;
    public class insertioninlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;

        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public void insertAfter(Node prevNode, int data) {
            if (prevNode == null) {
                System.out.println("Previous node cannot be null.");
                return;
            }

            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }

        public void displayList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }


        public static void  main(String[] args) {
            LinkedList linkedList = new LinkedList();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements to insert: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                int element = scanner.nextInt();
                linkedList.insertAtEnd(element);
            }

            System.out.println("Linked List after insertions:");
            linkedList.displayList();

            System.out.print("Enter the data to insert at the beginning: ");
            int startData = scanner.nextInt();
            linkedList.insertAtStart(startData);

            System.out.print("Enter the data to insert after: ");
            int afterData = scanner.nextInt();
            Node nodeToInsertAfter = linkedList.head; // You can modify this to find the specific node
            linkedList.insertAfter(nodeToInsertAfter, afterData);

            System.out.println("Linked List after all insertions:");
            linkedList.displayList();

            scanner.close();
        }
    }


