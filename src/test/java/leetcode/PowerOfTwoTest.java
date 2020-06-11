package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,4,8,16})
    void isPowerOfTwoReturnsTrue(int number) {
        assertTrue(PowerOfTwo.isPowerOfTwo(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 0, 3,5,12,22,18})
    void isPowerOfTwoReturnsFalse(int number) {
        assertFalse(PowerOfTwo.isPowerOfTwo(number));
    }
}