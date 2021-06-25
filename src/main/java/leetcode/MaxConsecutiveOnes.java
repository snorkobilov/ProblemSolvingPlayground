package leetcode;

public class MaxConsecutiveOnes {

    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     * Example 2:
     * <p>
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * nums[i] is either 0 or 1.
     */

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int maxHere = 0;
        for (int n : nums) {
            if (n == 1) {
                maxHere++;
                max = Math.max(max, maxHere);
            } else maxHere = 0;
        }
        return max;
    }

}
