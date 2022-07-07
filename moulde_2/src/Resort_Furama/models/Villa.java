package Resort_Furama.models;

public class Villa extends Facility{
    public Villa(String name, int number, double price) {
        super(name, number, price);
    }

    protected Villa() {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    public void setNumber(int number) {
        super.setNumber(number);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public void rent(int date) {
        super.rent(date);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
