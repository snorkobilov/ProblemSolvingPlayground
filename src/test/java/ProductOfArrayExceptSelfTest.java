import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelfTest() {
        int[] input = new int[]{1,2,3,4};
        int[] output = new int[]{24,12,8,6};
        int[] expectedArray = ProductOfArrayExceptSelf.productExceptSelf(input);
        Arrays.stream(expectedArray).forEach(System.out::println);
        assertArrayEquals(output, expectedArray);
    }

    @Test
    void productExceptSelfTest2() {
        int[] input = new int[]{1,0};
        int[] output = new int[]{0,1};
        int[] expectedArray = ProductOfArrayExceptSelf.productExceptSelf(input);
        Arrays.stream(expectedArray).forEach(System.out::println);
        assertArrayEquals(output, expectedArray);
    }
}