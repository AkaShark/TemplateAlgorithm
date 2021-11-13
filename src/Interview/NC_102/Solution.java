package Interview.NC_102;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
   static public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
       return 0;
    }


    // 递归树查找 对应的node节点的路径
   static private void findPath(TreeNode root, TreeNode node, List<TreeNode> path) {

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;
        lowestCommonAncestor(root, 5, 1);
    }
}
