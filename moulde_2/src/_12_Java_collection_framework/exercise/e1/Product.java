package _12_Java_collection_framework.exercise.e1;

import java.util.List;

public class Product  {
    private int id;
    private String Name;
    private double cost;

    public Product(){
    }
    public Product(String Name, double cost){
        this.Name=Name;
        this.cost= cost;
    }
    public void countID(){
        this.id = (int) (Math.random()*100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", cost=" + cost +
                '}';
    }

}
