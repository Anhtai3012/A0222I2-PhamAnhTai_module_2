package _19_String_and_Regex.exercise.e2;

public class PhoneNumberTest {
    private static String[] invalid = new String[]{"(84)-(0978489648)","(a8)-(22222222)"};
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String element:invalid) {
            boolean isvalid = phoneNumber.validate(element);
            System.out.println("PhoneNumbe: "+element+" isPhoneNumber: "+isvalid);
        }
    }
}
