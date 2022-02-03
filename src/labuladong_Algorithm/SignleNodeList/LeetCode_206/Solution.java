package labuladong_Algorithm.SignleNodeList.LeetCode_206;

import Util.ListNode;

import java.util.List;

public class Solution {
    // 递归实现
    public ListNode reverseList_recursion(ListNode head) {
        if (head == null || head.next == null) return head;
        /*
        * 看见递归不要往脑子里面装栈存储不了几个栈
        * 应该理解函数的含义 reverseList的含义是将传入的链表的翻转并返回翻转后的头结点
        * last = reverseList(head.next) 的作用就是将head.next为头结点的链表翻转并返回last作为头结点
        * 这样的话就是head就是目前唯一没有被翻转的结点 于是下面的不步骤就是翻转head结点*/
        ListNode last = reverseList_recursion(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    // 非递归实现
    public ListNode reverseList_unrecursion(ListNode head) {
        if (head == null || head.next == null) return head;
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
