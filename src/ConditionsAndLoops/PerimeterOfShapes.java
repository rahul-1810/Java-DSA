package ConditionsAndLoops;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("1 Circle\n2 Equilateral Triangle\n3 Parallelogram\n4 Rectangle\n5 Rhombus\n6 Square");
        System.out.println("***********************************");
        System.out.print("Choose Perimeter of the Shape from the Following and Press According: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 ->{
                System.out.print("Enter value of Radius: ");
                float r = sc.nextFloat();
                float ans = circle(r);
                System.out.println("Ans is :"+ans);
            }

            case 2 ->{
                System.out.print("Enter value of a: ");
                float a = sc.nextFloat();
                float ans = equilateralTriangle(a);
                System.out.println("Ans is :"+ans);
            }

            case 3 ->{
                System.out.print("Enter value of a and b: ");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                float ans =  parallelogram(a,b);
                System.out.println("Ans is :"+ans);
            }

            case 4 ->{
                System.out.print("Enter value of l and w: ");
                float l = sc.nextFloat();
                float w = sc.nextFloat();
                float ans =  rectangle(l,w);
                System.out.println("Ans is :"+ans);
            }

            case 5 ->{
                System.out.print("Enter value of a: ");
                float a = sc.nextFloat();
                float ans = rhombus(a);
                System.out.println("Ans is :"+ans);
            }

            case 6 ->{
                System.out.print("Enter value of a: ");
                float a = sc.nextFloat();
                float ans = square(a);
                System.out.println("Ans is :"+ans);
            }

            default -> System.out.println("Enter valid choice");
        }
    }
    static float circle(float r) {return (float)(2 * 3.14 * r);}

    static float equilateralTriangle(float a){return 3 * a;}

    static float parallelogram(float a,float b){return 2 * (a+b);}

    static float rectangle(float l,float w){return 2 * (l+w);}

    static float rhombus(float a){return 4 * a;}

    static float square(float a){return 4 * a;}
}
