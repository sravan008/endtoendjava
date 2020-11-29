package Creational.Factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("veg")) {
            pizza = new VegPizza();
        } else if (type.equals("chicken")) {
            pizza = new NonVegPizza();
        }
        return pizza;
    }
}
