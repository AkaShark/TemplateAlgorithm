package labuladong_Algorithm.BinaryTree.LeetCode_652;

import Util.TreeNode;

import java.util.*;

public class Solution {
    // 查看自己为根节点的子树和其他节点为根节点子树是否相同
    // 记录下来太复杂了 排除的时候太难了
    HashMap<TreeNode, HashMap<Integer,ArrayList<Integer>>> hashMap = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees_1(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        duplicateSubtrees(root);
        List<TreeNode> keys = new ArrayList<>(hashMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            TreeNode node = keys.get(i);
            HashMap<Integer, ArrayList<Integer>> nodeMap = hashMap.get(node);
            for (int j = i + 1; j < keys.size(); j++) {
                TreeNode otherNode = keys.get(j);
                if (otherNode.val == node.val) {
                    HashMap<Integer, ArrayList<Integer>> otherNodeMap = hashMap.get(otherNode);
                    if (nodeMap.get(0).equals(otherNodeMap.get(0)) && nodeMap.get(1).equals(otherNodeMap.get(1))) {
                        boolean added = false;
                        for (int k = 0; k < ans.size(); k++) {
                            if (ans.get(k).val == node.val) {
                                HashMap<Integer, ArrayList<Integer>> temp = hashMap.get(ans.get(k));
                                if (nodeMap.get(0).equals(temp.get(0)) && nodeMap.get(1).equals(temp.get(1))) added = true;
                            }
                        }
                        if (!added) {
                            ans.add(node);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public void duplicateSubtrees(TreeNode root) {
        if (root == null) return;
        // 前序遍历
        HashMap<Integer, ArrayList<Integer>> nodeMap = new HashMap<>();
        ArrayList<Integer> preOrder = new ArrayList<>();
        ArrayList<Integer> inOrder = new ArrayList<>();
        nodeMap.put(0, preOrder(root, preOrder));
        nodeMap.put(1, midOrder(root, inOrder));
        hashMap.put(root, nodeMap);
        duplicateSubtrees(root.left);
        duplicateSubtrees(root.right);

    }
    public ArrayList<Integer> preOrder(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return arrayList;
        arrayList.add(root.val);
        preOrder(root.left, arrayList);
        preOrder(root.right, arrayList);
        return arrayList;
    }

    public ArrayList<Integer> midOrder(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return arrayList;
        midOrder(root.left, arrayList);
        arrayList.add(root.val);
        midOrder(root.right, arrayList);
        return arrayList;
    }

    HashMap<String, Integer> memo = new HashMap<>();
    List<TreeNode> ans = new LinkedList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        travers(root);
        return ans;
    }
    String travers(TreeNode root) {
        if (root == null) return "#";
        String left = travers(root.left);
        String right = travers(root.right);
        String subTree = left + "," + right + "," + root.val;
        int freq = memo.getOrDefault(subTree, 0);
        if (freq == 1) {
            ans.add(root);
        }
        memo.put(subTree, freq + 1);
        return subTree;
    }
}
