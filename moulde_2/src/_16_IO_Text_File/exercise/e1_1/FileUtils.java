package _16_IO_Text_File.exercise.e1_1;

import java.io.*;
import java.util.Scanner;

public class FileUtils {
    static String linkFile = "D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\exercise\\e1_1\\File1";
    static Scanner scanner = new Scanner(System.in);
    public static void write(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(linkFile));
            System.out.println("enter number");
            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <number ; i++) {
                String input = scanner.nextLine();
                bufferedWriter.write(input);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(){
        String linkfile1= "D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\exercise\\e1_1\\File2";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(linkFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(linkfile1));
            String line;
            while ((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line+"\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
