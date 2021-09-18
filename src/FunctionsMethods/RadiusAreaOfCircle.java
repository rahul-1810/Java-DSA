package FunctionsMethods;

import java.util.Scanner;

public class RadiusAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float circum = circumference(radius);
        float area = area(radius);
        System.out.println("Circumference is: "+circum);
        System.out.println("Area is: "+area);
    }

    static float circumference(float radius){
        return (float) (6.28 * radius);
    }

    static float area(float radius){
        return (float)(3.14 * radius * radius);
    }
}
