package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        int[] inputArray = {1,3,5,6};
        int target = 5;
        assertEquals(2, SearchInsertPosition.searchInsert(inputArray, target));
    }
}