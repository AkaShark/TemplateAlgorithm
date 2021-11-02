package EveryDay.LeetCode_237;

import Util.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        while (node.next.next == null) { // 倒数第二个节点
            node.val = node.next.val;
            node = node.next;
        }
        node.next = null;
    }
}
