package algorithm_book.arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    public boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return s.length() == set.size();
    }

    public boolean isUniqueWithVector(String s){
        int checker = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';

            if((checker & (1<<val)) > 0){
                return false;
            }

            checker |= (1<<val);
        }
        return true;
    }

    public boolean isUniqueWithArrays(String str) {

        boolean[] uniqueCharsArray = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int position = str.charAt(i);
            if (uniqueCharsArray[position]) {
                return false;
            }
            uniqueCharsArray[position] = true;
        }
        return true;
    }

    public boolean isUniqueNoDataStructure(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int high = chars.length - 1;
            while (i < high) {
                if (chars[i] == chars[high]) {
                    return false;
                }
                high--;
            }
        }
        return true;
    }
}
