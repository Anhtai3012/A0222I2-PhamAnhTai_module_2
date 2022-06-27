package _13_Search_algorithm.exercise.e1;

import java.util.LinkedList;
import java.util.Scanner;

public class FindStringMax {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter String");
        String string = "welcome";//scanner.nextLine();
//       char arr[] = string.toCharArray();
//       char temp ;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[i] > arr[j]){
//                    temp= arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//            }
//            }
//        }
//        System.out.println("sort: "+new String(arr));
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {

            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {

                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch: max) {
            System.out.print(ch);
        }
    }
}
