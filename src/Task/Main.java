package Task;

import Util.ListNode;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
public class Main {
    static public void main(String[] args) {

    }


    public ListNode xorList (ListNode a, ListNode b) {
        // special case
        Boolean isFirst = true;
        ListNode reverseB = reverse(b);
        ListNode res = new ListNode(0);
        ListNode worker = res;
        if (a == null) {
            while (reverseB != null) {
                if (isFirst && (reverseB.val ^ 0) == 0) {
                    reverseB = reverseB.next;
                    continue;
                }
                worker.next = new ListNode(reverseB.val ^ 0);
                isFirst = false;
                reverseB = reverseB.next;
                worker = worker.next;
            }
        }
        if (reverseB == null) {
            while (a != null) {
                if (isFirst && (a.val ^ 0) == 0) {
                    a = a.next;
                    continue;
                }
                worker.next = new ListNode(a.val ^ 0);
                isFirst = false;
                a = a.next;
                worker = worker.next;
            }
        }

        // 补位
        int countA = cout(a);
        int countB = cout(reverseB);
        if (countA > countB) {
            int count = countA - countB;
            while (count > 0) {
                if (isFirst && (a.val ^ 0) == 0) {
                    a = a.next;
                    continue;
                }
                worker.next = new ListNode(0 ^ a.val);
                isFirst = false;
                a = a.next;
                worker = worker.next;
                count --;
            }
        } else if (countA < countB) {
            int count = countB - countA;
            while (count > 0) {
                if (isFirst && (reverseB.val ^ 0) == 0) {
                    reverseB = reverseB.next;
                    continue;
                }
                worker.next = new ListNode(reverseB.val ^ 0);
                isFirst = false;
                reverseB = reverseB.next;
                worker = worker.next;
                count --;
            }

        }


        while (reverseB != null && a != null) {
            if (isFirst && (reverseB.val ^ a.val) == 0) {
                a = a.next;
                reverseB = reverseB.next;
                continue;
            }
            worker.next = new ListNode(reverseB.val ^ a.val);
            isFirst = false;
            a = a.next;
            reverseB = reverseB.next;
            worker = worker.next;
        }
        return res.next;
    }

    public Integer cout(ListNode node) {
        int count = 0;
        while (node != null) {
            node = node.next;
            count ++;
        }
        return count;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

