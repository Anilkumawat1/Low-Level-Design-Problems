package Creational.Prototype;

public class Prototype {
    public static void main(String args[]) {
        EnemyRegistry registry = new EnemyRegistry();
        registry.register("flying",new Enemy("robot",100,13.5, true,"hammer"));
        registry.register("Army",new Enemy("robot",105,130.5, true,"gun"));

        Enemy e1 = registry.get("flying");
        Enemy e2 = registry.get("Army");
        e2.setHealth(90);

        e1.printStats();
        e2.printStats();
    }
}
