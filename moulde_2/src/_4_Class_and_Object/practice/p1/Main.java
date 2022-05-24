package _4_Class_and_Object.practice.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        rectangle recTangle = new rectangle(width,height);
        System.out.println("you rectangle "+recTangle.display());
        System.out.println("Perimeter of the Rectangle: "+recTangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+recTangle.getArea());
    }
}
