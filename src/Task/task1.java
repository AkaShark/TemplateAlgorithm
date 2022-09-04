package Task;

import java.util.*;

class Solution {
    public void myFunc(ArrayList<Integer> arr, int m, int k) {
        // 构造数组
        int index = 0;
        while (index < m) {
            ArrayList<Integer> temp = new ArrayList<>(arr);
            Collections.reverse(temp);
            for (int i = 0; i < temp.size(); i++) {
                arr.add(temp.get(i));
            }
            index ++;
        }
        if (k > arr.size()) {
            System.out.println(-1);
        }
        System.out.println(arr.get(k - 1));
    }
}

public class task1
{
    public static void main(String args[])
    {
//        Scanner cin = new Scanner(System.in);
//        ArrayList<Integer> numberArray = new ArrayList();
//        int n, m, k;
//        n = cin.nextInt();
//        m = cin.nextInt();
//        k = cin.nextInt();
//        while(cin.hasNextLine())
//        {
//            numberArray.add(cin.nextInt());
//        }

        ArrayList<Integer> numberArray = new ArrayList();
        numberArray.add(1);
        numberArray.add(2);
        numberArray.add(3);
        new Solution().myFunc(numberArray, 3, 10);
    }
}