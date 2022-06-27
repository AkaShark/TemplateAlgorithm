package ReviewOffer.offer05;

public class Solution {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character word :
                s.toCharArray()) {
            if (word == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(word);
            }
        }
        return stringBuilder.toString();
    }
}
