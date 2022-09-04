/*
    3. Longest Substring Without Repeating Characters

    Given a string s, find the length of the longest substring without repeating characters.

    Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int longest = -1;
        String cur = "";
        int i = 0;
        int j = 0;
        while (i + j < s.length()) {
            if (cur.indexOf(s.charAt(i + j)) == -1) {
                cur += s.charAt(i + j);
                j++;
            } else {
                if (cur.length() > longest) {
                    longest = cur.length();
                }
                i += cur.indexOf(s.charAt(i + j)) + 1;
                j = 0;
                cur = "";
            }
        }
        if (longest == -1) {
            return s.length();
        }
        if (cur.length() > longest) {
            return cur.length();
        }
        return longest;
    }
}