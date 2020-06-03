package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeNumber {

    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as
     * forward.
     * <p>
     * Input: 121
     * Output: true
     * <p>
     * Input: -121
     * Output: false
     */

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int number = x;

        int reversedNum = 0;
        while (number > 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }

        return reversedNum == x;
    }

}
