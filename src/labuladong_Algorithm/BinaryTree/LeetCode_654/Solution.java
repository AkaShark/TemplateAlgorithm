package labuladong_Algorithm.BinaryTree.LeetCode_654;

import Util.TreeNode;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructTree(int[] nums, int lo, int hi) {
        if (lo > hi) return null; // 递归出口
        // 找最大值 确定根节点
        int rootIndex = findMaxNumIndex(nums, lo, hi);
        TreeNode root = new TreeNode(nums[rootIndex]);
        // 递归构造左右子树
        root.left = constructTree(nums, lo, rootIndex - 1);
        root.right = constructTree(nums, rootIndex + 1, hi);
        return root;
    }

    public int findMaxNumIndex(int[] nums, int lo, int hi) {
        int maxIndex = lo;
        int max = nums[lo];
        for (int i = lo; i <= hi; i++) { // 注意边界值 传进来的是nums.length - 1
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
