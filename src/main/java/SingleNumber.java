import java.util.Arrays;

public class SingleNumber {

    /*
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.
    Input: [2,2,1]
Output: 1
     */

    public static int getSingleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        nums = Arrays.stream(nums).sorted().toArray();

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        if (nums.length % 2 != 0) {
            return nums[nums.length - 1];
        }
        return 0;
    }
}
