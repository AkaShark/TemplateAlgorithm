package Tree.LeetCode_109;

import Util.ListNode;
import Util.TreeNode;

public class Solution2 {
    ListNode globalHead;
    public TreeNode sortedListToBST(ListNode head) {
        globalHead = head;
        int length = getLength(head);
        return build(0, length - 1);
    }

    private int getLength(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret ++;
            head = head.next;
        }
        return ret;
    }
    private  TreeNode build(int left, int right) {
        if (left > right) return null;
        int mid = (right - left) / 2 + left;
        TreeNode root = new TreeNode();
        // 中序变量
        root.left = build(left, mid - 1);
        root.val = globalHead.val; // 遍历到对应的节点填充值
        globalHead = globalHead.next;
        root.right = build(mid + 1, right);
        return root;
    }
}
