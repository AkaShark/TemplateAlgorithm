package Interview.NC_119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(input[i]);
        }
        return ans;
    }
}
