package _1_introduction_java.practice.p6;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("enter a year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year%4 == 0 && year%100 == 0 && year%400 ==0){
            System.out.println("it is leap year: "+year);
        }else {
            System.out.println("it is not year:"+year);
        }
    }
}
