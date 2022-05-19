package _2_loop.practice.p2;

import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        double money;
        int month ;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("enter Money");
        money = input.nextDouble();
        System.out.println("enter Month");
        month = input.nextInt();
        System.out.println("enter interestrate");
        interestRate = input.nextDouble();
        double total =0;
        for (int i = 0; i <month ; i++) {
            total += money*(interestRate/100)/12*month ;
        }
        System.out.println("total"+total);
    }
}
