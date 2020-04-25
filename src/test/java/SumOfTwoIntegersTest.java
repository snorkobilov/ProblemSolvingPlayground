import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfTwoIntegersTest {

    @Test
    void getSumTest() {
        assertEquals(3, SumOfTwoIntegers.getSum(1, 2));
    }

    @Test
    void getSumTest2() {
        assertEquals(34, SumOfTwoIntegers.getSum(10, 24));
    }

    @Test
    void getSumTest3() {
        assertEquals(0, SumOfTwoIntegers.getSum(-1, 1));
    }

    @Test
    void getSumTest4() {
        System.out.println(37 ^ 23);

        int button = 1;

        System.out.println(2 << 3);
    }

    @Test
    void reverseArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] output = reverse(input);
        Arrays.stream(output).forEach(System.out::print);
    }

    int[] reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}