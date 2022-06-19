package _12_Java_collection_framework.practice.p2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tai",20,"da nang");
        Student student2 = new Student("Marry",19,"da nang");
        Student student3 = new Student("John",21,"american");
        // write your code hashmap
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);


        for (Map.Entry<Integer,Student> s : studentMap.entrySet()){
            System.out.println(s.toString());
        }

        System.out.println("...SET...");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
