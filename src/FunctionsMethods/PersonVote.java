package FunctionsMethods;
import java.util.Scanner;
public class PersonVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean ans = eligible(age);
        System.out.println(ans);
    }
    static boolean eligible(int age){
        return (age>=18);
    }
}
