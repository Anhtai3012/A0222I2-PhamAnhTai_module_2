package _6_Inheritance.exercise.e2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Point2D point2D= new Point2D();
        point2D.setXY(1,2);
        System.out.println(point2D);
        Point3D p = (Point3D) point2D;
        System.out.println(p.toString());
    }
}
