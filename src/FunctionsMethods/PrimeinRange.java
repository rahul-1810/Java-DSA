package FunctionsMethods;

import java.util.Scanner;

public class PrimeinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking range
        int start = sc.nextInt();
        int end = sc.nextInt();
        while (start <= end) {
            if (isPrime(start)) {
                System.out.println(start);
            }
            start++;
        }
    }

    static boolean isPrime(int start) {
        boolean check = true;
        for (int i = 2; i <= start / 2; i++) {
            if (start % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
