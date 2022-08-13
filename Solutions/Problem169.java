/*
    169. Majority Element

    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Example 1:
    Input: nums = [3,2,3]
    Output: 3

    Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2

    Constraints:
    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109
 */

class Problem169 {
    public int majorityElement(int[] nums) {
        int counter = 0;
        int majorityNum = 0;
        for (int i : nums) {
            if (counter == 0) {
                majorityNum = i;
                counter++;
            } else {
                if (majorityNum == i) {
                    counter++;
                } else {
                    counter--;
                }
            }
        }
        return majorityNum;
    }
}