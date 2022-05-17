package _1_introduction_java.practice.p4;

import java.util.Scanner;

public class Linear_equation_resolver {
    public static void main(String[] args) {
        System.out.println("liner equation resolver");
        System.out.println("ax+b=c");
        Scanner input = new Scanner(System.in);
        System.out.println("a=");
        double a = input.nextDouble();
        System.out.println("b=");
        double b = input.nextDouble();
        System.out.println("c=");
        double c =input.nextDouble();
        double answer ;
        if(a != 0){
            answer = (c-b)/a;
            System.out.println("equation pass with x="+answer);
        }else {
            if (b==c){
                System.out.println("the solution is all x!");
            }else {
                System.out.println("no solution");
            }
        }
    }
}
