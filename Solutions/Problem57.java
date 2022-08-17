/*
    57. Insert Interval

    You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
    Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
    Return intervals after the insertion.

    Example 1:
    Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
    Output: [[1,5],[6,9]]

    Example 2:
    Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    Output: [[1,2],[3,10],[12,16]]
    Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

    Constraints:
    0 <= intervals.length <= 104
    intervals[i].length == 2
    0 <= starti <= endi <= 105
    intervals is sorted by starti in ascending order.
    newInterval.length == 2
    0 <= start <= end <= 105
 */

import java.util.ArrayList;
import java.util.List;
class Problem57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Integer[]> replace = new ArrayList<Integer[]>();
        boolean swap = false;
        Integer[] temp = {newInterval[0], newInterval[1]};
        for (int i = 0; i < intervals.length; i++) {
            Integer[] adder = {intervals[i][0], intervals[i][1]};
            if (intervals[i][1] < newInterval[0]) {
                replace.add(adder);
            } else if (intervals[i][0] > newInterval[1]) {
                if (swap == false) {
                    replace.add(temp);
                    swap = true;
                }
                replace.add(adder);
            } else {
                temp[0] = Math.min(intervals[i][0], Math.min(newInterval[0], temp[0]));
                temp[1] = Math.max(intervals[i][1], Math.max(newInterval[1], temp[1]));
            }
        }
        if (swap == false) {
            replace.add(temp);
        }
        int[][] ans = new int[replace.size()][2];
        for (int i = 0; i < replace.size(); i++) {
            ans[i][0] = replace.get(i)[0];
            ans[i][1] = replace.get(i)[1];
        }
        return ans;
    }
}