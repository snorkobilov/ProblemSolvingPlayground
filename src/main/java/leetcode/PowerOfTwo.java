package leetcode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int rem;

        while (n > 1) {
            rem = n % 2;
            n = n / 2;
            if (rem != 0) {
                return false;
            }
        }
        return true;
    }
}

// 1, 2, 4, 8, 16, 32, 64, 128
