package Interview.Offer_52;

import Util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // 记录一个访问的路径 判断下面的访问节点是否存在在路径中
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
