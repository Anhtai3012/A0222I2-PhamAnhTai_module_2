package Resort_Furama.Controllers;

import java.util.Scanner;

public class Furama_Controller {
     public  static int enter;
    public static void main(String[] args) {
        do {
            System.out.println("1.Employee Management\n"+"2.Customer Management\n"+"3.Facility Management\n"+"4.Booking Management\n"+"5.Promotion Management\n"+"7.Exit");
            Scanner input = new Scanner(System.in);
            enter = input.nextInt();
            switch (enter){
                case 1:
                    do {
                        System.out.println("1.Display lis employees\n"+"2.Add new employees\n"+"3.Edit employee\n"+"4.Return main menu");
                        enter = input.nextInt();
                    }while (enter<4);
                    break;
                case 2:
                    do {
                        System.out.println("1.Display list customers\n"+"2.Add new customer\n"+"3.Edit customer\n"+"4.Return main menu");
                        enter = input.nextInt();
                    }while (enter<4);
                    break;
                case 3:
                    do {
                        System.out.println("1.Display list Facility\n"+"2.Add new Facility\n"+"3.Display list facility maintenance\n"+"4.Return main menu");
                        enter = input.nextInt();
                    }while (enter<4);
                    break;
                case 4:
                    do {
                        System.out.println("1.Add new booking\n"+"2.Display list booking\n"+"3.Create new contracts\n"+"4.Display list Contract"+"5.Edit Contracts"+"6.Return main menu");
                        enter = input.nextInt();
                    }while (enter<6);
                    break;
                case 5:
                    do {
                        System.out.println("1.Display list customers use service\n"+"2.Display list costumers fet voucher\n"+"3.Return menu");
                        enter = input.nextInt();
                    }while (enter<3);
                    break;
                case 6:
                    System.out.println("Exit");
                    enter = 7;
                    break;
            }
        }while (enter<6);
    }
}
