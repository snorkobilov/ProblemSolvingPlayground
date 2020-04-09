import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {

    @Test
    void convertsZigZag() {
        String givenString = "PAYPALISHIRING";
        String expectedString = "PINALSIGYAHRPI";
        String actualString = ZigzagConversion.convert(givenString, 4);

        assertEquals(expectedString, actualString);
    }
}