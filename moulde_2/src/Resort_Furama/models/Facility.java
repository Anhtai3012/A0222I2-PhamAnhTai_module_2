package Resort_Furama.models;

public abstract class Facility {
    private String Name;
    private int number;
    private double price;

    public Facility(String name, int number, double price) {
    }

    protected Facility() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void rent(int date){}

    @Override
    public String toString() {
        return "Facility{" +
                "Name='" + Name + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
