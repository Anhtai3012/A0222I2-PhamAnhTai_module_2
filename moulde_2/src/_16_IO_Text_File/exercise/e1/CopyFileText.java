package _16_IO_Text_File.exercise.e1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
//    static String file_name = "D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\exercise\\e1\\temp";​
//    static String file_name1 = "D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\exercise\\e1\\temp1";
    public static List<String> readFile(String filePath) {
        List<String> listFile = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listFile.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(listFile);
        return listFile;
    }
    public static void writeFile(String filePath, List<String> listFile) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (String str : listFile) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
