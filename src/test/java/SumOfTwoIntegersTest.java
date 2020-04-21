import org.junit.jupiter.api.Test;

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
        System.out.println(37 ^23);

        int button = 1;

        System.out.println(2<<3);
    }
}