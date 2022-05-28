package _4_Class_and_Object.exercise.e3;

public class Fan {
    public final int slow=1;
    public final int medium=2;
    public final int fast =3;
    public int speed=slow;
    public boolean on=false;
    public double radius =5;
    public String color = "blue";
    Fan(){

    }
    public void setMediumSpeed(){
        this.speed=medium;
    }

    public void setFastSpeed(){
        this.speed=fast;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String connect(){
        return this.isOn()? String.format("Speed: %d, Color: %s, Radius: %.1f. Fan is On",speed,color,radius):String.format("Color: %s, Radius: %.1f. Fan is Off",color,radius);
    }

}
