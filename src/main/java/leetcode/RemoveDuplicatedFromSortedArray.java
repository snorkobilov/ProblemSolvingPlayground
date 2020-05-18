package leetcode;

import java.util.HashSet;

public class RemoveDuplicatedFromSortedArray {

    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return
     * the new length.
     * <p>
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O
     * (1) extra memory.
     * <p>
     * Example 1:
     * <p>
     * Given nums = [1,1,2],
     * <p>
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * <p>
     * It doesn't matter what you leave beyond the returned length.
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        var uniqueList = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {

            uniqueList.add(nums[i]);
        }
        return uniqueList.size();
    }
}
