package _1_introduction_java.exercise.e2;

import java.util.Scanner;

public class Number_convert_Chart {
    public static void main(String[] args) {
//        method(6);
        Scanner input = new Scanner(System.in);
        System.out.println("nhap toi da 3 so");
        int number = input.nextInt();
        if(number<=0 && number<10){
            switch (number){
                case 0:
                    System.out.println("zero");break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:System.out.println("nine");
                    break;
            }
        } else if (number>=10 && number<20) {
            switch (number){
                case 10:
                    System.out.println("ten");break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twele");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:System.out.println("nineteen");
                    break;
            }
        } else  if(number>=20 && number<100){
            int chuc = number/10;
            int donvi=number%10;
            switch (chuc){
                case 2:
                    System.out.printf("twenty ");
                    break;
                case 3:
                    System.out.printf("thirty ");
                    break;
                case 4:
                    System.out.printf("forty ");
                    break;
                case 5:
                    System.out.printf("fifty ");
                    break;
                case 6:
                    System.out.printf("sixty ");
                    break;
                case 7:
                    System.out.printf("seve ");
                    break;
                case 8:
                    System.out.printf("eighty ");
                    break;
                case 9:System.out.printf("ninety ");
                    break;
            }
            switch (donvi){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:System.out.println("nine");
                    break;
            }
        } else if(number>=100 && number<1000){
            int tram =number/100;
            int chuc = (number/10)%10;
            int donvi =number%10;
            switch (tram){
                case 1:
                    System.out.printf("one hundred and ");
                    break;
                case 2:
                    System.out.printf("two hundred and");
                    break;
                case 3:
                    System.out.printf("three hundred and");
                    break;
                case 4:
                    System.out.printf("four hundred and");
                    break;
                case 5:
                    System.out.printf("five hundred and");
                    break;
                case 6:
                    System.out.printf("six hundred and");
                    break;
                case 7:
                    System.out.printf("seven hundred and");
                    break;
                case 8:
                    System.out.printf("eight hundred and ");
                    break;
                case 9:System.out.printf("nine hundred and ");
                    break;
            }
            switch (chuc){
                case 2:
                    System.out.printf("twenty ");
                    break;
                case 3:
                    System.out.printf("thirty ");
                    break;
                case 4:
                    System.out.printf("forty ");
                    break;
                case 5:
                    System.out.printf("fifty ");
                    break;
                case 6:
                    System.out.printf("sixty ");
                    break;
                case 7:
                    System.out.printf("seve ");
                    break;
                case 8:
                    System.out.printf("eighty ");
                    break;
                case 9:System.out.printf("ninety ");
                    break;
            }
            switch (donvi){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:System.out.println("nine");
                    break;
            }
        }
    }

//    public static void method(int x) {
//        int y = 5;
//        if (x > y) {
//           int z = x + y;
//        }
//        System.out.println(z);
//    }
}
