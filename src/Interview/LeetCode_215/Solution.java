package Interview.LeetCode_215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public int quickSelect(int[] a, int l, int r, int index) {
        // 获取拆分点
        int point = partition(a, l, r);
        // 拆分点为index 直接返回
        if (point == index) {
            return a[point];
        } else {
            // index 大于去右半部分找 否则去左半部分找
            return point < index? quickSelect(a, point + 1, r, index): quickSelect(a, l, point - 1, index);
        }
    }

    // 切分
    public int partition(int[] a, int l, int r) {
        int target = a[l]; // 选取第一个值作为基准值
        while (l < r) {
            while (l < r && a[r] >= target) {
                r --;
            }
            swap(a, l, r);
            while (l < r && a[l] <= target) {
                l ++;
            }
            swap(a, l, r);
        }
        return l;

    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
