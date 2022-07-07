package SmartPhone;

public class Genuine extends Phone {
    private int idInsurance;
    private int timeInsurance;

    public Genuine(String name, double price, String brand, int idInsurance, int timeInsurance) {
        super(name, price, brand);
        this.idInsurance = idInsurance;
        this.timeInsurance = timeInsurance;
    }

    public int getIdInsurance() {
        return idInsurance;
    }

    public void setIdInsurance(int idInsurance) {
        this.idInsurance = idInsurance;
    }

    public int getTimeInsurance() {
        return timeInsurance;
    }

    public void setTimeInsurance(int timeInsurance) {
        this.timeInsurance = timeInsurance;
    }

    @Override
    public String toString() {
        return "Genuine{" +
                "idInsurance=" + idInsurance +
                ", timeInsurance=" + timeInsurance +super.toString()+
                '}';
    }
}
