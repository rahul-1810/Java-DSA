package FunctionsMethods;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = evenodd(num);
        System.out.println(ans);
    }

    static boolean evenodd(int num){
        return num % 2 == 0;
    }
}
