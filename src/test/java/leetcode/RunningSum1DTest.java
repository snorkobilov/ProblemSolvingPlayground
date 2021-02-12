package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSum1DTest {
    RunningSum1D runningSum1D;

    @BeforeEach
    void setUp() {
        runningSum1D = new RunningSum1D();
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17})
        );
    }

    @ParameterizedTest
    @MethodSource
    void test(int[] input, int[] expected) {
        int[] ints = runningSum1D.runningSum(input);
        assertArrayEquals(expected, ints);
    }
}