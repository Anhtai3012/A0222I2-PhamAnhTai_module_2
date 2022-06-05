package _7_Abstract_Class_and_Interface.practice.p1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger rooarr";
    }
    public String howToEat(){
        return "could be fried";
    }
}
