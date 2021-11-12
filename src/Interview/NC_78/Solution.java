package Interview.NC_78;

import Util.ListNode;

public class Solution {
    ListNode pre = null;
    public ListNode ReverseList(ListNode head) {
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
