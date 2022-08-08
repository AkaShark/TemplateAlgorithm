package AlgorithmBased.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    static public int solution(String S, int B) {
        List<Integer> list = new ArrayList<>();
        char[] roads = S.toCharArray();
        for (int i = 0; i < roads.length; i++) {
            if (roads[i] == 'x') {
                int start = i, end = i;
                while (end < roads.length) {
                    if (roads[end] == 'x' && end < roads.length - 1) {
                        end ++;
                    } else {
                        i = end;
                        end -= 1;
                        list.add(end - start +1);
                        break;
                    }
                }
            }
        }
        list.sort(Comparator.reverseOrder());

        int ans = 0;
        int index = 0;
        while (true && list.size() > 0) {
            int len = list.get(index);
            if (B - (len + 1) > 0) {
                ans += len;
                B -= len + 1;
            }
            if (index == list.size() - 1) break;
            index ++;
        }

        if (B > 0 && list.size() > 0) {
            int tem = list.get(0);
            if (tem > B) {
                ans += B;
            } else if (tem == B) {
                ans += B - 1;
            } else {
                ans += tem;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        solution("x.x.xxx...x", 14);
    }
}
