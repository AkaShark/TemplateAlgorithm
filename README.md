# 模板刷题总结
参考labuladong的算法小抄

## 二叉树题目

### 二叉树的中序遍历
[链接](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)
思路: 
* 二叉树的中序变量使用的一般是递归方法 采用递归模板

```java
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans; 
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }
```
* 使用非递归的方式 需要使用一个栈的数据结构保存需要访问的节点


