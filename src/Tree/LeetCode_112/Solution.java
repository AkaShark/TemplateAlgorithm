package Tree.LeetCode_112;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 回溯思想解决 遍历每个path 然后判断是否找到
    static public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        if (root == null) return false;
        path.add(root.val);
        return findTarget(path, root, targetSum);
    }

    static private boolean findTarget(List<Integer> path, TreeNode root, int target) {
        if (root.left == null && root.right == null) { // 叶子节点
            if (pathSum(path) == target) return true; // 找到结果就返回
        }
        if (root.left != null) {
            path.add(root.left.val);
            if (findTarget(path, root.left, target)) return true; // 找到结果就返回
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            path.add(root.right.val);
            if (findTarget(path, root.right, target)) return true; // 找到结果就返回
            path.remove(path.size() - 1);
        }
        return false;
    }

    static private int pathSum(List<Integer> path) {
        int sum = 0;
        for (int i = 0; i < path.size(); i++) {
            sum += path.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(11);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(13);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(1);

        root.left = node1;
        root.right = node5;
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        node5.left = node6;
        node5.right = node7;
        node7.right = node8;
        hasPathSum(root, 22);
    }
}
