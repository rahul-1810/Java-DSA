package ConditionsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Enter the Count: ");
        int num = sc.nextInt();
        int temp;
        System.out.println(a+"\n"+b);
        for (int i=2;i<num;i++){
            temp = a+b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
