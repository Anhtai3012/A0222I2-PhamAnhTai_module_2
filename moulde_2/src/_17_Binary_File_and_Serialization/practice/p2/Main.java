package _17_Binary_File_and_Serialization.practice.p2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import static _17_Binary_File_and_Serialization.practice.p2.Read_and_Write_Binary.writeToFile;

public class Main {
    public static void main(String[] args) {
        List<Read_and_Write_Binary.Student> students = new ArrayList<>();
        students.add(new Read_and_Write_Binary.Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Read_and_Write_Binary.Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Read_and_Write_Binary.Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Read_and_Write_Binary.Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Read_and_Write_Binary.Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("student.txt", students);
        List<Read_and_Write_Binary.Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Read_and_Write_Binary.Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    private static List<Read_and_Write_Binary.Student> readDataFromFile(String path) {
        List<Read_and_Write_Binary.Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Read_and_Write_Binary.Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}

