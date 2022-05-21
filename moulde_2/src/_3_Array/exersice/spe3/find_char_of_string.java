package _3_Array.exersice.spe3;

import java.util.Scanner;

public class find_char_of_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str ="anh tai";
        System.out.println(str);
        System.out.println("nhap ki tu");
        String check = input.nextLine();
        int count=0;
        for (int i = 0; i <str.length();i++) {
            if (check.indexOf(str.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}
