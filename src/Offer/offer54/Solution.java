package Offer.offer54;

import Util.TreeNode;

import java.util.ArrayList;

public class Solution {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        dfs(root, arrayList);
        int len = arrayList.size();
        return arrayList.get(len - k).val;
    }
    public void dfs(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) return;
        dfs(root.left, list);
        list.add(root);
        dfs(root.right, list);
    }
}
