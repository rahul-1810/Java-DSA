package FunctionsMethods;

import java.util.Scanner;

public class SumofFirstNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumofN(n);
        System.out.println(ans);
    }
    static int sumofN(int n){
        return n * (n + 1) / 2;
    }
}
