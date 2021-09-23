package Arrays.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
       List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for(int i: candies){
            ans.add(i >= max - extraCandies);
        }
        return ans;
    }
}
