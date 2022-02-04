package labuladong_Algorithm.SignleNodeList.LeetCode_234;

import Util.ListNode;

public class Solution {
    public boolean isPalindrome_1(ListNode head) {
        ListNode cur = head;
        ListNode dummy = new ListNode(-1);
        ListNode work = dummy;
        while (cur != null) {
            work.next = new ListNode(cur.val);
            cur = cur.next;
            work = work.next;
        }
        work = reverse(dummy.next);
        cur = head;
        while (cur != null) {
            if (work.val != cur.val) return false;
            work = work.next;
            cur = cur.next;
        }
        return true;
    }


    ListNode left = null;
    public boolean isPalindrome_2(ListNode head) {
        left = head;
        return traverse(head);
    }

    public boolean traverse(ListNode right) {
        if (right == null) return true;
        // 前序
        boolean res = traverse(right.next);
        res = res && left.val == right.val;
        left = left.next;
        return res;
    }

    public boolean isPalindrome_3(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // 奇数不为null slow向前一步走 slow当前的是啥都无所谓
            slow = slow.next;
        }
        ListNode right = reverse(slow);
        ListNode left = head;
        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head) {
        left = head;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        return traverse_1(slow);
    }

    public boolean traverse_1(ListNode right) {
        if (right == null) return true;
        boolean res = traverse_1(right.next);
        res = res && left.val == right.val;
        left = left.next;
        return res;
    }



}
