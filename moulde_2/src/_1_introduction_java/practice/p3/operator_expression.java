package _1_introduction_java.practice.p3;

import java.util.Scanner;

public class operator_expression {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("enter width:");
        String widthString= input.nextLine();
        width = Integer.parseInt(widthString);
        System.out.println("enter name:");
        String name = input.nextLine();
        System.out.println("name: "+name);
        System.out.println("enter height:");
        height = input.nextFloat();
        float area = height*width;
        System.out.println("result area ="+area);
    }
}
