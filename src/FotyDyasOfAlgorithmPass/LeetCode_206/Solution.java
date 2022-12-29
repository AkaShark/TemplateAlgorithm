package FotyDyasOfAlgorithmPass.LeetCode_206;

import FotyDyasOfAlgorithmPass.Utils.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
