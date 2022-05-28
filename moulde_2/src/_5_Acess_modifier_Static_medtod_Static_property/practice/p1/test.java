package _5_Acess_modifier_Static_medtod_Static_property.practice.p1;

public class test {
    public static void main(String[] args) {
        Static_method.change();
        Static_method student1= new Static_method(111,"tai");
        Static_method student2= new Static_method(222,"anh");
        Static_method student3= new Static_method(444,"pham");
        student1.display();
        student2.display();
        student3.display();
    }
}
