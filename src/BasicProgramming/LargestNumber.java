package BasicProgramming;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first num:-");
        a = sc.nextInt();
        System.out.print("Enter second num:-");
        b = sc.nextInt();
        System.out.print("Enter third num:-");
        c = sc.nextInt();
        if ( a>b && a>c){
            System.out.println(a + " is Greater");
        }
        else if(b>c){
            System.out.println(b + " is Greater");
        }
        else {
            System.out.println(c + " is Greater");
        }
    }
}
