/*
    20. Valid Parentheses

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    
    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
 */

import java.util.ArrayList;
class Problem20 {
    public boolean isValid(String s) {
        ArrayList<Character> tracker = new ArrayList<Character>();
        for (char letter : s.toCharArray()) {
            if (letter == '(' || letter == '[' || letter == '{') {
                tracker.add(letter);
            } else {
                if (tracker.size() == 0) {
                    return false;
                }
                if (letter == ')') {
                    if (tracker.get(tracker.size() - 1) == '(') {
                        tracker.remove(tracker.size() - 1);
                    } else {
                        return false;
                    }
                } else if (letter == ']') {
                    if (tracker.get(tracker.size() - 1) == '[') {
                        tracker.remove(tracker.size() - 1);
                    } else {
                        return false;
                    }
                } else {
                    if (tracker.get(tracker.size() - 1) == '{') {
                        tracker.remove(tracker.size() - 1);
                    } else {
                        return false;
                    }
                }
            }
        }
        if (tracker.size() == 0) {
            return true;
        }
        return false;
    }
}