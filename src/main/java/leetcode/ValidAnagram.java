package leetcode;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public boolean isAnagramON(String s, String t) {
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int i1 = getCharInt(s, i);
            letters[i1] ++;
        }

        for (int i = 0; i < t.length(); i++) {
            int tInt = getCharInt(t, i);
            letters[tInt] --;
        }

        return Arrays.stream(letters).allMatch(c -> c == 0);
    }

    private int getCharInt(String s, int i) {
        return s.charAt(i) - 'a';
    }
}
