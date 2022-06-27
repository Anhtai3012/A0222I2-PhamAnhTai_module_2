package _14_Sort_algotithm.practice.p2;

import java.util.Scanner;

public class BubbleSortByStep {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter list size");
        int size = Integer.parseInt(scanner.nextLine());
        int [] list = new int[size];
        System.out.println("enter"+list.length+"value");
        for (int i = 0; i <list.length ; i++) {
            System.out.println("index:"+i);
            list[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println("begin sort processing...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int [] list) {
        boolean needNextPass = true;
        for (int k = 0; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap" + list[i] + "with" + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }

            if (needNextPass = false) {
                System.out.println("array may be sorted and next pass not needed ");
                break;
            }

            System.out.println("list after the" + k+"sort");
            for (int i = 0; i <list.length ; i++) {
                System.out.println(list[i]+"\t");
            }
            System.out.println();
        }
    }
}
