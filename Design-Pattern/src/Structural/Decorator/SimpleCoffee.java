package Structural.Decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
