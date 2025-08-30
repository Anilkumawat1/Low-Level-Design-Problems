package Creational.Sigleton;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String []args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.equals(singleton2));
    }
}
// https://blog.algomaster.io/p/singleton-design-pattern
//volatile: Ensures visibility of changes to variables across threads but does not guarantee atomicity.
//synchronized: Ensures mutual exclusion (only one thread can execute a block/method at a time) and visibility.

