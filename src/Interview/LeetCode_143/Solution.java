package Interview.LeetCode_143;

import Util.ListNode;

import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode mid = middleNode(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null; // 断开两条链
        l2 = reverseList(l2);
        mergeList(l1, l2);
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    private void mergeList(ListNode l1, ListNode l2) {
        ListNode l1_tem, l2_tem;
        while (l1 != null && l2 != null) {
            l1_tem = l1.next;
            l2_tem = l2.next;

            l1.next = l2;
            l1 = l1_tem;

            l2.next = l1;
            l2 = l2_tem;
        }
    }

}
