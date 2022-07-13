package EveryDay.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    static HashMap<String, String> hashMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(hiddenId("这里有一个bug，快来给我解决@[创游小助手:10001],另外说一句@[Julian:10002] YYDS!!!..."));
        System.out.println(hashMap);
    }
    // 这里有一个bug，快来给我解决 [创游小助手:10001],另外说一句 [Julian:10002] YYDS!!!...
    public static String hiddenId(String sequence) {
        StringBuilder stringBuilder = new StringBuilder(sequence);
        String temp = stringBuilder.toString();
        String[] strArray = temp.split("@");
        List<String> nameAndIdStrs = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].contains("[")) {
                nameAndIdStrs.add(strArray[i].substring(strArray[i].indexOf("["), strArray[i].indexOf("]") + 1));
            }
        }
        List<String> ids = new ArrayList<>();
        for (String nameAndId:
             nameAndIdStrs) {
            StringBuilder id = new StringBuilder(nameAndId.split(":")[1]);
            id.deleteCharAt(id.length() - 1);
            ids.add(id.toString());
            hashMap.put(nameAndId.split(":")[0], nameAndId.split(":")[1]);
        }
        for (String id :
                ids) {
            stringBuilder.replace(stringBuilder.indexOf(id) - 1, stringBuilder.indexOf(id) + id.length(), "");
        }
        return stringBuilder.toString();
    }
}
