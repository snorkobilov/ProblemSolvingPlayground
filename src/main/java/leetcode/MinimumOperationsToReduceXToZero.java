package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumOperationsToReduceXToZero {

    /**
     * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost
     * or the rightmost element from the array nums and subtract its value from x.
     * Note that this modifies the array for future operations.
     * <p>
     * Return the minimum number of operations to reduce x to exactly 0 if it's possible, otherwise, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,4,2,3], x = 5
     * Output: 2
     * Explanation: The optimal solution is to remove the last two elements to reduce x to zero.
     * Example 2:
     * <p>
     * Input: nums = [5,6,7,8,9], x = 4
     * Output: -1
     * Example 3:
     * <p>
     * Input: nums = [3,2,20,1,1,3], x = 10
     * Output: 5
     * Explanation: The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * 1 <= nums[i] <= 104
     * 1 <= x <= 109
     */

    public int minOperations(int[] nums, int x) {

        int target = -x;
        for (int num : nums) target += num;

        if (target == 0) return nums.length;  // since all elements are positive, we have to take all of them

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; ++i) {

            sum += nums[i];
            if (map.containsKey(sum - target)) {
                res = Math.max(res, i - map.get(sum - target));
            }

            // no need to check containsKey since sum is unique
            map.put(sum, i);
        }

        return res == Integer.MIN_VALUE ? -1 : nums.length - res;
    }
}
