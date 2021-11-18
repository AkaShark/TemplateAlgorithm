package Interview.LeetCode_25;

import Util.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            ListNode tail = pre;
            // 查看剩余部分的长度是否大于等于K
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                // 剩余的不到k个就直接返回了
                if (tail == null)
                    return dummy.next;
            }
            ListNode next = tail.next;
            ListNode[] reverse = myReverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            // 把子链表重新接回原链表
            pre.next = head;
            tail.next = next;
            pre = tail;
            head = tail.next;
        }
        return dummy.next;
    }

    public ListNode[] myReverse(ListNode head, ListNode tail) {
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
