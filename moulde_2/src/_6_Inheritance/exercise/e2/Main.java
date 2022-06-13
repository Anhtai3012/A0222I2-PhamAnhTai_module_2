package _6_Inheritance.exercise.e2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Point2D point2D= new Point2D();
        point2D.setXY(1,2);
        System.out.println(point2D.getXY());

        Point2D p1= new Point3D();
        ((Point3D)p1).getXYZ();
//        Point3D p2 = (Point3D)p1;
        System.out.println(p1);
//        System.out.println(p1);
//        System.out.println(p2.getXYZ());
    }
}
