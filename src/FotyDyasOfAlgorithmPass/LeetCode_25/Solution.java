package FotyDyasOfAlgorithmPass.LeetCode_25;

import FotyDyasOfAlgorithmPass.Utils.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return dummy.next;
                }
            }
            ListNode next = tail.next;
            ListNode[] reversedLists = reverse(pre, tail);
            head = reversedLists[0];
            tail = reversedLists[1];
            pre.next = head;
            tail.next = next;
            pre = tail;
            head = next;

        }
        return dummy.next;
    }

    private ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        // 翻转链表
        return new ListNode[]{tail, head};
    }
}
