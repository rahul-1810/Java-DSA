package BasicProgramming;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float P, T, R;
        System.out.println("Enter the following details");
        System.out.print("Principle amount: ");
        P = sc.nextFloat();
        System.out.print("Time in years: ");
        T = sc.nextFloat();
        System.out.print("Rate of Interest: ");
        R = sc.nextFloat();
        System.out.println("Interest is:-  " + (P*T*R) / 100);
    }
}
