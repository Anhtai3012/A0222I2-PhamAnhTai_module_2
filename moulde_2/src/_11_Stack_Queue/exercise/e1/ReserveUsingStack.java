package _11_Stack_Queue.exercise.e1;

import java.util.Arrays;
import java.util.Stack;

public class ReserveUsingStack {
    public static void main(String[] args) {
        Integer[] a= new Integer[3];
        a[0]=1;
        a[1]=2;
        a[2]=4;
        System.out.println("Arrays Integer before reserve");
        Arrays.asList(a).forEach(System.out::println);
        Stack<Integer> stack= new Stack<>();
        Arrays.asList(a).forEach(e->stack.push(e));

        int size= stack.size();
        for (int i = 0; i < size; i++) {
            a[i]= stack.pop();
        }

        System.out.println("Arrays Integer after reserve:");
        Arrays.asList(a).forEach(System.out::println);
    }
}
