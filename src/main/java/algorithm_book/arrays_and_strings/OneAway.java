package algorithm_book.arrays_and_strings;

public class OneAway {
    public boolean isOneAway(String s1, String s2) {

        int s1Length = s1.length();
        int s2Length = s2.length();
        if (Math.abs(s1Length - s2Length) > 1 || s1.equals(s2)) return false;

        if (s1Length == s2Length) {
            return isOneAwayEqualLengthStrings(s1, s2);
        }

        String longestString = s1Length > s2Length ? s1 : s2;
        String shortestString = s1Length < s2Length ? s1 : s2;

        int index1 = 0, index2 = 0;

        while (index1 < s1Length && index2 < s2Length) {
            if (longestString.charAt(index1) != shortestString.charAt(index2)) {
                if (longestString.charAt(index1) != shortestString.charAt(index2)) {
                    return false;
                }
                index1++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean isOneAwayEqualLengthStrings(String s1, String s2) {
        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }

        return diffCount <= 1;
    }
}
