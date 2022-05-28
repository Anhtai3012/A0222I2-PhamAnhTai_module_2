package _6_Inheritance.practice.p1;

public class Main {
    public static void main(String[] args) {
//        Shape shape1 = new Shape();
//        System.out.println(shape1);
//        Shape shape2= new Shape("blue",false);
//        System.out.println(shape2);
//        Cricle cricle1 = new Cricle();
//        System.out.println(cricle1);
//        Cricle cricle2= new Cricle(5.1,"blue",false);
//        System.out.println("Area:"+cricle2.getArea()+" ,SUPERClass:"+cricle2);
       Rectangle rectangle1 =new Rectangle();
      System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(10,20,"pink",false);
        System.out.println(rectangle2);
        Square square1 = new Square();
        System.out.println(square1);
        Square square2= new Square(2);
        System.out.println(square2);
    }
}
