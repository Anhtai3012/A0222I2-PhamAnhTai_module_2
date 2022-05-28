package _5_Acess_modifier_Static_medtod_Static_property.exercise.e2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name:"+student.getName()+" Class:"+student.getClasses());
        student.setName("mr.Tai");
        student.setClasses("H2SO4");
        System.out.println("Name:"+student.getName()+" Class:"+student.getClasses());
    }
}
