package _3_Array.exersice.e2;

import java.util.Arrays;
import java.util.Scanner;

public class add_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[]={10,4,6,7,8};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        int index;
        System.out.println();
        do {
            System.out.printf("nhap chi so index de them vao mang:");
             index =input.nextInt();
             if (index<=1 || index>= arr.length-1){
                 System.out.println("khong the chen vao mang");
             }
        }while (index<=1 || index>= arr.length-1);
        System.out.println("nhap gia tri");
        int value = input.nextInt();

        int[] newArr = add(arr, index, value);

        System.out.println(Arrays.toString(newArr));

    }

    private static int[] add(int[] old ,int index, int val){
        int[] tmp = Arrays.copyOf(old, old.length +1);

        for (int i = tmp.length -1; i > index ; i--) {
            tmp[i] = old[i-1];
        }

        tmp[index] = val;

        return  tmp;
    }
}
