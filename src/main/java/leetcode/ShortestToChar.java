package leetcode;

public class ShortestToChar {

    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] shortestArray = new int[length];

        int charPosition = -length;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == c) {
                charPosition = i;
            }
            shortestArray[i] = i - charPosition;
        }

        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                charPosition = i;
            }

            shortestArray[i] = Math.min(shortestArray[i], Math.abs(i - charPosition));
        }

        return shortestArray;
    }
}
