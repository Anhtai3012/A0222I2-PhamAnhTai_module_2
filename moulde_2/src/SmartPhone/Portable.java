package SmartPhone;

public class Portable extends Phone {
    private String Country;
    private boolean Status;

    public Portable(String name, double price, String brand, String country, boolean status) {
        super(name, price, brand);
        Country = country;
        Status = status;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Portable{" +
                "Country='" + Country + '\'' +
                ", Status=" + Status + super.toString()+
                '}';
    }
}
