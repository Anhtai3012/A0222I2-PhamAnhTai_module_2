package _6_Inheritance.exercise.e3;

public class MovablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;
    public MovablePoint(){

    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float x , float y ,float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float [] arr= {xSpeed,ySpeed};
        return arr;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint Move(){
        setX(getX()+ xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "("+getX()+","+getY()+"),speed=("+xSpeed+","+ySpeed+")";
    }

}
