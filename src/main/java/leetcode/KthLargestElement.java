package leetcode;

import java.util.Arrays;

public class KthLargestElement {

    /**
     * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * <p>
     * Example 1:
     * <p>
     * Input: [3,2,1,5,6,4] and k = 2
     * Output: 5
     * Example 2:
     * <p>
     * Input: [3,2,3,1,2,4,5,5,6] and k = 4
     * [1,2,2,3,3,4,5,5,6]
     * Output: 4
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ array's length.
     */

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
