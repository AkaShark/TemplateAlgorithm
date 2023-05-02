package Task;
import java.lang.Math;
import java.util.Scanner;
public class JDTest {
    static public double solution(int i, int k) {
        double sum = 0;
        double temp = i;
        for (int j = 0; j < k; j++) {
            if (j != 0) {
                temp += (int)Math.pow(10, j) * i;
            }
            sum += temp;
            System.out.printf("sum+=%f\n", temp);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split(","); //通过分隔符将其转为字符串数组
        int[] nums = new int[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]); //将字符串转为int
        }
        solution(nums[0], nums[1]);
    }
}
