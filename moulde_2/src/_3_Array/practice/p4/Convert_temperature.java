package _3_Array.practice.p4;

import java.util.Scanner;

public class Convert_temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit ;
        double celsius ;
        int choice;
        do {
            System.out.println("menu");
            System.out.println("1.Fahrenheit to celsius");
            System.out.println("2.celsius to fahrenheit");
            System.out.println("0.exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter fahrenheit");
                    fahrenheit = input.nextDouble();
                    System.out.println(fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("enter celsius");
                    celsius =input.nextDouble();
                    System.out.println();
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double Frahrenheit = (5.0/9)*(fahrenheit-32);
        return Frahrenheit;
    }
    public static double celsuisToFahrenheit(double celsius ){
        double Celsius = (9.0/5)*celsius+32;
        return Celsius;
    }
}
