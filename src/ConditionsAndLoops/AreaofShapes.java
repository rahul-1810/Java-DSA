package ConditionsAndLoops;
import java.util.Scanner;

public class AreaofShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("1 for Circle\n2 for Triangle\n3 for Rectangle\n4 for Isosceles\n5 for Parallelogram\n6 for Rhombus\n7 for Equilateral Triangle");
        System.out.println("***********************************");
        System.out.print("Choose from the Following and Press According: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 -> {
                System.out.print("Enter Radius of Circle: ");
                float radius = sc.nextFloat();
                float ans = circle(radius);
                System.out.println("Area is: " + ans);
            }

            case 2 -> {
                System.out.print("Enter Base and Altitude: ");
                float base = sc.nextFloat();
                float alti = sc.nextFloat();
                float ans = triangle(base, alti);
                System.out.println("Area is: " + ans);
            }

            case 3 ->{
                System.out.print("Enter Length and Width: ");
                float l = sc.nextFloat();
                float w = sc.nextFloat();
                float ans = rectangle(l,w);
                System.out.println("Area is: " + ans);
            }

            case 4 ->{
                System.out.print("Enter value of A: ");
                float a = sc.nextFloat();
                float ans = isosceles(a);
                System.out.println("Area is: " + ans);
            }

            case 5 ->{
                System.out.print("Enter Base and Height: ");
                float b = sc.nextFloat();
                float h = sc.nextFloat();
                float ans = parallelogram(b,h);
                System.out.println("Area is: " + ans);
            }

            case 6 ->{
                System.out.print("Enter value of P and Q: ");
                float p = sc.nextFloat();
                float q = sc.nextFloat();
                float ans = rhombus(p,q);
                System.out.println("Area is: " + ans);
            }

            case 7->{
                System.out.print("Enter the Value of A: ");
                float a = sc.nextFloat();
                float ans = equilateralTriangle(a);
                System.out.println("Ans is: "+ans);
            }
            default -> System.out.println("Provide Valid Input");
        }
    }

    static float circle(float a) {
        return (float) (3.14 * a * a);
    }
    static float triangle(float base, float alti) {
        return (float) (0.5* base * alti);
    }

    static float rectangle(float l, float w){
        return l * w;
    }

    static float isosceles(float a){
        return (float)(0.5 * a * a);
    }

    static float parallelogram(float b, float h){
        return b * h;
    }

    static float rhombus(float p,float q){
        return (float)(0.5 * p * q);
    }

    static float equilateralTriangle(float a){
        return (float)(0.433 * a * a);
    }
}
