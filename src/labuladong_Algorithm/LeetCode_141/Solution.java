package labuladong_Algorithm.LeetCode_141;

import Util.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first = head, slow = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
            if (first == slow) return true;
        }
        return false;
    }
}
