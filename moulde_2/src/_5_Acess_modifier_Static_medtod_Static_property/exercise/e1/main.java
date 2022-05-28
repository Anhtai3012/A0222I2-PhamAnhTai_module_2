package _5_Acess_modifier_Static_medtod_Static_property.exercise.e1;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println("radius:"+circle2.getRadius()+"m");
        System.out.println("Area:"+circle2.getArea()+"m^2");
    }
}
