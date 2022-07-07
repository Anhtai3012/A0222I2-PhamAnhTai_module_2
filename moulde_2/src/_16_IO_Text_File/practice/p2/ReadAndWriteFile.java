package _16_IO_Text_File.practice.p2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) throw new FileNotFoundException();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while (line != null){
                line  = bufferedReader.readLine();
                if (line == null || line.isEmpty()) continue;
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("  not found file  ");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

}
