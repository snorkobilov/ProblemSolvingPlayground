package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * You can return the answer in any order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Not found");
    }


    /**
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     * <p>
     * Note:
     * <p>
     * Your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution and you may not use the same element twice.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     * Example 2:
     * <p>
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Example 3:
     * <p>
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     */

    public int[] twoSumSortedArray(int[] numbers, int target) {

        int lower = 0, upper = numbers.length - 1;

        while (lower < upper) {
            int sum = numbers[lower] + numbers[upper];
            if (sum > target) {
                upper--;
            } else if (sum < target) {
                lower++;
            } else if (sum == target) {
                return new int[]{lower + 1, upper + 1};
            }
        }

        throw new RuntimeException("Not found");
    }


}
