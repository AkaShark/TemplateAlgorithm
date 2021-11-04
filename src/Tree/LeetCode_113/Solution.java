package Tree.LeetCode_113;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if (root == null) return ans;
        path.add(root.val);
        find(root, targetSum, path, ans);
        return ans;
    }

    static private void find(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans) {
        if (root.left == null && root.right == null) { // 叶子结点
            if (pathSum(path) == targetSum) { // 是否满足条件 满足条件添加到 结果集
                ans.add(new ArrayList<>(path));
            }
        }
        if (root.left != null) {
            path.add(root.left.val);
            find(root.left, targetSum, path, ans);
            path.remove(path.size() - 1);
        }

        if (root.right != null) {
            path.add(root.right.val);
            find(root.right, targetSum, path, ans);
            path.remove(path.size() - 1);
        }
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
        pathSum(root, 22);
    }
}
