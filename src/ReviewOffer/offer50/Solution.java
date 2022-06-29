package ReviewOffer.offer50;

public class Solution {
    public char firstUniqChar(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
//    public char firstUniqChar(String s) {
//        int[] array = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            array[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (array[s.charAt(i) - 'a'] == 1) {
//                return s.charAt(i);
//            }
//        }
//        return ' ';
//    }