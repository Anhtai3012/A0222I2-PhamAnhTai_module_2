package _12_Java_collection_framework.exercise.e1;

public class Product {
    private int id;
    private String Name;
    private double cost;

    public Product(){
    }
    public Product(int id,String Name, double cost){
        this.id=id;
        this.Name=Name;
        this.cost= cost;
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
        Name = name;
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
