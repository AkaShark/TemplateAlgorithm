package Tree.LeetCode_257;

import Util.TreeNode;
import java.util.*;

public class Solution {
    static public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        findPath(root, "", paths);
        return paths;
    }

    static private void findPath(TreeNode node, String path, List<String> ans) {
        if (node != null) {
            StringBuilder stringBuilder = new StringBuilder(path);
            stringBuilder.append(node.val);
            if (node.left == null && node.right == null) {
                ans.add(stringBuilder.toString());
            } else {
                stringBuilder.append("->");
                findPath(node.left, stringBuilder.toString(), ans);
                findPath(node.right, stringBuilder.toString(), ans);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        root.left = node1;
        root.right = node3;
        node1.right = node2;
        binaryTreePaths(root);
    }

}
