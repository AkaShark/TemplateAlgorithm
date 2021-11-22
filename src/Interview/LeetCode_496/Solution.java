package Interview.LeetCode_496;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            boolean flag = false, added = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) flag = true;
                if (flag) {
                    if (nums2[j] > num) {
                        ans.add(nums2[j]);
                        added = true;
                        break;
                    }
                }
            }
            if (!added) {
                ans.add(-1);
            }
        }

        int[] ansArray = new int[ans.size()];
        for (int i = 0; i < ansArray.length ; i++) {
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }

    public static void main(String[] args) {
        nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
    }

}
