package _7_Abstract_Class_and_Interface.exercise.e1;

public class Square extends Rectangle implements Resizeable {
    public Square(){
        super(1,1);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side= "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

  @Override
    public void resize(double percent) {
        setSide(getSide()*(percent/100));
    }
}
