package labuladong_Algorithm.Array;

/**
 * 抽象差分数组
 */
public class Difference {
    private int[] diff; // 差分数组
    public Difference(int[] nums) {
        assert nums.length > 0;
        // 构建差分数组
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }


    /**
     * @param i 左边界
     * @param j 有边界
     * @param val change的Val val可以是正值也可以是负值
     */
    public void changeDiff(int i, int j, int val) {
        diff[i] += val;
        if ((j + 1) < diff.length) { // j + 1 大于diff.length的话说明剩下的都需要修改
            diff[j + 1] -= val;
        }
    }

    /**
     * @return 返回由差分数组反推的res
     */
    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = diff[i] + res[i - 1];
        }
        return res;
    }
}

