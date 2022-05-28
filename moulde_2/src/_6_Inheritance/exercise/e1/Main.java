package _6_Inheritance.exercise.e1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(circle1);
        Circle circle2= new Circle(5.1,"blue");
        System.out.println(circle2);
        Cylinder cylinder1= new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2=new Cylinder(10,"GREEN",6.2);
        System.out.println(cylinder2);
    }
}
