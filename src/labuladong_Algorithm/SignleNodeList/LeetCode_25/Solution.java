package labuladong_Algorithm.SignleNodeList.LeetCode_25;

import Util.ListNode;

public class Solution {
  static   public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode cur = head, next = head;
        for (int i = 1; i < k; i++) {
            next = next.next;
            if (next == null) {
                return head;
            }
        }
        ListNode temp = next.next;
        ListNode newHead = reverse_recursion(cur, next);
        cur.next = reverseKGroup(temp, k);
        return newHead;
    }

  static   public ListNode reverse_recursion(ListNode node1, ListNode node2) {
        if (node1 == node2) return node1;
        ListNode last = reverse_recursion(node1.next, node2);
        node1.next.next = node1;
        return last;
    }

    public ListNode reverse_noRecursion(ListNode node1, ListNode node2) {
        ListNode pre = null;
        while (node1 != node2) {
            ListNode next = node1.next;
            node1.next = pre;
            pre = node1;
            node1 = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(reverseKGroup(node1, 3));


    }

}
