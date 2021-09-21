package Arrays.Assignments;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {5,6,8,9,};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
