package _2_loop.exercise.e2;

public class Shape {
    public static void main(String[] args) {
        System.out.println("square");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <7 ; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println("triagle");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
