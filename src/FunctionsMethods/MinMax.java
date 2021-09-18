package FunctionsMethods;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        System.out.println("Enter Three Nums: ");
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int max = maxofThree1(num1,num2,num3);
        int min = minofThree1(num1,num2,num3);
        int max1 = maxofThree2(num1,num2,num3);
        int min2 = minofThree2(num1,num2,num3);
        System.out.println("Max by Method-1: "+max);
        System.out.println("Min by Method-1: "+min);
        System.out.println("Max by Method-2: "+max1);
        System.out.println("Min by Method-2: "+min2);
    }

    static int maxofThree1(int num1,int num2,int num3){
        int max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        return max;
    }

    static int minofThree1(int num1,int num2,int num3){
        int min = num1;
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;
        return min;
    }

    static int maxofThree2(int num1,int num2,int num3){
        if(num1 > num2 && num1 > num3) return num1;
        else if(num2 > num3) return num2;
        return num3;
    }

    static int minofThree2(int num1,int num2,int num3){
        if(num1 < num2 && num1 < num3) return num1;
        else if(num2 < num3) return num2;
        return num3;
    }
}
