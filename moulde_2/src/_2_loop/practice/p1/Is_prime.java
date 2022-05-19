package _2_loop.practice.p1;

import java.util.Scanner;

public class Is_prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so");
        int prime = input.nextInt();
        if(prime<2){
            System.out.println("not is prime");
        }else {
            boolean flag = true;
            for (int i = 2; i <=Math.sqrt(prime) ; i++) {
                if (prime%i==0){
                    flag =false;
                    break;
                }
            }
            if (flag== true){
                System.out.println("is a prime: "+prime);
            }else {
                System.out.println("is not a prime: "+prime);
            }
        }
    }
}
