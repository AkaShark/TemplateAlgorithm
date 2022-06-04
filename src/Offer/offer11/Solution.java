package Offer.offer11;
// https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/solution/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-by-leetcode-s/
// https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/solution/mian-shi-ti-11-xuan-zhuan-shu-zu-de-zui-xiao-shu-3/
public class Solution {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (numbers[mid] > numbers[right]) {
                // mid在左数组
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                // mid在右数组
                right = mid;
            } else {
                right --;
            }
        }
        return numbers[left];
    }
}
