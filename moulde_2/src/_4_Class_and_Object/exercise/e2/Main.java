package _4_Class_and_Object.exercise.e2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor(Math.random() * 100000);
        }
        System.out.println("Before sort: " + Arrays.toString(arr));

        Stopwatch stopwatch = new Stopwatch();

        Arrays.sort(arr);


        stopwatch.stop();

        System.out.println("After sort: " + Arrays.toString(arr));

        System.out.println("Time: " +  stopwatch.getElapsedTime());
    }

}
