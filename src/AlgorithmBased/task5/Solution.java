package AlgorithmBased.task5;
import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        List<int[]> ans = new LinkedList<>();
        int preEnd = 0;
        int index = 0;
        while (len > 0) {
            int start = scanner.nextInt();
            int end  = scanner.nextInt();
            if (start <= preEnd && index > 0) {
                int[] preAns = ans.get(index - 1);
                preAns[1] = end;
            } else {
                ans.add(new int[]{start, end});
                index ++;
            }
            preEnd = end;
            len --;
        }

        System.out.print("[");
        for (int[] nums: ans) {
            System.out.print("[");
            System.out.print(nums[0]);
            System.out.print(",");
            System.out.print(nums[1]);
            System.out.print("]");
        }
        System.out.print("]");
    }
}

