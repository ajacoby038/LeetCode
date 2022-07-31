/*
    350. Intersection of Two Arrays II

    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many
    times as it shows in both arrays and you may return the result in any order.

    Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]

    Example 2:
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [4,9]
    Explanation: [9,4] is also accepted.
    

    Constraints:
    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 1000
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int position = 0;
        
        if (nums2.length < nums1.length) {
            return intersect(nums2, nums1);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = position; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                    position = j + 1;
                    break;
                }
                if (nums1[i] < nums2[j]) {
                    position = j;
                    break;
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}