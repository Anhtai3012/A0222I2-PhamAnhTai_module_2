package _6_Inheritance.exercise.e4;

public class Shape {
    private double side =0;
    public Shape(){

    }
    public Shape(double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
