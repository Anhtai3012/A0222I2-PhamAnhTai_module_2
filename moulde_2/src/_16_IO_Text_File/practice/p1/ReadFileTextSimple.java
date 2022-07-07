package _16_IO_Text_File.practice.p1;

import javax.security.auth.login.FailedLoginException;
import java.io.*;

public class ReadFileTextSimple {
    public void reaFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException("error");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum =0 ;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            br.close();
            System.out.println("sum="+sum);
        }catch (Exception e){
            System.out.println("file khong ton tai ");
        }
    }
}
