/*
    1. Two Sum

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
    
    Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
 */

import java.util.Arrays;

class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = new int[nums.length];
        for (int a = 0; a < nums.length; a++) {
            copy[a] = nums[a];
        }
        Arrays.sort(copy);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (copy[i] + copy[j] < target) {
                i++;
            } else if (copy[i] + copy[j] > target) {
                j--;
            } else {
                i = copy[i];
                j = copy[j];
                break;
            }
        }
        int[] result = new int[2];
        boolean add1 = false;
        Boolean add2 = false;
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] == i && add1 == false) {
                result[0] = a;
                add1 = true;
            } else if (nums[a] == j && add2 == false) {
                result[1] = a;
                add2 = true;
            }
        }
        return result;
    }
}