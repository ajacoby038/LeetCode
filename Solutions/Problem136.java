import java.util.ArrayList;
import java.util.List;

class Solution {
    public int singleNumber(int[] nums) {
        int total = 0;
        List<Integer> tracker = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!tracker.contains(nums[i])) {
                tracker.add(nums[i]);
                total += nums[i];
            } else {
                total -= nums[i];
            }
        }
        return total;
    }
}