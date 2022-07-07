package _19_String_and_Regex.exercise.e2;

public class PhoneNumber {
    private static final String phoneNumber ="\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)";
    public PhoneNumber(){}
   public Boolean validate(String regex){
        return regex.matches(phoneNumber);
   }
}
