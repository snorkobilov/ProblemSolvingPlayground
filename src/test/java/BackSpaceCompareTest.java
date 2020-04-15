import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BackSpaceCompareTest {

    @Test
    void backspaceCompare() {
        String S = "ab#c", T = "ad#c";
        assertTrue(BackSpaceCompare.backspaceCompare(S, T));
    }

    @Test
    void compareObjects() {
        List<String> listOfNames = Arrays.asList("World","FirstName", "SecondName", "ThirdName");
        Comparator<String> nameComparator = Comparator.naturalOrder();
        List<String> sortedNames = listOfNames.stream().sorted(nameComparator).collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}