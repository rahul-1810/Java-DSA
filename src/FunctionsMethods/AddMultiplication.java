package FunctionsMethods;

import java.util.Scanner;

public class AddMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int add = addition(num1,num2);
        int multi = multiplication(num1,num2);
        System.out.println("Sum: "+add);
        System.out.println("Multiplication: "+multi);
    }
    static int addition(int num1,int num2){
        return num1+num2;
    }

    static int multiplication(int num1,int num2){
        if(num1!=0 && num2!=0) return num1 * num2;
        return 0;

    }
}
