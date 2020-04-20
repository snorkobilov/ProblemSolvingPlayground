import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReduceToZeroTest {

    @Test
    void numberOfSteps() {
        int input = 14;
        assertEquals(6, ReduceToZero.numberOfSteps(input));
    }

    @Test
    void numberOfSteps0() {
        int input = 0;
        assertEquals(0, ReduceToZero.numberOfSteps(input));
    }

    @Test
    void getSubNumbersTest(){
        int sumOfNumbers = getSumOfNumber(3, 2);
        System.out.println(sumOfNumbers);

        System.out.println(getSumOfString("Ali", "Ibrohim"));

    }

    int getSumOfNumber(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }

    String getSumOfString(String firstNumber, String secondNumber){
        return firstNumber+secondNumber;
    }

    int getTimesOfNumber(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }
}