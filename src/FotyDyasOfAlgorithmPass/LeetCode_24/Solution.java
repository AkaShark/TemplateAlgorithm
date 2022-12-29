package FotyDyasOfAlgorithmPass.LeetCode_24;

import FotyDyasOfAlgorithmPass.Utils.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        ListNode pre = null, cur = head, next = cur.next;
        while (cur != null && cur.next != null) {
            cur.next = next.next;
            next.next = cur;
            if (pre != null) {
                pre.next = next;
            }
            pre = cur;
            cur = cur.next;
            next = cur.next;
        }
        return newHead;

    }
}
