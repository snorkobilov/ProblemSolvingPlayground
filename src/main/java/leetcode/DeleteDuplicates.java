package leetcode;

public class DeleteDuplicates {

    /**
     * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
     * leaving only distinct numbers from the original list. Return the linked list sorted as well.
     */

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            while (current.next != null && prev.next.val == current.next.val) {
                current = current.next;
            }

            if (prev.next == current) {
                prev = prev.next;
            } else {
                prev.next = current.next;
            }

            current = current.next;
        }
        head = dummy.next;
        return head;
    }
}
