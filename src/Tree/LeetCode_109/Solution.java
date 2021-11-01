package Tree.LeetCode_109;

import Util.ListNode;
import Util.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new LinkedList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        return build(nums, 0, nums.size() - 1);
    }

    private TreeNode build(List<Integer> nums, int start, int end) {
        if (start > end) return null;
        int mid = (end - start) / 2 + start;
        TreeNode node = new TreeNode(nums.get(mid));
        node.left = build(nums, 0, mid - 1);
        node.right = build(nums, mid + 1, end);
        return node;
    }
}
