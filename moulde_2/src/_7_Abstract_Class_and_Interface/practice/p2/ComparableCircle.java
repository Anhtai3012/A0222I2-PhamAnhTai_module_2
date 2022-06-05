package _7_Abstract_Class_and_Interface.practice.p2;

import _6_Inheritance.exercise.e1.Circle;

//public class ComparableCircle extends Circle {
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>  {
    public ComparableCircle(){

    }

    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius , String colour , boolean filled){
        super(radius,colour);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }else if(getRadius() < o.getRadius()){
            return  -1;
        }else return 1;
    }
}
