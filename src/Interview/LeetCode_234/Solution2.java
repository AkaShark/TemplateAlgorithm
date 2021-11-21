package Interview.LeetCode_234;

import Util.ListNode;
import Util.TreeNode;

public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            pre = pre.next;
        }
        pre.next = null;
        ListNode subList = reverse(slow);
        while (head != null) {
            if (head.val != subList.val) return false;
            head = head.next;
            subList = subList.next;
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode pre = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
