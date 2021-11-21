package Interview.Offer_07;

import Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static private HashMap<Integer, Integer> indexMap = new HashMap<>();
    static public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

   static private TreeNode build(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) return null;
        // 获取根节点的值
        int rootValue = preorder[preorder_left];
        // 计算左子树节点个数
        int leftSubTreeLen = indexMap.get(rootValue) - inorder_left;
        // 创建根节点
        TreeNode root = new TreeNode(rootValue);
        // 递归
        root.left = build(preorder, inorder, preorder_left + 1, preorder_left + leftSubTreeLen, inorder_left, indexMap.get(preorder[preorder_left]) - 1);
        root.right = build(preorder, inorder, preorder_left + leftSubTreeLen + 1, preorder_right, indexMap.get(preorder[preorder_left]) + 1, inorder_right);
        return root;
    }

    public static void main(String[] args) {
        buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
}
