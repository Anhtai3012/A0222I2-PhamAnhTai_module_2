package _5_Acess_modifier_Static_medtod_Static_property.practice.p1;

public class Static_method {
    private int rollno;
    private String name;
    private static  String college="BBDIT";

   Static_method(int r,String n){
       rollno=r;
       name=n;
   }
   static void change(){
       college="codegym";
   }
   void display(){
       System.out.println(rollno+" " +name+" "+college);
   }
}
