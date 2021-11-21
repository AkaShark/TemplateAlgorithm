package Interview.LeetCode_234;

import Util.ListNode;

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        cur = reverse(head);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != cur.val) {
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head) {
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
