package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9,12,25,33,40,45,53};
        int target = 40;
        int ans = binarySearch(nums,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

}
