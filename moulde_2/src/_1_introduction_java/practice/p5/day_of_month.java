package _1_introduction_java.practice.p5;

import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args) {
        System.out.println("moi ban chon month trong year");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    System.out.println("the month 2 has 28 or 29 day!");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("the month " + month + " has 31 day!");
                    break;
                default:
                    System.out.println("the month " + month + " has 30 day");
                    //break; có hay ko dều đc
            }
        }else {
            System.out.println("not found month");
        }
    }
}
