package leetcode;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > i){
               return new int[]{nums[i], --nums[i]};
            }else {
                return new int[]{nums[i], ++nums[i]};
            }
        }

        throw new IllegalArgumentException("Not found");

    }
}
