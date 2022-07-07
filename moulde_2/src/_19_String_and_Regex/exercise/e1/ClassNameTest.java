package _19_String_and_Regex.exercise.e1;

import java.util.Scanner;

public class ClassNameTest {
    private static String [] validate = new String[]{"C0318G","M0318G","P0323A"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassName className = new ClassName();
        for (String element:validate) {
            boolean isvalidate = className.validate(element);
            System.out.println("ClassName: "+element+" isClassName: "+isvalidate);
        }
}
}
