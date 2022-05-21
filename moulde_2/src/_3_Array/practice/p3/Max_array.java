package _3_Array.practice.p3;

import java.util.Scanner;

public class Max_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[];
        int size;
        do {
            System.out.println("enter size");
            size = input.nextInt();
            if(size>20){
                System.out.println("moi ban nhap lai");
            }
        }while (size>20);
        arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("enter element"+i);
            arr[i]= input.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        int index=0;
        int j =0;
        int max =arr[0];
       while (j<arr.length){
           if (max<arr[j]){
               max = arr[j];
               index = j;
           }
       }
        System.out.println(" max:"+max+" index:"+index);
    }
}
