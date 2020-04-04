import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovingStonesTest {
    final int[] expected12Result = new int[]{1, 2};
    final int[] expected00Result = new int[]{0, 0};

    @Test
    public void shouldReturn00WhenIncremental() {
        int a = 1, b = 2, c = 3;
        int[] result = MovingStones.numMovesStones(a, b, c);
        verifyArraysEquals(expected00Result, result);
    }

    @Test
    public void shouldReturn00Decremental() {
        int a = 3, b = 2, c = 1;
        int[] result = MovingStones.numMovesStones(a, b, c);
        verifyArraysEquals(expected00Result, result);
    }

    @Test
    public void shouldReturn12when125() {
        int a = 1, b = 2, c = 5;
        int[] result = MovingStones.numMovesStones(a, b, c);
        verifyArraysEquals(expected12Result, result);
    }

    @Test
    public void shouldReturn12when351() {
        int a = 3, b = 5, c = 1;
        int[] result = MovingStones.numMovesStones(a, b, c);
        verifyArraysEquals(expected12Result, result);
    }

    private void verifyArraysEquals(int[] firstArray, int[] secondArray) {
        assertArrayEquals(firstArray, secondArray);
    }
}
