package _7_Abstract_Class_and_Interface.exercise.e2;

import _7_Abstract_Class_and_Interface.exercise.e1.Circle;
import _7_Abstract_Class_and_Interface.exercise.e1.Rectangle;
import _7_Abstract_Class_and_Interface.exercise.e1.Shape;
import _7_Abstract_Class_and_Interface.exercise.e1.Square;

public class Test {
    public static void main(String[] args) {
//        double d = 3;

       // int i = (int)3.0;

        Shape [] arr= new Shape[3];
        arr[0]= new Circle(5,"green",false);
        arr[1]= new Square(13,"blue",true);
        arr[2]= new Rectangle("black",false,5,12);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] instanceof Square){
               Square  square = (Square) arr[i];
                square.howToColor();
            }
        }
    }
} 
