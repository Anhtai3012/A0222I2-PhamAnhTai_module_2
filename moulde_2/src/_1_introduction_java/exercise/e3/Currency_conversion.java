package _1_introduction_java.exercise.e3;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap USD");
        int currency = input.nextInt();
        currency *=23000;
        System.out.println("conversion: "+currency+" vnd");
    }
}
