package Tree.LeetCode_222;

import Util.TreeNode;

public class Solution1 {
//    https://leetcode-cn.com/problems/count-complete-tree-nodes/solution/wan-quan-er-cha-shu-de-jie-dian-ge-shu-by-leetco-2/
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int level = 0;
        // 一直向左找节点 统计树的高度
        while (root.left != null) {
            level ++;
            root = root.left;
        }
        // 判断第K个元素是否存在 2 ^ left 2^(level+1) - 1
        int low = 1 << level, high = (1 << (level + 1)) - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (exists(root, level, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean exists(TreeNode root, int level, int k) {
        int bits = 1 << (level - 1); // 2 ^ (level - 1)
        TreeNode node = root;
        // 寻找第K个节点
        while (node != null && bits > 0) {
            if ((bits & k) == 0) { // 左节点
                node = node.left;
            } else {
                node = node.right;
            }
            bits >>= 1;
        }
        return node != null;
    }

    // 输出下过程
    public static void main(String[] args) {

    }
}

