package _1_introduction_java.practice.p7;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter height m ");
        double height = input.nextDouble();
        System.out.println("enter weight kg");
        double weight =input.nextDouble();
        double result = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(result <18.5){
            System.out.printf("%-20.2f%s\n",result,"Underweight or skinny");
        } else if(18.5 <= result && result <= 25.0){
            System.out.println("normal");
        } else if(25.0<= result && result <= 30.0){
            System.out.println("overWeight");
        }else {
            System.out.println("Obese");
        }
    }
}
