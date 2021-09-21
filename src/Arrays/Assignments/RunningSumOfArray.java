package Arrays.Assignments;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {5,6,8,9,};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = nums[i] + sum;
            ans[i] = sum;
        }
        return ans;
    }
}
