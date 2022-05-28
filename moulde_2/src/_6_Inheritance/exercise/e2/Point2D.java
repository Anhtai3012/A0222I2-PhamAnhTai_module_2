package _6_Inheritance.exercise.e2;

public class Point2D {
    private float x =0.0f;
    private float y=0.0f;
    public Point2D(){

    }
    public  Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] arr={x,y};
        return arr;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        float[] a = getXY();
        return "X:"+a[0]+"Y:"+a[1];
    }
}
