package ConditionsAndLoops;

import java.util.Scanner;

public class SumofNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Numbers :-");
        int num = sc.nextInt();
        while(num != 0){
            sum += num;
            num = sc.nextInt();
        }
        System.out.println("Ans is: "+sum);

    }
}
