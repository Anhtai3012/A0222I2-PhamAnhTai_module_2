package SmartPhone;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static  ManagerPhone managerPhone = new ManagerPhone();
    public static void main(String[] args)  {
    loop:
            while (true) {
        System.out.println("1.add new Genuine \n2.Display \n3.Delete\n4.Search Name \n5.Sort \n6.WriteFile\n7.readFile\n8.exit");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                System.out.println("1.Genuine\n 2.Portable");
                int input = Integer.parseInt(scanner.nextLine());
                if (input == 1) addGenuine();
                else if(input==2) addPortable();
                else System.out.println("error");
                break;
            case 2:
                display();
                break;
            case 3:
                delete();
                break;
            case 4:
                SearchName();
                break;
            case 5:
                sort();
                break ;
            case 6:
                break ;
            case 7:
                break ;
            default:
                break loop;

        }
    }
}
public static void addGenuine(){
    System.out.println("enter Name");
    String name = scanner.nextLine();
    System.out.println("enter Price");
    double price  = Double.parseDouble(scanner.nextLine());
    System.out.println("enter Brand");
    String brand = scanner.nextLine();
    System.out.println("enter idInsurance");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("enter timeInsurance");
    int time = Integer.parseInt(scanner.nextLine());
    managerPhone.addGenuine( new Genuine(name,price,brand,id,time));
}

    public static void addPortable(){
        System.out.println("enter Name");
        String name = scanner.nextLine();
        System.out.println("enter Price");
        double price  = Double.parseDouble(scanner.nextLine());
        System.out.println("enter Brand");
        String brand = scanner.nextLine();
        System.out.println("enter Country");
        String country = scanner.nextLine();
        System.out.println("Status");
        boolean status = false ;
        int input;
        do {
            System.out.println("1.true \n 2.false");
            input = Integer.parseInt(scanner.nextLine());
            if (input==1){ status =true;
            break;}
            else if (input == 2){ status=false;
            break;}
        }while (true);
        managerPhone.addPortable(new Portable(name,price,brand,country,status));
    }

    public static void display(){
        managerPhone.display();
    }

    public  static void delete()  {
        System.out.println("enter id");
        boolean isDeleted;
        do {
            int id = Integer.parseInt(scanner.nextLine());
           isDeleted =  managerPhone.delete(id);
           try{
               if (!isDeleted){
                   throw new NotFoundException("Not found id");
               }
           }catch (NotFoundException e) {
               System.out.println(e.getMessage());
           }
        }while (!isDeleted);
    }

    public static void SearchName(){
        System.out.println("enter Name");
        String Name = scanner.nextLine();
        managerPhone.Search(Name);
    }

    public static void sort(){
        managerPhone.Sort();
    }

    public static void writeFile(){

    }
    
    public static void readFile(){

    }

}

