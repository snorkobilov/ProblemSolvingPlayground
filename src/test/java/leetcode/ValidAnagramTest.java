package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void test1(){
        boolean anagram = validAnagram.isAnagram("anagram", "nagaram");
        boolean anagramON = validAnagram.isAnagramON("anagram", "nagaram");
        assertTrue(anagram);
        assertTrue(anagramON);
    }

    @Test
    void test2(){
        boolean anagram = validAnagram.isAnagram("rat", "car");
        boolean anagramON = validAnagram.isAnagramON("rat", "car");
        assertFalse(anagram);
        assertFalse(anagramON);
    }
}