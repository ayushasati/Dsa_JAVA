import java.util.*;
public class deletioninlist {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void deleteFromStart() {
            if (head != null) {
                head = head.next;
            }
        }

        // Method to delete a node from the end of the linked list
        public void deleteFromEnd() {
            if (head == null || head.next == null) {
                head = null;
                return;
            }

            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        // Method to delete a node with a specific value from the linked list
        public void deleteNodeWithValue(int value) {
            if (head == null) {
                return;
            }

            if (head.data == value) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != value) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        // Method to display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }


        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Delete from start");
                System.out.println("2. Delete from end");
                System.out.println("3. Delete by value");
                System.out.println("4. Display linked list");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        list.deleteFromStart();
                        break;
                    case 2:
                        list.deleteFromEnd();
                        break;
                    case 3:
                        System.out.print("Enter value to delete: ");
                        int value = scanner.nextInt();
                        list.deleteNodeWithValue(value);
                        break;
                    case 4:
                        list.display();
                        break;
                    case 5:
                        scanner.close();
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }


