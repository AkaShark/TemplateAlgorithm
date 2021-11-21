package Interview.LeetCode_234;

import Util.ListNode;

public class Solution1 {
    // 递归解决
    private ListNode frontPointer;

    private boolean check(ListNode node) {
        if (node != null) {
            if (!check(node.next)) {
                return false;
            }
            if (node.val == frontPointer.val) {
                frontPointer = frontPointer.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return check(head);
    }
}
