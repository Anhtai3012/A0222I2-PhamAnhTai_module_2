package _16_IO_Text_File.exercise.e1;

import java.util.List;

import static _16_IO_Text_File.exercise.e1.CopyFileText.readFile;
import static _16_IO_Text_File.exercise.e1.CopyFileText.writeFile;

public class Main {
        public static void main(String[] args) {
            List<String> temp = readFile("D:\\\\CODEGYM\\\\A0222I2-PhamAnhTai_module_2\\\\moulde_2\\\\src\\\\_16_IO_Text_File\\\\exercise\\\\e1\\\\temp");
            System.out.println();
            writeFile("D:\\\\CODEGYM\\\\A0222I2-PhamAnhTai_module_2\\\\moulde_2\\\\src\\\\_16_IO_Text_File\\\\exercise\\\\e1\\\\temp1",temp);
        }
    }

