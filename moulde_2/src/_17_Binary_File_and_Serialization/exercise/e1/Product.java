package _17_Binary_File_and_Serialization.exercise.e1;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String NameProduct;
    private String manufacturer;
    private double price;
    private String other;

    public Product(int id, String nameProduct, String manufacturer, double price, String other) {
        this.id = id;
        NameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", NameProduct='" + NameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
