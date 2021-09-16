package ConditionsAndLoops;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = subtractProductAndSum(num);
        System.out.println(ans);
    }
    static int subtractProductAndSum(int n){
        int prod = 1, sum = 0;
        while(n >0){
            prod = prod * (n %10);
            sum = sum + (n %10);
            n = n /10;
        }

        return prod - sum;
    }

}
