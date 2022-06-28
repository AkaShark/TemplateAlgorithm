package ReviewOffer.offer53_2;

public class Solution2 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == mid) {
               left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
