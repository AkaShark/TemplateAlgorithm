package labuladong_Algorithm.LeetCode_876;

import Util.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode first = head, slow = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
