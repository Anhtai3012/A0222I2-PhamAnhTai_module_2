package _4_Class_and_Object.exercise.e1;

public class QuadracticEquation {
    double a,b,c;
    public QuadracticEquation (double a,double b,double c){
        this.a =a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDeta(){
        return (Math.pow(this.b,2)-4*this.a*this.c);
    }
    public String getDiscriminant() {
        return "b^2-4ac";
    }
    public double getRoot1(){
        return (-this.b+Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
    }
    public double getRoot2(){
        return (-this.b-Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
    }
}
