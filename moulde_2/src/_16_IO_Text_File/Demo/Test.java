package _16_IO_Text_File.Demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();

        students.add(new Student("amber", 18, "A0222I1", true));
        students.add(new Student("john depp", 19, "A0222I1", true));
        students.add(new Student("jack", 21, "A0222I2", true));
        students.add(new Student("marry", 20, "A0222I2", false));

        FileUtils.writeToFile(students);

        List<Student> result = FileUtils.getStudentFromFile("student.txt");
      result.forEach(e -> System.out.println(e));


    }
}
