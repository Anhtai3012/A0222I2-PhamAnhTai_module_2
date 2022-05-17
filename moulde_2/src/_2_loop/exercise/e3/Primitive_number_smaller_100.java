package _2_loop.exercise.e3;

public class Primitive_number_smaller_100 {
    public static void main(String[] args) {
        int n=2;
        int count =0;
        while(n<100){
            boolean flag = true;
            if (n<2){
                flag = false;
            }else {
                for (int i = 2; i <=Math.sqrt(n); i++) {
                    if (n%i==0){
                        flag = false;
                    }
                }
            }
            if (flag== true && n <100){
                System.out.println(n);
            }
            n++;
        }
    }
}
