package _3_Array.practice.p2;

import java.util.Scanner;

public class Find_value {
    public static void main(String[] args) {
       String name[]={"tai","hieu","huy","nam"};
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        String findName = input.nextLine();
        boolean check = false;
        for (int i = 0; i <name.length ; i++) {
            if (findName.equals(name[i])){
                System.out.println(findName);
                check=true;
                break;
            }
        }
        if(check!=true){
            System.out.println("not found: "+findName);
        }
    }
}
