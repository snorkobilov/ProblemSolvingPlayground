public class ZigzagConversion {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
     * display this pattern in a fixed font for better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * <p>
     * Write the code that will take a string and make this conversion given a number of rows:
     * <p>
     * string convert(string s, int numRows);
     * Example 1:
     * <p>
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     * Example 2:
     * <p>
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "PINALSIGYAHRPI"
     * Explanation:
     * <p>
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */

    public static String convert(String s, int numRows) {

        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
            {
                sb[idx].append(c[i++]);
            }
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--) // obliquely up
            {
                sb[idx].append(c[i++]);
            }
        }
        for (int idx = 1; idx < sb.length; idx++) {
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}

/**
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * <p>
 * 4: 	0 = 0
 * 1 = 6
 * 2 = 12
 * <p>
 * 3:  3 = 1
 * 4 = 5
 * 5 = 7
 * 6 = 11
 * 7 =13
 * <p>
 * 2:	8 = 2
 * 9 = 4
 * 10 = 8
 * 11 = 10
 * <p>
 * 1:	12 = 3
 * 13 = 9
 * <p>
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * 3:  0 = 0
 * 1 = 4
 * 2 = 8
 * 3 = 12
 * <p>
 * 2:  4 = 1
 * 5 = 3
 * 6 =5
 * 7 = 7
 * 8 = 9
 * 9 = 11
 * 10 = 13
 * <p>
 * 1: 	11 = 2
 * 12 = 6
 * 13 = 10
 */
