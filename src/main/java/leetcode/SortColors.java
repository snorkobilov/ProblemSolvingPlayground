package leetcode;

public class SortColors {
    /**
     * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color
     * are adjacent, with the colors in the order red, white and blue.
     *
     * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     *
     * Note: You are not suppose to use the library's sort function for this problem.
     *
     * Example:
     *
     * Input: [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     */

    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int num: nums){
            if(num == 0) zeroCount++;
            if(num == 1) oneCount++;
            if(num == 2) twoCount++;
        }

        int oneEndingIndex = zeroCount + oneCount;
        int twoEndingIndex = oneEndingIndex + twoCount;

        for(int i =0; i< zeroCount; i++){
            nums[i] = 0;
        }

        for(int i = zeroCount; i< oneEndingIndex; i++){
            nums[i] = 1;
        }

        for(int i = oneEndingIndex; i< twoEndingIndex; i++){
            nums[i] = 2;
        }
    }

}
