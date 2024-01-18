package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        // This is the simple for loop ways to solve this problem
        // int max = candies[0];
        // for (int j = 1; j < candies.length; j++) {
        // if (candies[j] > max) {
        // max = candies[j];
        // }
        // }
        // This method also works in this condition
        Arrays.sort(candies);
        int max = candies[candies.length - 1];
        System.out.println(max);
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                li.add(true);
            } else {
                li.add(false);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        GreatestCandies o = new GreatestCandies();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(o.kidsWithCandies(candies, extraCandies));

    }
}
