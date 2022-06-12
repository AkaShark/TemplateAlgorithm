package Offer.offer25;

import Util.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyA = new ListNode(Integer.MAX_VALUE);
        dummyA.next = l1;
        ListNode curA = l1;
        ListNode preA = dummyA;
        ListNode dummyB = new ListNode(Integer.MAX_VALUE);
        dummyB.next = l2;
        ListNode curB = l2;
        while (curA != null && curB != null) {
            if (curA.val >= curB.val) {
                preA.next = curB;
                curB = curB.next;
            } else {
                preA.next = curA;
                curA = curA.next;
            }
            preA = preA.next;
        }
        while (curB != null) {
            curA.next = curB;
            curB = curB.next;
            curA = curA.next;
        }
        while (curA != null) {
            curA.next = curA;
            curA = curA.next;
        }
        return dummyA.next;
    }
}
