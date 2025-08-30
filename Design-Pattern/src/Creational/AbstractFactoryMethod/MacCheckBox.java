package Creational.AbstractFactoryMethod;

public class MacCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Mac checkbox clicked");
    }
}
