public class ReverseInteger {

    public static int reverseInteger(int x) {
        int reversedNumber = 0;
        while (x != 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
            if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return reversedNumber;
    }
}
