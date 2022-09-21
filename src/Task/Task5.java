package Task;

import java.util.ArrayList;
import java.util.Stack;

public class Task5 {
    public boolean matchBracket (String content) {
        // write code here
        if (content.length() == 0) return true;
        ArrayList<Character> array = new ArrayList<>();
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) == '<') {
                array.add(content.charAt(i));
            }
            if (content.charAt(i) == '>') {
                array.add(content.charAt(i));
            }
            if (content.charAt(i) == '[') {
                array.add(content.charAt(i));
            }
            if (content.charAt(i) == ']') {
                array.add(content.charAt(i));
            }
            if (content.charAt(i) == '{') {
                array.add(content.charAt(i));
            }
            if (content.charAt(i) == '}') {
                array.add(content.charAt(i));
            }
        }
        if (array.size() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == '<' || array.get(i) == '[' || array.get(i) == '{') {
                  stack.push(array.get(i));
            } else {
                Character character = stack.pop();
                if (array.get(i) == '<') {
                     if (character != '>') {
                         return false;
                     }
                }
                if (array.get(i) == '[') {
                      if (character != ']') {
                          return false;
                      }
                }
                if (array.get(i) == '{')   {
                      if (character != '}') {
                          return false;
                      }
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }

}
