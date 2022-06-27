package _12_Java_collection_framework.exercise.e1;

import java.util.Collections;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ProductManager productManager = new ProductManager();
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
                    remove();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sort();
                   // sortID();
                    break;
                default:
                    break loop;

            }

        }
    }

    private static void sort() {
        productManager.sort();
    }
    public static void sortID(){
        productManager.sortID();
    }
    static void addNew() {
        System.out.println("enter name");
        String name = scanner.nextLine();
       // System.out.println("enter id");
       // int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter cost");
        double cost = Double.parseDouble(scanner.nextLine());
        Product product = new Product(name, cost);
        product.countID();
        productManager.add(product);
    }

    static void edit() {
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(productManager.search(id).toString());
        System.out.println("new name ");
        String newName = scanner.nextLine();
        System.out.println("new cost ");
        double cost = Double.parseDouble(scanner.nextLine());
        productManager.edit(id, newName, cost);
    }
    static void remove(){
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        productManager.remove(id);
    }
    static void search(){
        System.out.println("enter name");
        String name = scanner.nextLine();
        productManager.searchName(name);
    }
}
