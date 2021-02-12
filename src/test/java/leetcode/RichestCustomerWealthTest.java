package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RichestCustomerWealthTest {
    RichestCustomerWealth richestCustomerWealth;

    @BeforeEach
    void setUp() {
        richestCustomerWealth = new RichestCustomerWealth();
    }

    @Test
    void test() {
        int[][] input = {{1, 5}, {7, 3}, {3, 5}};
        int max = richestCustomerWealth.maximumWealth(input);
        assertEquals(10, max);
    }
}