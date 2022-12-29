package FotyDyasOfAlgorithmPass.LeetCode_142;

import FotyDyasOfAlgorithmPass.Utils.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        return fast;
    }
}
