package Creational.Factory;

public class NonVegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Non-Veg Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Non-Veg Pizza");
    }
}
