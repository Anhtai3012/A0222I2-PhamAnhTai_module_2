package _19_String_and_Regex.practice.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGULER = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public  EmailExample(){
        pattern = Pattern.compile(EMAIL_REGULER);
    }
    public boolean validate(String regex){
        this.matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
