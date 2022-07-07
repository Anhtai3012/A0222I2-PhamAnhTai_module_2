package _12_Java_collection_framework.exercise.e2;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ProductManager productManager = new ProductManager();
    static Product product = new Product();
    public static void main(String[] args) {
        loop:
        while (true) {
            System.out.println("1.add new \n2.Edit ID \n3.Delete ID\n4.Display\n5.Search Name \n6.Sort \n7.exit");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    addNew();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    searchName();
                    break;
                case 6:
                    break;
                default:
                    break loop;

            }

        }
    }
    private static void addNew(){
        System.out.println("enter Name");
        String name = scanner.nextLine();
        System.out.println("enter Price");
        double price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name,price);
        productManager.add(product);
    }
    private static void edit(){
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        if (productManager.search(id)!=null){
            System.out.println("enter Name");
            String name = scanner.nextLine();
            System.out.println("enter Price");
            double price = Double.parseDouble(scanner.nextLine());
            productManager.edit(id,name,price);
        }
    }
    private static void delete(){
        System.out.println("enter id");
        int id = scanner.nextInt();
        if (productManager.search(id)!=null){
            productManager.delete(id);
        }
    }
    private static void display(){
        productManager.display();
    }
    private static void  searchName(){
        System.out.println("enter Name");
        String name = scanner.nextLine();
        productManager.searchByName(name);
    }
}
