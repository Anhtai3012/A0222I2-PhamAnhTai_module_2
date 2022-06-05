package _7_Abstract_Class_and_Interface.practice.p3;

import _6_Inheritance.exercise.e1.Circle;
import _7_Abstract_Class_and_Interface.practice.p2.ComparableCircle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5);
        System.out.println("Pre-sorted");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
//        CircleComparator circleComparator = new CircleComparator();

        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
