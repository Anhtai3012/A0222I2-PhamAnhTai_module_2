package _12_Java_collection_framework.exercise.e1;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public List<Product> products;
    public ProductManager(){
        products = new ArrayList<>();
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

  public void edit(int id, String name, double cost){
        search(id).setName(name);
        search(id).setCost(cost);
  }
  public void remove(int id){
        products.remove(search(id));
  }
  public void display(){//products.forEach(x -> System.out.println(x));
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
