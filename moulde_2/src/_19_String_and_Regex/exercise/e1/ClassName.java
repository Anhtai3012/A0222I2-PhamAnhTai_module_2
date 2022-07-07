package _19_String_and_Regex.exercise.e1;

import java.util.regex.Pattern;

public class ClassName {
    private static final String patternName= "[CAP][0-9]{4}[GHIKLM]";
    public ClassName(){
    }
    public boolean validate(String regex){
        return regex.matches(patternName);
    }
}
