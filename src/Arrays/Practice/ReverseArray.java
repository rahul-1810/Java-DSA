package Arrays.Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,79,70};
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
       int start = 0;
       int end = arr.length-1;
       while(start < end){
           swapValues(arr,start,end);
           start++;
           end--;
       }
    }
    static void swapValues(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
