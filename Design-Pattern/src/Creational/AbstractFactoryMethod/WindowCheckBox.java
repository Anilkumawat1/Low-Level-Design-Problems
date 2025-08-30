package Creational.AbstractFactoryMethod;

public class WindowCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Windows checkbox clicked");
    }
}
