package _3_Array.exersice.e5;

import java.util.Scanner;

public class Min_array {
//    Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("nhap so luong vao");
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("element:"+i);
            arr[i]= input.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int min =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(min > arr[i]){
               min = arr[i];
            }
        }
        System.out.println("min:"+min);
    }
}
