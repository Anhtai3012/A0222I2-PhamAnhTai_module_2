package _15_Debug.exercise.e1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//        try {
//            System.out.println("enter side 1");
//            int s1 = scanner.nextInt();
//            System.out.println("enter side 2");
//            int s2 = scanner.nextInt();
//            System.out.println("enter side 3");
//            int s3 = scanner.nextInt();
//            IllegalTriangleException.check(s1,s2,s3);
//            break;
//        }catch (Throwable e){
//            System.out.println(e.getMessage());
//        }
//    }
//        System.out.println("It is triangle");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter side 1");
            int s1 = scanner.nextInt();
            System.out.println("enter side 2");
            int s2 = scanner.nextInt();
            System.out.println("enter side 3");
            int s3 = scanner.nextInt();
            try {
                IllegalTriangleException.check(s1, s2, s3);
                System.out.println("It is triangle");
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
        }
    }
}
