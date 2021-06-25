package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithGreatestNumbers {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> returnList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            returnList.add(candy + extraCandies >= max);
        }
        return returnList;
    }

    public List<Boolean> kidsWithCandies8(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(Integer.MIN_VALUE);
        return Arrays.stream(candies).mapToObj(s -> s + extraCandies >= max).collect(Collectors.toList());
    }
}
