package _15_Debug.Demo;

import org.omg.CORBA.MARSHAL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    public static void main(String[] args) {
     //   write(D:\CODEGYM\A0222I2-PhamAnhTai_module_2\moulde_2\src\_15_Debug\Demo\FileWriter,);
    }
    public static void write(String filename,String s)  {
        try {
            File file = new File(filename); // open file
            PrintWriter out =null;
            out = new PrintWriter(file);
            out.println(s);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
