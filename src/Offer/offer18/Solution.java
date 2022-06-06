package Offer.offer18;

import Util.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(val - 1);
        dummy.next = head;
        ListNode node = dummy;
        while (node != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        return dummy.next;
    }
}
