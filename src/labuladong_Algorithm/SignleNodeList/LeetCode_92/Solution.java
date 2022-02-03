package labuladong_Algorithm.SignleNodeList.LeetCode_92;

import Util.ListNode;

public class Solution {
    public ListNode reverseBetween_1(ListNode head, int left, int right) {
        if (left == 1) { // 从头开始到right
            return reverseN(head, right);
        }
        head.next = reverseBetween_1(head.next, left - 1, right - 1);
        return head;
    }

    ListNode nextNode = null;

    public ListNode reverseN(ListNode node, int N) {
        if (N == 1) {
            nextNode = node.next;
            return node;
        }
        // 以 head.next 为起点，需要反转前 n - 1 个节点
        ListNode last = reverseN(node.next, N - 1);
        node.next.next = node;
        node.next = nextNode;
        return last;
    }

    // 循环
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next = null;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummy.next;

    }

}
