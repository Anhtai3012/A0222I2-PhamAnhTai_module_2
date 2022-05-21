package _3_Array.practice.p1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int [] arr ;
        do {
            System.out.println("enter size");
            size = input.nextInt();
            if (size>20){
                System.out.println("size do not exceed 20");
            }
        } while (size >20);
        arr = new int [size];
        int i =0 ;
        while (i<arr.length){
            System.out.println("enter element"+i);
            arr[i]=input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","elementin array ",":");
        for (int j = 0; j <arr.length ; j++) {
            System.out.print(arr[j]+"\t");
        }
        for (int j = 0; j <arr.length/2 ; j++) {
            int temp = arr[j];
           arr[j]=arr[size-1-j];
            arr[size-1-j]=temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j <arr.length ; j++) {
            System.out.print(arr[j]+"\t");
        }
    }
}
