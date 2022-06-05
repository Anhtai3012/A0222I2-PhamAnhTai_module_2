package _6_Inheritance.practice.p1;

import _7_Abstract_Class_and_Interface.exercise.e1.Resizeable;

public class Cricle extends Shape {
    private double radius=1.0 ;
    public Cricle (){

    }
    public Cricle(double radius){
        this.radius=radius;
    }
    public Cricle (double radius,String colour,boolean filled){
        setColour(colour);
        setFilled(filled);
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
