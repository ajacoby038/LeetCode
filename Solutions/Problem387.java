/*
    387. First Unique Character in a String

    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    Example 1:
    Input: s = "leetcode"
    Output: 0

    Example 2:
    Input: s = "loveleetcode"
    Output: 2

    Example 3:
    Input: s = "aabb"
    Output: -1
    
    Constraints:
    1 <= s.length <= 105
    s consists of only lowercase English letters.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

class Problem387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mappy = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            mappy.put(s.charAt(i), (int) mappy.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Object i : mappy.keySet()) {
            if ((int) mappy.get(i) == 1) {
                return s.indexOf((char) i);
            }
        }
        return -1;
    }
}