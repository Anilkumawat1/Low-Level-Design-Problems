package Creational.AbstractFactoryMethod;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Window button click");
    }
}
