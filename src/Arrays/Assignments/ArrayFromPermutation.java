package Arrays.Assignments;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] buildArray(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
