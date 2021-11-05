package Tree.LeetCode_116;

public class Solution2 {
    // 吃着碗里的看着锅里的 遍历同层兄弟节点的同时 构建下层节点的next指针
     public Node connect(Node root) {
         if (root == null) return root;
         Node node = root;
         while (node.left != null) {
             Node cur = node;
             while (cur != null) { // 遍历同一层的兄弟节点
                 cur.left.next = cur.right;
                 if (cur.next != null)
                     cur.right.next = cur.next.left;
                 cur = cur.next;
             }
             // 去下一层节点
             node = node.left;
         }
         return root;
     }

}
