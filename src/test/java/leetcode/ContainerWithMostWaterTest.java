package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    @Test
    public void test1() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int output = ContainerWithMostWater.maxArea(input);
        assertEquals(49, output);
    }

    @Test
    public void test2() {
        int[] input = new int[]{4,3,2,1,4};
        int output = ContainerWithMostWater.maxArea(input);
        assertEquals(16, output);
    }

    @Test
    public void test3() {
        int[] input = new int[]{1,1};
        int output = ContainerWithMostWater.maxArea(input);
        assertEquals(1, output);
    }

    @Test
    public void test4() {
        int[] input = new int[]{1, 2,1};
        int output = ContainerWithMostWater.maxArea(input);
        assertEquals(2, output);
    }

}