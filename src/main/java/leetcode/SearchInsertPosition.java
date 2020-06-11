package leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {

        int targetIndex = 0;

        while(targetIndex<nums.length){
            if(target<=nums[targetIndex]){
                return targetIndex;
            }
            targetIndex++;
        }

        return nums.length;
    }

    // [1,3,5,6], 5
}
