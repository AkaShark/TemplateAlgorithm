package Tree.LeetCode_235;

import Util.TreeNode;

public class Solution {
    // 由于是二叉搜索树 所以满足左子树小于根节点小于右子树的条件
    /*
    * case1 p节点值小于root q节点值大于root 则root是最近公共祖先
    * case2 q节点值小于root p节点值大于root 则root是最近公共祖先
    * case3 两个节点都小于root 则递归调用root.left 去找最近公共祖先
    * case4 两个节点都大于root 则递归调用root.right 去找最近公共祖先
    * case5 两个节点属于父子关系 直接返回父节点找到了
    * case6 长距离的父子关系 */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 属于父子节点的情况
        if (p.left == q || p.right == q) {
            return p;
        }
        if (q.left == p || q.right == p) {
            return q;
        }
        return find(root, p, q);
    }

    private TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        // 判断是否符合条件 或者 找到了p或者q
        if ((p.val < root.val && q.val > root.val) || (q.val < root.val && p.val > root.val) || root == q || root == q) {
            return root; // 找到的root就是最近公共祖先
        }
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }
}
