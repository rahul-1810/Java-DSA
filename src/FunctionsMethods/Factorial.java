package FunctionsMethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
    }
    static int factorial(int num){
        int fact = 1;
        if(num < 0) return 0;
        if (num == 0 || num == 1) return 1;
        for (int i=1;i<=num;i++){
            fact =  fact * i;
        }
        return fact;
    }
}
