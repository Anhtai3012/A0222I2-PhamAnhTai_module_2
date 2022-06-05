package _7_Abstract_Class_and_Interface.exercise.e1;

public class Test {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0]= new Circle(3,"blue",false);
        resizeables[1]= new Rectangle("green",true,2,5);
        resizeables[2]= new Square(3,"pink",false);
        for (Resizeable e: resizeables) {
            if (e instanceof Circle) {
                e.resize(40);
                System.out.println(e);
            }else if(e instanceof Square) {
                e.resize(50);
                System.out.println(e);
            }else if (e instanceof Rectangle) {
                e.resize(60);
                System.out.println(e);
            }
        }
    }
}
