/*
    28. Implement strStr()

    Implement strStr().
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Clarification:
    What should we return when needle is an empty string? This is a great question to ask during an interview.
    For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

    Example 1:
    Input: haystack = "hello", needle = "ll"
    Output: 2

    Example 2:
    Input: haystack = "aaaaa", needle = "bba"
    Output: -1
    
    Constraints:
    1 <= haystack.length, needle.length <= 104
    haystack and needle consist of only lowercase English characters.
 */


class Problem28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int outer = 0;
        int inner = 0;
        while(outer <= haystack.length() - needle.length()) {
            if (haystack.charAt(outer) != needle.charAt(0)) {
                outer ++;
            } else {
                while (inner < needle.length()) {
                    if (haystack.charAt(outer + inner) == needle.charAt(inner)) {
                        if (inner == needle.length() - 1) {
                            return outer;
                        } else {
                            inner ++;
                        }
                    } else {
                        break;
                    }
                }
                outer++;
                inner = 0;
            }
        }
        return -1;
    }
}