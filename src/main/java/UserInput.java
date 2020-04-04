/*

    Forgot to give description, could not find later.
 */

import java.util.ArrayList;
import java.util.List;

public class UserInput {
    public static class TextInput {
        private List<Character> listChars = new ArrayList<>();

        public List<Character> getListChars() {
            return listChars;
        }

        public void add(char c) {
            listChars.add(c);
        }

        public String getValue() {
            String returnString = "";
            for (Character ch : listChars) {
                returnString += ch;
            }
            return returnString;
        }
    }

    public static class NumericInput extends TextInput {

        @Override
        public void add(char c) {
            int expectedInt = Character.getNumericValue(c);
            if (!(expectedInt != -1)) {
                getListChars().add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
