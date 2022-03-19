package camp.LeetCode_78;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int num : nums) {
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = ans.get(i);
                List<Integer> list = new ArrayList<>(temp);
                list.add(num);
                ans.add(list);
            }
        }
        return ans;
    }

}
