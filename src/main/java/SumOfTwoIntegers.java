public class SumOfTwoIntegers {
    /**
     * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
     * <p>
     * Example 1:
     * <p>
     * Input: a = 1, b = 2
     * Output: 3
     */

    public static int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
