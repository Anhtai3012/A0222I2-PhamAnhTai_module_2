package _16_IO_Text_File.Demo;

import java.io.*;

public class ReadandWrite {
    public static void main(String[] args) {
        // write File
        try {
            FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\Demo\\Hello.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           // fileWriter.write("Pham Anh Tai");
            bufferedWriter.write("Johny Depp");
            bufferedWriter.newLine();
            bufferedWriter.write("01,nguyen doa,pham anh tai");
           // fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Read File
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\CODEGYM\\A0222I2-PhamAnhTai_module_2\\moulde_2\\src\\_16_IO_Text_File\\Demo\\Hello.txt"));
            String line= null;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // doc kieu String khi co dau","

    }
}

