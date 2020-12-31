package algorithm_book.arrays_and_strings;

import java.util.Arrays;

public class PermutationString {

    public boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sortString(str1).equals(sortString(str2));
    }

    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
