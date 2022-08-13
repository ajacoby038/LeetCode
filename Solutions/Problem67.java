/*
    67. Add Binary

    Given two binary strings a and b, return their sum as a binary string.

    Example 1:
    Input: a = "11", b = "1"
    Output: "100"

    Example 2:
    Input: a = "1010", b = "1011"
    Output: "10101"

    Constraints:
    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
 */

class Problem67 {
    public String addBinary(String a, String b) {
        int place = 0;
        String sum = "";
        if (a.length() > b.length()) {
            while (b.length() < a.length()) {
                b = "0" + b;
            }
        } else {
            while (a.length() < b.length()) {
                a = "0" + a;
            }
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            int tot = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + place;
            if (tot == 0) {
                sum = "0" + sum;
                place = 0;
            } else if (tot == 1) {
                sum = "1" + sum;
                place = 0;
            } else if (tot == 2) {
                sum = "0" + sum;
                place = 1;
            } else {
                sum = "1" + sum;
                place = 1;
            }
        }
        if (place == 1) {
            sum = "1" + sum;
        }
        return sum;
    }
}