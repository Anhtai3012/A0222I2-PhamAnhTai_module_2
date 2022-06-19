package _12_Java_collection_framework.practice.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Tai",20,"Da Nang");
        Student student2= new Student("Marry",25,"Ha Noi");
        Student student3= new Student("John",31,"American");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student1);
        Collections.sort(list);
        for (Student student: list) {
            System.out.println(student.toString());
        }
    }
}
