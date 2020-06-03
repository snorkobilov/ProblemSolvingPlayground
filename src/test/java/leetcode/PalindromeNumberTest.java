package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {121, 0, 4, 10001})
    void isPalindromeReturnsTrue(int x) {
        var isPalindrome = PalindromeNumber.isPalindrome(x);
        assertTrue(isPalindrome);
    }

    @ParameterizedTest
    @ValueSource(ints = {-121, -5, 123})
    void isPalindromeReturnsFalse(int x) {
        var isPalindrome = PalindromeNumber.isPalindrome(x);
        assertFalse(isPalindrome);
    }
}