package Offer.offer34;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return ans;
        dfs(root, target, 0, new LinkedList<>());
        return ans;
    }

    public void dfs(TreeNode root, int target, int sum, Deque<Integer> path) {
        if (root == null) return;
        sum += root.val;
        path.offerLast(root.val);
        if (root.left == null && root.right == null && target == sum) {
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left, target, sum, path);
        dfs(root.right, target, sum, path);
        path.pollLast();
    }
}
