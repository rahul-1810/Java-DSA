package BasicProgramming;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number: ");
        float b = sc.nextFloat();
        System.out.print("Enter operation: ");
        char op = sc.next().charAt(0);
        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
    }
}
