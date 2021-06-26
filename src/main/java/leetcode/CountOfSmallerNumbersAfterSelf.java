package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    /**
     * You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [5,2,6,1]
     * Output: [2,1,1,0]
     * Explanation:
     * To the right of 5 there are 2 smaller elements (2 and 1).
     * To the right of 2 there is only 1 smaller element (1).
     * To the right of 6 there is 1 smaller element (1).
     * To the right of 1 there is 0 smaller element.
     * Example 2:
     * <p>
     * Input: nums = [-1]
     * Output: [0]
     * Example 3:
     * <p>
     * Input: nums = [-1,-1]
     * Output: [0,0]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     */

    // TODO: update to less time consuming solution.
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result.add(count);
            count = 0;
        }
        return result;
    }
}
