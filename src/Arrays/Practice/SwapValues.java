package Arrays.Practice;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,9,12};
        System.out.println(Arrays.toString(arr));
        swapValues(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swapValues(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
