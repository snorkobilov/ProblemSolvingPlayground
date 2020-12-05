package problems;

import java.util.Arrays;
import java.util.HashSet;

public class TwoArrays {

    public boolean containsTheSameElements(Integer[] array1, Integer[] array2){
        var numbersSet = new HashSet<>(Arrays.asList(array1));
        return Arrays.stream(array2).anyMatch(numbersSet::contains);
    }

    public boolean containsTheSameElementsQuad(Integer[] array1, Integer[] array2){
        for(Integer arrayOneElement: array1){
            for(Integer arrayTwoElement: array2){
                if(arrayOneElement.equals(arrayTwoElement)){
                    return true;
                }
            }
        }
        return false;
    }
}
