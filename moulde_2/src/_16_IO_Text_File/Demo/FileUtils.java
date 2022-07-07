package _16_IO_Text_File.Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileUtils {
    public static final String DELIMITER = ",";
    public static void writeToFile(List<Student> list){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt"))){
            for (Student e:list) {
                bufferedWriter.write(e.toData(","));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> getStudentFromFile(String filename){
        List<Student> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = "";
            while (line  != null){
                line = bufferedReader.readLine();
                if (line == null||line.isEmpty()){
                    continue;
                }
                String [] result = line.split(DELIMITER);
                String name =result[0];
                int age = Integer.parseInt(result[1]);
                String className = result[2];
                boolean sex = Boolean.parseBoolean(result[3]);
                list.add(new Student(name, age, className, sex));
            }
        }catch (IOException e ){
            e.printStackTrace();
        }
        return list;
    }
}
