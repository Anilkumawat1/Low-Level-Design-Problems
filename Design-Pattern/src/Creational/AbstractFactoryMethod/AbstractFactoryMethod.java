package Creational.AbstractFactoryMethod;

public class AbstractFactoryMethod {
    private Button button;
    private CheckBox checkBox;
    public AbstractFactoryMethod(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }
    public void renderUI(){
        button.click();
        checkBox.check();
    }
    public static void main(String args[]){
        String os = "windows";
        AbstractFactoryMethod abstractFactoryMethod;
        if(os.equals("mac")){
            abstractFactoryMethod = new AbstractFactoryMethod(new MacFactory());
        }else{
            abstractFactoryMethod = new AbstractFactoryMethod(new WindowsFactory());
        }
        abstractFactoryMethod.renderUI();
    }
}
//https://blog.algomaster.io/p/1def92f0-b234-416f-a25b-10bf81842883
