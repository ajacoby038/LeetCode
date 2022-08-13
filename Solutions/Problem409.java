/*
    409. Longest Palindrome

    Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
    Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

    Example 1:
    Input: s = "abccccdd"
    Output: 7
    Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

    Example 2:
    Input: s = "a"
    Output: 1
    Explanation: The longest palindrome that can be built is "a", whose length is 1.

    Constraints:
    1 <= s.length <= 2000
    s consists of lowercase and/or uppercase English letters only.
 */

import java.util.HashMap;
import java.util.Map;
class Problem409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        int longest = 0;
        boolean foundOne = false;
        for (char c : counts.keySet()) {
            longest += counts.get(c) - (counts.get(c) % 2);
            if (counts.get(c) % 2 == 1 && foundOne == false) {
                longest++;
                foundOne = true;
            }
        }
        return longest;
    }
}