import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void shouldReturnHighest(){
        var givenString = "babad";
        var expectedString = "bab";
        Assertions.assertEquals(expectedString, LongestPalindromicSubstring.longestPalindrome(givenString));
    }
}
