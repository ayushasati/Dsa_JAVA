public class validpartition {
    public ListNode doubleIt(ListNode head) {
        // Step 1: Reverse the linked list
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 2: Double the values and update the linked list
        current = prev;
        ListNode newHead = new ListNode(-1); // Dummy node to build the new linked list
        ListNode newCurrent = newHead;
        int carry = 0;

        while (current != null) {
            int newVal = (current.val * 2) + carry;
            carry = newVal / 10;
            newVal %= 10;

            newCurrent.next = new ListNode(newVal);
            newCurrent = newCurrent.next;

            current = current.next;
        }

        // Step 3: Handle any remaining carry
        if (carry > 0) {
            newCurrent.next = new ListNode(carry);
        }

        // Reverse the new linked list
        ListNode finalHead = newHead.next;
        prev = null;
        current = finalHead;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev; // Return the head of the reversed linked list
    }
}
