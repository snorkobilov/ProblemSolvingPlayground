package leetcode;

public class FindKthPositive {

    /**
     * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
     * <p>
     * Find the kth positive integer that is missing from this array.
     *
     * @param arr
     * @param k
     * @return Example 1:
     * <p>
     * Input: arr = [2,3,4,7,11], k = 5
     * Output: 9
     * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
     * Example 2:
     * <p>
     * Input: arr = [1,2,3,4], k = 2
     * Output: 6
     * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
     */


    public int findKthPositive(int[] arr, int k) {
        int missing = 0;
        int expected = 1;
        for (int i = 0; i < arr.length; ) {
            if (arr[i] == expected) {
                expected++;
                i++;
            } else {
                missing++;
                if (missing == k) {
                    break;
                }
                expected++;
            }

        }

        if (missing < k) {
            expected += k - missing - 1;
        }

        return expected;
    }
}
