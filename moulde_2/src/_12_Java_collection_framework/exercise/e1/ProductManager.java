package _12_Java_collection_framework.exercise.e1;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    public List<Product> products;
    public ProductManager(){
        products = new ArrayList<>();
      //  products = new LinkedList<>();
    }
 public void add(Product e){
     products.add(e);
  }
  public Product search(int id){
      for (Product element: products) {
          if(element.getId()==id){
              return element;
          }
      }
      return null;
  }
    public void searchName(String name){
        for (Product element:products) {
            if (element.getName().equals(name)){
                System.out.println(element);
            }
        }
    }

  public void edit(int id, String name, double cost){
        search(id).setName(name);
        search(id).setCost(cost);
  }
  public void remove(int id){
//        Product del = search(id);
//        boolean b=  products.remove(del);
//      System.out.println(b);
      products.remove(search(id));
  }
    public void sortID(){
       this.products.sort(new Comparator<Product>() {
           @Override
           public int compare(Product o1, Product o2) {
               return o1.getId() - o2.getId();
           }
       });
    }
  public void sort(){
      products.sort(new ProductComparator());
  }

  public void display(){
        //products.forEach(x -> System.out.println(x));
      for (Product element: products) {
          System.out.println(element);
      }
  }
    public void displaySearch(int id){
        for (Product element: products) {
            if (id==element.getId()){
                System.out.println(element);
            }
        }
}
}
