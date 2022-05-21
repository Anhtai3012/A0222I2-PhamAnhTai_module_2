package _3_Array.exersice.spe1;

import java.util.Scanner;

public class total_row {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        int check;
        System.out.println("nhap hang ban muon ");
        check = input.nextInt();
        int sum=0;
       if (check>=0 && check<=arr.length){
           for (int i = 0; i <arr.length ; i++) {
               for (int j = 0; j <arr[i].length ; j++) {
                   if(j==check){
                       sum+=arr[i][j];
                   }
               }
           }
       }else {
           System.out.println("ko the nhap");
       }
        System.out.println("sum:"+sum);
    }
}
