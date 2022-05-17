package _1_introduction_java.exercise.e1;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("moi ban nhap ten");
        String name = input.nextLine();
        System.out.println("name: "+name);
    }
}
