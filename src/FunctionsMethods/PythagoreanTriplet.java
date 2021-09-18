package FunctionsMethods;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean ans = isPythagoreanTriplet(num1,num2,num3);
        System.out.println(ans);
    }
    static boolean isPythagoreanTriplet(int num1,int num2,int num3){
        int a = num1 * num1;
        int b = num2 * num2;
        int c = num3 * num3;
        return a == b + c || b == a + c || c == a + b;
    }
}
