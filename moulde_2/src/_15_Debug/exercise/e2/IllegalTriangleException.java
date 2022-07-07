package _15_Debug.exercise.e2;

import java.util.Scanner;

public class IllegalTriangleException {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("enter side1");
        int s1 = scanner.nextInt();
        System.out.println("enter side2");
        int s2 = scanner.nextInt();
        System.out.println("enter side3");
        int s3 = scanner.nextInt();
        Check(s1,s2,s3);
        System.out.println("it is triangle");
    }
    public static void Check(int a,int b,int c) throws Exception{
        if (a<0 || b<0 || c<0) throw new Exception();
        if (a+b<c || a+c<b || b+c<0) throw new Exception();
    }
}
