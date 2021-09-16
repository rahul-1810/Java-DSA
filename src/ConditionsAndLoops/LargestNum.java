package ConditionsAndLoops;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println("Enter numbers : ");
        int num = sc.nextInt();
        while(num != 0){
            if(num>max) max=num;
            num = sc.nextInt();
        }
        System.out.println("Largest : "+max);
    }
}
