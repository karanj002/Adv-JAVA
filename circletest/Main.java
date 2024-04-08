package circletest;
import circle.Circle.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        circle.Circle c=new circle.Circle(radius);
        System.out.println("Area of circle = " + c.Area()  + " sq units");
        System.out.println("Circumference of circle = " + c.Perimeter() + " units");
        sc.close();
    }
}
