package _4_Class_and_Object.exercise.e3;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1=new Fan();
        fan1.setOn(true);
        fan1.setColor("pink");
        fan1.setRadius(7.5);
        Fan fan2= new Fan();
        fan2.setRadius(8.5);
        fan2.setColor("green");
        fan2.setOn(false);
        System.out.println("Fan1:"+fan1.toString());
        System.out.println("Fan2:"+fan2.toString());
    }
}
