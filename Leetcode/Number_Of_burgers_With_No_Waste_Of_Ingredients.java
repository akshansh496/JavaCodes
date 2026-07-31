package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Number_Of_burgers_With_No_Waste_Of_Ingredients {
    // x + y = cheeseSlices
    // 4x + 2y = tomatoSlices
    // From the first equation,
    // y = cheeseSlices - x
    // Substitute into the second,
    // 4x + 2(cheeseSlices - x) = tomatoSlices
    // 4x + 2cheeseSlices - 2x = tomatoSlices
    // 2x = tomatoSlices - 2*cheeseSlices
    // x = (tomatoSlices - 2*cheeseSlices) / 2

    // y = cheeseSlices - x
    public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {

        List<Integer> ans = new ArrayList<>();

        if (tomatoSlices % 2 != 0 ||
                tomatoSlices < 2 * cheeseSlices ||
                tomatoSlices > 4 * cheeseSlices)
            return ans;

        int jumbo = (tomatoSlices - 2 * cheeseSlices) / 2;
        int small = cheeseSlices - jumbo;

        ans.add(jumbo);
        ans.add(small);

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(numOfBurgers(9121454, 4114536));
    }
}
