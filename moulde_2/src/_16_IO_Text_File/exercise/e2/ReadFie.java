package _16_IO_Text_File.exercise.e2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFie {
    public static List<Nation> readFile(String filePath) {
        List<Nation> listFile = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                listFile.add(new Nation(temp[0],temp[1],temp[2]));
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listFile;
    }
    public static void main(String[] args) {
        List<Nation> temp = readFile("D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\exercise\\e2\\FileCsv");
        for (Nation nation:temp){
            System.out.println(nation);
        }
    }
}
