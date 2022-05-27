package Offer.LeetCode06;

import Util.ListNode;

public class Solution1 {
    int count = 0;
    public int[] reversePrint(ListNode head) {
        head = reverse(head);
        int[] ans = new int[count];
        int index = 0;
        while (head != null) {
            ans[index] = head.val;
            head = head.next;
        }
        return ans;
    }
    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            count ++;
        }

        return pre;
    }
}
