package _15_Debug.exercise.e1;

import java.util.Scanner;

public class IllegalTriangleException {
    String error ;
    public IllegalTriangleException(String error){
        this.error = error;
    }

    @Override
    public String toString() {
        return "IllegalTriangleException{" +
                "error='" + error + '\'' +
                '}';
    }

    public static void check(int a, int b, int c) throws Exception {
        if (a<0 || b<0 || c<0) throw new Exception("Side1 < 0 or Side2 <0 or Side3 <0");
        if (a+b<c || a+c<b || b+c<0) throw new Exception("Two side of Triangle smaller one Side ");
    }
}
