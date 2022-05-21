package _3_Array.exersice.e1;

import java.util.Scanner;

public class Delete_array {

    public static void main(String[] args) {
        int [] arr = {10,4,6,7,8};
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(" "+arr[i]);
        }
        System.out.println("nhap value ban muon xoa");
        Scanner input =  new Scanner(System.in);
        int value = input.nextInt();
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(value == arr[i]){
                index = i;
                break;
            }
        }
        for (int i = index; i <arr.length-1 ; i++) {
            arr[i]= arr[i+1];
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
