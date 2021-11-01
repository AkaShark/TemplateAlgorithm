package Tree.LeetCode_108;

import Util.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums != null && nums.length > 0) {
            return build(nums, 0, nums.length - 1);
        }
        return null;
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) return null; // 子节点
        int mid = (end - start) / 2 + start;
        TreeNode node = new TreeNode(nums[mid]); // 根节点
        node.left = build(nums, start, mid - 1);
        node.right = build(nums, mid + 1, end);
        return node;
    }
}
