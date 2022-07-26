package AlgorithmBased.LeetCode_82;

import Util.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(head.val + 1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        while (cur != null) {
            if (cur.val == cur.next.val) {
                cur = cur.next;
            } else {
                pre.next = cur.next;
                cur = pre.next;
            }

        }
        return dummy.next;
    }
}
