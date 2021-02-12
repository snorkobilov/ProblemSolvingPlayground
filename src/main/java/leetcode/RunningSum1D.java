package leetcode;

public class RunningSum1D {
    public int[] runningSum(int[] nums) {

        int[] sum = new int[nums.length];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            sum[i] = total;
        }
        return sum;
    }
}
