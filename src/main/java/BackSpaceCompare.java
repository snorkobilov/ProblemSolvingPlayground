public class BackSpaceCompare {
    /*
    Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a
    backspace character.

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
     */

    public static boolean backspaceCompare(String S, String T) {
        char hash = '#';

        String longestString = S.length() >= T.length() ? S : T;
        for (int i = 0; i < longestString.length(); i++) {
            if (S.charAt(i) == hash) {



            }
        }
        return false;
    }
}
