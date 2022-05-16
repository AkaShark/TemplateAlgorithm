package camp.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i = 0; i < 100; i++) {
            map.put(i, 100 - i);
            System.out.println(map.remove(i - 1));
        }
    }
    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}

