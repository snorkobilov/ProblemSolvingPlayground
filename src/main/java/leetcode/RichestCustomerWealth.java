package leetcode;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int tempSum = 0;
            for (int k : account) {
                tempSum += k;
            }

            max = Math.max(tempSum, max);
        }
        return max;
    }
}
