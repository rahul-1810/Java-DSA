// 2. Write a program to print whether a number is even or odd, also take input.

package BasicProgramming;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Insert Valid Input");
        }
        else if(num == 1){
            System.out.println("Not Even Nor Odd");
        }
        else if(num % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
