/*
    242. Valid Anagram

    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Constraints:
    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.
 */

import java.util.Arrays;
class Problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] first = new char[s.length()];
        char[] second = new char[t.length()];
        for (int i = 0; i < s.length(); i++) {
            first[i] = s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            second[i] = t.charAt(i);
        }
        Arrays.sort(first);
        Arrays.sort(second);
        if (Arrays.equals(first, second)) {
            return true;
        }
        return false;
    }
}