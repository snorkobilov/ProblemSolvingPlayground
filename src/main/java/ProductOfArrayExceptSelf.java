public class ProductOfArrayExceptSelf {
    /*
    Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the
    product of all the elements of nums except nums[i].
   Input:  [1,2,3,4]
Output: [24,12,8,6]
     */

    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] resultArray = new int[length];
        resultArray[0] = 1;
        for (int i = 1; i < length; i++) {
            resultArray[i] = resultArray[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = length - 1; i >= 0; i--) {
            resultArray[i] *= right;
            right *= nums[i];
        }
        return resultArray;
    }
}
