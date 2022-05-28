package _6_Inheritance.exercise.e1;

public class Cylinder extends Circle {
    private double height ;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height=height;
    }
    public  Cylinder (double height,String colour ,double radius){
        super(radius,colour);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return  Math.PI*Math.pow(getRadius(),2)*height;
    }

    @Override
    public String toString(){
        return "Height =" + getHeight()+"Volume: "+getVolume()+super.toString();
    }

}
