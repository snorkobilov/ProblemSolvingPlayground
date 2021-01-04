package algorithm_book.arrays_and_strings;

public class PalindromePermutation {
    /**
     * 1.4
     * tact coa, taco cat
     * <p>
     * Solution 1;
     */
    public boolean isPalindromePermutation(String input) {
        int[] chars = buildCharFrequency(input);
        return checkNumberCountsCorrect(chars);
    }

    public static void main(String[] args) {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        System.out.println(palindromePermutation.isPalindromePermutation("tact coa"));
    }

    private boolean checkNumberCountsCorrect(int[] numberCounts) {
        boolean foundOdd = false;
        for (int count : numberCounts) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private int[] buildCharFrequency(String phrase) {
        int[] returnArray = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (Character ch : phrase.toCharArray()) {
            int charNumber = getCharacterNumber(ch);
            if (charNumber != -1) {
                returnArray[charNumber]++;
            }
        }
        return returnArray;
    }

    private int getCharacterNumber(Character ch) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(ch);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
}
