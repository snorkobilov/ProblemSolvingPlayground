package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    public void test(){
        var longestCommon = new LongestCommonPrefix();
        var result = longestCommon.longestCommonPrefix(new String[]{"flower","flow","flight"});
        assertEquals("fl", result);
    }
}