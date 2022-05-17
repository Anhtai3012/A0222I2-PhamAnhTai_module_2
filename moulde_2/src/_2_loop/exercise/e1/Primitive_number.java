package _2_loop.exercise.e1;

public class Primitive_number {
    public static void main(String[] args) {
        int n =0;
        int count =0;
        while (count<20){
            boolean flag =true ;
            if(n<2){
                flag =false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n%i == 0){
                        flag = false;
                        break;
                    }
                }
            }
            if (flag==true){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
