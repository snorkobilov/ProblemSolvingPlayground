import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    @Test
    void returnsWhenLastDigitSingle() {
        int[] input = {2, 2, 1};
        int actualNumber = SingleNumber.getSingleNumber(input);
        assertEquals(1, actualNumber);
    }

    @Test
    void ReturnsWhenFirstDigitSingle() {
        int[] input = {1, 2, 2};
        int actualNumber = SingleNumber.getSingleNumber(input);
        assertEquals(1, actualNumber);
    }

    @Test
    void ReturnsWhenHighestDigitSingle() {
        int[] input = {1, 1, 3};
        int actualNumber = SingleNumber.getSingleNumber(input);
        assertEquals(3, actualNumber);
    }

    @Test
    void ReturnsWhenOnlySingleDigit() {
        int[] input = {1};
        int actualNumber = SingleNumber.getSingleNumber(input);
        assertEquals(1, actualNumber);
    }

    @Test
    void ReturnsWhenNegative() {
        int[] input = {-1, 1, 1};
        int actualNumber = SingleNumber.getSingleNumber(input);
        assertEquals(-1, actualNumber);
    }

    @Test
    void ReturnsWhenSingleDigitInMiddle() {
        int[] input = {-1, -1, 1, 2, 2};
        int actualNumber = SingleNumber.getSingleNumber(input);
        assertEquals(1, actualNumber);
    }
}