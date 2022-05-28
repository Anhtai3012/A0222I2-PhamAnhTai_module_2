package _5_Acess_modifier_Static_medtod_Static_property.practice.p2;

public class test {
    public static void main(String[] args) {
        Car car1= new Car("mazda3","skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("macda6","skyactic 6");
        System.out.println(Car.numberOfCar);
    }
}
