package ConditionsAndLoops;

import java.util.Scanner;

public class VolumeOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("1 Cone\n2 Prism\n3 Cylinder\n4 Sphere\n5 Pyramid\n6 Curved Surface Area Of Cylinder\n7 Total Surface Area Of Cube");
        System.out.println("***********************************");
        System.out.print("Choice Volume of Shapes from the Following: ");
        int ch = sc.nextInt();
        switch(ch){
            case 1 ->{
                System.out.print("Enter value of Radius and Height: ");
                float r = sc.nextFloat();
                float h = sc.nextFloat();
                float ans = cone(r,h);
                System.out.println("Ans is: "+ans);
            }

            case 2 -> {
                System.out.print("Choose from the following: ");
                System.out.print("1 Volume of a Triangular Prism\n2 Volume of a Rectangular prism\n3 Volume of a Pentagonal Prism\n4 Volume of a Hexagonal Prism");
                System.out.println("Enter the type of the Prism: ");
                int ch1 = sc.nextInt();
                switch (ch1){
                    case 1 ->{
                        System.out.print("Enter value of Apothem length, Base length and Height");
                        float a = sc.nextFloat();
                        float b = sc.nextFloat();
                        float h = sc.nextFloat();
                        float ans = triangularPrism(a,b,h);
                        System.out.println("Ans is: "+ans);
                    }
                    case 2 ->{
                        System.out.print("Enter value of length, width, height");
                        float l = sc.nextFloat();
                        float w = sc.nextFloat();
                        float h = sc.nextFloat();
                        float ans = rectangularPrism(l,w,h);
                        System.out.println("Ans is: "+ans);
                    }

                    case 3 -> {
                        System.out.print("Enter value of Apothem length, Base length and Height");
                        float a = sc.nextFloat();
                        float b = sc.nextFloat();
                        float h = sc.nextFloat();
                        float ans = pentagonalPrism(a,b,h);
                        System.out.println("Ans is: "+ans);
                    }

                    case 4 -> {
                        System.out.print("Enter value of Apothem length, Base length and Height");
                        float a = sc.nextFloat();
                        float b = sc.nextFloat();
                        float h = sc.nextFloat();
                        float ans = hexagonalPrism(a,b,h);
                        System.out.println("Ans is: "+ans);
                    }

                    case 5 ->{
                        System.out.print("Enter value of length, width, height");
                        float l = sc.nextFloat();
                        float w = sc.nextFloat();
                        float h = sc.nextFloat();
                        float ans = pyramid(l,w,h);
                        System.out.println("Ans is: "+ans);
                    }

                    case 6 ->{
                        System.out.print("Enter value of Radius and Height: ");
                        float r = sc.nextFloat();
                        float h = sc.nextFloat();
                        float ans = curvedSurfaceOfCylinder(r,h);
                        System.out.println("Ans is: "+ans);
                    }

                    case 7 ->{
                        System.out.print("Enter value of a: ");
                        float a = sc.nextFloat();
                        float ans = totalSurfaceAreaOfCube(a);
                        System.out.println("Ans is: "+ans);
                    }

                    default -> System.out.println("Enter the valid choice: ");
                }
            }
            case 3 -> {
                System.out.print("Enter value of Radius and Height: ");
                float r = sc.nextFloat();
                float h = sc.nextFloat();
                float ans = cylinder(r,h);
                System.out.println("Ans is: "+ans);
            }

            case 4 -> {
                System.out.print("Enter value of Radius: ");
                float r = sc.nextFloat();
                float ans = spshere(r);
                System.out.println("Ans is: "+ans);
            }
            default -> System.out.println("Enter valid choice");
        }
    }
    static float cone(float r,float h){
        return (float)(1.0467 * r * r * h);
    }

    static float triangularPrism(float a,float b,float h){
        return (float) (0.5 * a * b * h);
    }

    static float rectangularPrism(float l,float w,float h){
        return (l * w * h);
    }

    static float pentagonalPrism(float a,float b,float h){
        return (float) (2.5 * a * b * h);
    }

    static float hexagonalPrism(float a,float b,float h){
        return (3 * a * b * h);
    }

    static float cylinder(float r,float h){
        return (float)(3.14 * r * h);
    }

    static float spshere(float r){
        return (float)(4.1867 * r * r * r );
    }

    static float pyramid(float l,float w,float h){
        return (float)(0.33 * l * w * h);
    }

    static float curvedSurfaceOfCylinder(float r,float h){
        return (float)(6.28 * r * h);
    }

    static float totalSurfaceAreaOfCube(float a){
        return 6 * a * a;
    }
}
