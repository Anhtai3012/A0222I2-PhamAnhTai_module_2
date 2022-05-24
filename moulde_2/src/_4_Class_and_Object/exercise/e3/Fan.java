package _4_Class_and_Object.exercise.e3;

public class Fan {
    public final int slow=1;
    public final int medium=2;
    public final int fast =3;
    private int speed=slow;
    private boolean on=false;
    private double radius =5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
    public void connect(){
        System.out.println(this.isOn()?String.format("Speed: %d, Color: %s, Radius: %.1f. Fan is On",speed,color,radius):String.format("Color: %s, Radius: %.1f. Fan is Off",color,radius));
    }
}
