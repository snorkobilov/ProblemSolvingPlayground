package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementTest {
    KthLargestElement kthLargestElement;

    @BeforeEach
    void setUp() {
        kthLargestElement = new KthLargestElement();
    }

    @Test
    void findKthLargest() {
        var array = new int[]{3, 2, 1, 5, 6, 4};
        int kthLargest = kthLargestElement.findKthLargest(array, 2);
        assertEquals(5, kthLargest);
    }

    @Test
    void findKthLargestTest2() {
        var array = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int kthLargest = kthLargestElement.findKthLargest(array, 4);
        assertEquals(4, kthLargest);
    }
}