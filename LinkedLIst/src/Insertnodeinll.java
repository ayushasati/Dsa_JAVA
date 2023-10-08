import java.util.*;

public class InsertNodeInLinkedList {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        int currPos = 0;
        Node<Integer> newNode = new Node<Integer>(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node<Integer> temp = head;
        while (temp != null && currPos < (pos - 1)) {
            temp = temp.next;
            currPos++;
        }

        if (temp == null) {
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
