package BasicProgramming;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RS :- ");
        int rs = sc.nextInt();
        System.out.println("RS in $ is "+ (rs / 73.50));
    }
}
