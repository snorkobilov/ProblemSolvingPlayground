import java.util.ArrayList;
import java.util.stream.Collectors;

public class LongestPalindromicSubstring {
    /*
    Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
Example 1:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: "cbbd"
Output: "bb"
     */

    public static String longestPalindrome(String s) {

        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("please provide valid string");
        }

        if(s.length() == 1){
            return s;
        }

        char[] charsFromString = s.toCharArray();
        int lengthOfArray = charsFromString.length - 1;
        var list = new ArrayList<String>();

        for (int i = 0; i <= lengthOfArray; i++) {
            for (int j = lengthOfArray; j > i; j--) {
                var string = s.substring(i, j);
                if (isPalindrome(string)) {
                    list.add(string);
                }
            }
        }

        var sortedList = list.stream().sorted().collect(Collectors.toList());
        return sortedList.get(sortedList.size() - 1);
    }

    private static boolean isPalindrome(String palindromeString) {
        if(palindromeString.length() == 1){
            return false;
        }
        char[] chars = palindromeString.toCharArray();
        var length = chars.length - 1;
        for (int i = 0; i <= length; i++) {
            if (chars[i] != chars[length - i]) {
                return false;
            }
        }
        return true;
    }
}
