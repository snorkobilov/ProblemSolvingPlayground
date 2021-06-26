package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOfSmallerNumbersAfterSelfTest {
    CountOfSmallerNumbersAfterSelf countOfSmallerNumbersAfterSelf;

    @BeforeEach
    void setUp() {
        countOfSmallerNumbersAfterSelf = new CountOfSmallerNumbersAfterSelf();
    }

    @Test
    void countSmaller() {
        int[] nums = new int[]{5, 2, 6, 1};
        List<Integer> integers = countOfSmallerNumbersAfterSelf.countSmaller(nums);
        assertEquals(List.of(2, 1, 1, 0), integers);
    }

    @Test
    void countSmallerTest1() {
        int[] nums = new int[]{-1};
        List<Integer> integers = countOfSmallerNumbersAfterSelf.countSmaller(nums);
        assertEquals(List.of(0), integers);
    }

    @Test
    void countSmallerTest2() {
        int[] nums = new int[]{-1, -1};
        List<Integer> integers = countOfSmallerNumbersAfterSelf.countSmaller(nums);
        assertEquals(List.of(0, 0), integers);
    }
}
