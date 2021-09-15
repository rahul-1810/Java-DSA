// 3. Take name as input and print a greeting message for that name.
package BasicProgramming;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter Your Name:- ");
        name = sc.nextLine();
        System.out.println("Hello " + name );
    }
}
