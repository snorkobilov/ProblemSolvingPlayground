package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMismatchTest {
    SetMismatch setMismatch;

    @BeforeEach
    void setUp() {
        setMismatch = new SetMismatch();
    }

    @Test
    void findErrorNums() {
        int[] errorNums = setMismatch.findErrorNums(new int[]{2, 2});
        assertArrayEquals(new int[]{2,1}, errorNums);
    }

    @Test
    void findErrorNums1() {
        int[] errorNums = setMismatch.findErrorNums(new int[]{1,2,2,4});
        assertArrayEquals(new int[]{2,3}, errorNums);
    }
}