package algorithm_book.arrays_and_strings;

public class StringCompression {
    public String compressString(String s) {
        int count = 0;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            count++;

            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                builder.append(s.charAt(i));
                builder.append(count);
                count = 0;
            }

        }

        return builder.length() < s.length() ? builder.toString() : s;
    }
}
