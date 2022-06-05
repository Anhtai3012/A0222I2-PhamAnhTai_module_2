package _7_Abstract_Class_and_Interface.exercise.e2;

import _6_Inheritance.practice.p1.Rectangle;
import _6_Inheritance.practice.p1.Shape;
import _6_Inheritance.practice.p1.Square;
import _7_Abstract_Class_and_Interface.exercise.e1.Circle;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0]= new Circle(5, "red", true);
        arr[1]= new Rectangle("yellow", false, 5, 9);
        arr[2]= new Square(15,"blue", false);

        for(Shape s : arr){
            System.out.println(s.getClass().getSimpleName() + " with perimeter: " + s.getPerimeter());

            if(s instanceof Square){
                ((Square) s).howToColor();
            }
        }
    }
}
