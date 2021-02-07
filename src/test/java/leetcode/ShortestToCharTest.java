package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShortestToCharTest {
    ShortestToChar shortestToChar;

    @BeforeEach
    void setUp() {
        shortestToChar = new ShortestToChar();
    }

    private static Stream<Arguments> testParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, "loveleetcode", 'e'),
                Arguments.of(new int[]{3,2,1,0}, "aaab", 'b')
        );

    }

    @ParameterizedTest
    @MethodSource(value = "testParameters")
    void test(int[] expected, String s, char c) {
        int[] ints = shortestToChar.shortestToChar(s, c);
        assertArrayEquals(expected, ints);
    }
}