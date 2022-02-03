package labuladong_Algorithm.LeetCode_19;

import Util.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode first = head, slow = head;
        while (n > 0) {
            if (first != null) {
                first = first.next;
            } else  {
              return  null;
            }
            n --;
        }
        while (first != null) {
            first = first.next;
            slow = slow.next;
            cur = cur.next;
        }
        cur.next = slow.next;
        return dummy.next;
    }
}
