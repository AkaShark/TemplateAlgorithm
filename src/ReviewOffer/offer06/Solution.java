package ReviewOffer.offer06;

import Util.ListNode;

public class Solution {
    public int[] reversePrint(ListNode head) {
        int length = 0;
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            length ++;
        }
        int[] ans = new int[length];
        int index = 0;
        while (pre != null) {
            ans[index] = pre.val;
            pre = pre.next;
            index ++;
        }
        return ans;
    }

}

