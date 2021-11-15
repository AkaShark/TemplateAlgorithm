package Interview.Offer_52;

import Util.ListNode;

public class Solution1 {
    // 利用长度查计算 和环形链表的找到起点的过程有点类似
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null? headB: pA.next;
            pB = pB == null? headA: pB.next;
        }
        return pA;
    }
}
