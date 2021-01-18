package algorithm_book.arrays_and_strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {
    StringCompression stringCompression;

    @BeforeEach
    void setUp(){
        stringCompression = new StringCompression();
    }

    @Test
    void stringCompression(){
        String input =  "aabbcccddddeeeeee";
        String compressedString = stringCompression.compressString(input);
        assertEquals("a2b2c3d4e6", compressedString);
    }

    @Test
    void stringCompression2(){
        String input =  "aabbcccddddeeeeeeaa";
        String compressedString = stringCompression.compressString(input);
        assertEquals("a2b2c3d4e6a2", compressedString);
    }

    @Test
    void stringCompression3(){
        String input =  "aabbcccddddeeeeeea";
        String compressedString = stringCompression.compressString(input);
        assertEquals("a2b2c3d4e6a1", compressedString);
    }
}