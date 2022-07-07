package SmartPhone;

public abstract class Phone {
    static  int autoincrement =0;
    private int id=0;
    private String Name;
    private double Price;
    private String Brand;

    public Phone( String name,double price, String brand) {
        this.id= autoincrement++;
        Name = name;
        Price = price;
        Brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
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

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return
                ", id=" + id +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Brand='" + Brand + '\'' +
                '}';
    }
}
