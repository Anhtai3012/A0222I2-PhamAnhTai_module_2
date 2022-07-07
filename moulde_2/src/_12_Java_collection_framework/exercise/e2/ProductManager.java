package _12_Java_collection_framework.exercise.e2;

import java.util.LinkedList;

public class ProductManager {
    LinkedList<Product> linkedList ;
    public ProductManager(){
        linkedList = new LinkedList<>();
    }
    public void add(Product element){
        linkedList.add(element);

    }
    public Product search(int id){
        for (Product e:linkedList) {
            if (e.getId()==id) return e;
        }
        return null;
    }
    public void edit(int id,String name,double price){
        search(id).setName(name);
        search(id).setPrice(price);
    }

    public void delete(int id){
        linkedList.remove(id);
    }
    public void searchByName(String name){
        for (Product e:linkedList) {
            if (e.getName().equals(name)){
                System.out.println(e);
            }
        }
    }

    public void display(){
       for (Product e: linkedList ) System.out.println(e);
   }
}
