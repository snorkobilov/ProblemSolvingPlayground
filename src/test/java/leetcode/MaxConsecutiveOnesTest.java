package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesTest {
    MaxConsecutiveOnes maxConsecutiveOnes;

    @BeforeEach
    void setUp() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    void maxConcurrentOnes() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }


}
