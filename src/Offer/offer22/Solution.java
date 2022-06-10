package Offer.offer22;

import Util.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode fast = head;
        while (k > 0) {
            if (fast == null) return null;
            fast = fast.next;
            k --;
        }
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
