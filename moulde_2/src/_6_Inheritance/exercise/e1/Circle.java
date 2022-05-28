package _6_Inheritance.exercise.e1;

public class Circle {
    private String colour="yellow" ;
    private double radius=1;
    public Circle(){

    }
    public  Circle(double radius){
        this.radius=radius;
    }
    public Circle (double radius,String colour){
        this.radius = radius;
        this.colour=colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return "Radius= "+getRadius()+" Colour: "+colour;
    }
}
