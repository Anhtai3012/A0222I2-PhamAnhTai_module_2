package _16_IO_Text_File.Demo;

import java.io.IOException;

public class JavaIO {
    public static void main(String[] args) throws IOException {
        System.err.println("error");
        int i = System.in.read();
        System.out.println(i);
        System.out.println((char)i);
    }
}
