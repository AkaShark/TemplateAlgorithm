package camp.LeetCode_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans = new ArrayList();
        if (digits.length() == 0) {
            return ans;
        }
        backtrack(ans, digits, map, 0, new StringBuffer());
        return ans;
    }
    public void backtrack(List<String> ans, String digits, HashMap<Character, String> map, int index, StringBuffer combine) {
        if (index == digits.length()) {
            ans.add(combine.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            for (int i = 0; i < letters.length(); i ++) {
                combine.append(letters.charAt(i));
                backtrack(ans, digits, map, index + 1, combine);
                combine.deleteCharAt(index);
            }
        }
    }
}
