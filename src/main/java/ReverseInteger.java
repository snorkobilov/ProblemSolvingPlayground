public class ReverseInteger {

    public static int reverseInteger(int number){
        int lastNumber = 0;
        int givenNumber = number;
        int reversedNumber = 0;

        while(givenNumber > 0){
            lastNumber = givenNumber%10;
            givenNumber = givenNumber/10;
            reversedNumber = lastNumber*10;
        }
        return reversedNumber;
    }
}
