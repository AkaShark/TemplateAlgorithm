package Tree.LeetCode_109;

import Util.ListNode;
import Util.TreeNode;

public class Solution1 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return build(head, null);
    }

    private TreeNode build(ListNode left, ListNode right) {
        if (left == right) return null;
        ListNode mid = middleNode(left, right);
        TreeNode node = new TreeNode(mid.val); // 根节点
        node.left = build(left, mid);
        node.right = build(mid.next, right);
        return node;
    }

    private ListNode middleNode(ListNode left, ListNode right) {
       ListNode fast = left;
       ListNode slow = left;
       while (fast != right && fast.next != right) {
           fast = fast.next.next;
           slow = slow.next;
       }
       return slow;
    }
}
