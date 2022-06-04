package Offer.offer50;

import java.util.HashMap;

public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), true);
            } else {
                hashMap.put(s.charAt(i), false);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.get(s.charAt(i))) {
                ans = s.charAt(i);
                break;
            }
        }
        return ans;
    }
}
