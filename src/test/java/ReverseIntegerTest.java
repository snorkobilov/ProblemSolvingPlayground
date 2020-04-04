import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverseIntegerThreeDigit() {
        assertEquals(123, ReverseInteger.reverseInteger(321));
    }
    @Test
    void reverseInteger2Digit() {
        assertEquals(23, ReverseInteger.reverseInteger(32));
    }

    @Test
    void reverseInteger1Digit() {
        assertEquals(2, ReverseInteger.reverseInteger(2));
    }

    @Test
    void reverseInteger0() {
        assertEquals(0, ReverseInteger.reverseInteger(0));
    }
    @Test
    void reverseIntegerNegative() {
        assertEquals(-123, ReverseInteger.reverseInteger(-321));
    }
}