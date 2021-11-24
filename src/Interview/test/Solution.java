package Interview.test;

public class Solution {
    public static int answer(int x) {
        int q1 = answer1(x);
        int[] q2 = answer2(q1);
        int q3 = answer3(q2);
        System.out.println(q3);
        return -1;
    }

    public static int answer1(int x) {
        int ans = Integer.MIN_VALUE;
        if (Math.abs(x) < 67) {
            ans = 67;
        } else {
            ans = Math.abs(x);
        }
        int ans1_1 = answer1_1(ans);
        while (ans1_1 > 10) {
            ans1_1 = answer1_1(ans1_1);
        }
        return ans1_1;
    }

    public static int answer1_1(int x) {
        int temp = 0;
        int ans = x;
        while (ans > 0) {
            temp += ans % 10;
            ans /= 10;
        }
        return temp;
    }

    public static int[] answer2(int x) {
        int y = Math.abs(x);
        String temp = String.valueOf(y);
        int[] array = new int[temp.length()];
        int i = 0;
        while (y != 0) {
            array[i ++] = y % 10;
            y /= 10;
        }
        int[] ans = new int[array.length * 5];
        for (int j = 0; j < ans.length; j++) {
            ans[j] = array[j % array.length];
        }
        return ans;
    }

    public static int answer3(int[] array) {
        int sum = 0;
        if (array.length == 0) {
            return 6;
        } else if (array.length % 2 == 0) {
            if (array.length < 6) {
                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                return sum;
            }

            int start = (array.length - 6) / 2;
            for (int i = start; i < 6; i++) {
                sum += array[i];
            }
        } else {
            if (array.length < 7) {
                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                return sum;
            }

            int start = (array.length - 7) / 2;
            for (int i = start; i < 6; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        answer(998);
    }
}
