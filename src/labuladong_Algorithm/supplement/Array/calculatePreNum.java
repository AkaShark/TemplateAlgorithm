package labuladong_Algorithm.supplement.Array;

public class calculatePreNum {
    static public void calculate(int[] nums, int score) {
        int[] count = new int[100 + 1];
        for (int num : nums) {
            count[num]++;
        }
        // 前缀和
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1]; // 当前大小 + 前一个的大小
        }
        int studentsNum = count[score] - count[score -1];
        System.out.println(studentsNum);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100, 80, 89, 78, 69,100, 78, 89, 69};
        calculate(nums, 100);
    }
}
