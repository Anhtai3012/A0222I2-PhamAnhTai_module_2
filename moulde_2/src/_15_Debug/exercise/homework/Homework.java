package _15_Debug.exercise.homework;

import java.util.Scanner;

public class Homework {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("enter a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("enter b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("chia");
            int c= b/a;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
