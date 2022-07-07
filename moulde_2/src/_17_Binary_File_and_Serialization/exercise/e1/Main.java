package _17_Binary_File_and_Serialization.exercise.e1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();
    private static final String path = "moulde_2\\src\\_17_Binary_File_and_Serialization\\exercise\\e1\\product.tai";

    public static void main(String[] args) {
        products = readObjectFile(path);

        while (true) {
            System.out.println("1.Add New\n2.Display\n3.Search\n4.Copy and display\n5.Quit");
            int option = Integer.parseInt(scanner.nextLine());
//        loop:

            switch (option) {
                case 1:
                    AddNew();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:

                    break;
                default:
                    System.exit(0);
            }
        }
    }


    public static void AddNew() {
        System.out.println("input id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input manufacture");
        String manufacture = scanner.nextLine();
        System.out.println("input price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("input other");
        String other = scanner.nextLine();
        products.add(new Product(id, name, manufacture, price, other));
        writeObjectFile(products, path);
    }


    private static List<Product> readObjectFile(String path){
        try {
            ObjectInputStream inputStream = new ObjectInputStream((new FileInputStream(path)));
            return  (List<Product>) inputStream.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static void writeObjectFile(List<Product> students, String fileName) {
        try {
            if (!Files.exists(Paths.get(fileName))) {
                Files.createFile(Paths.get(fileName));
            }


            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void search() {
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("not found ");
    }
    public static void displayCopy(){

    }

}
