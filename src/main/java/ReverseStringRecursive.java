public class ReverseStringRecursive {

    public static void reverseString(String givenString){
        if(givenString == null) return;
        char[] string = givenString.toCharArray();
        printString(0, string);
    }

    private static void printString(int index, char[] string) {
        if(string == null || index >= string.length){
            return;
        }

        printString(index +1, string);
        System.out.print(string[index]);
    }
}
