/*
    125. Valid Palindrome

    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.

    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

    Constraints:
    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.
 */


import java.util.ArrayList;
class Problem125 {
    public boolean isPalindrome(String s) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if ((48 <= s.charAt(i) && s.charAt(i) <= 57) || (65 <= s.charAt(i) && s.charAt(i) <= 90) || (97 <= s.charAt(i) && s.charAt(i) <= 122)) {
                chars.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        int i = 0;
        int j = chars.size() - 1;
        while (i < j) {
            if (chars.get(i) != chars.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}