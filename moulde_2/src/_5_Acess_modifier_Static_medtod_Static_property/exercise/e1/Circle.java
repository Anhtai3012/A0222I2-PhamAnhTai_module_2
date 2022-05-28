package _5_Acess_modifier_Static_medtod_Static_property.exercise.e1;

public class Circle {
    private double radius =1;
    private String colour ="red";
    Circle(){

    }
    Circle(double r){
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*2*3.14;
    }
}
