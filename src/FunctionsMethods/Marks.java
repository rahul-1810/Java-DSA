package FunctionsMethods;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String ans = checkMarks(marks);
        System.out.println(ans);
    }

    static String checkMarks(int m){
        if(m >= 91 && m <= 100) return "AA";
        if(m >= 81 && m <= 90) return "AB";
        if(m >= 71 && m <= 80) return "BB";
        if(m >= 61 && m <= 70) return "BC";
        if(m >= 51 && m <= 60) return "CD";
        if(m >= 41 && m <= 50) return "DD";
        if(m<=40) return "FAIL";
        return "INVALID";

    }
}
