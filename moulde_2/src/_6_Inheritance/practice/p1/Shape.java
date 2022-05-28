package _6_Inheritance.practice.p1;

public class Shape {
    private String colour = "green" ;
    private boolean filled=true;
    public Shape(){

    }
    public Shape(String colour,boolean filled){
        this.colour=colour;
        this.filled=filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "colour: "+colour+", Filled: "+(filled?"true":"false");
   }
}

