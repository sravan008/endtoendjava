package Creational.Factory;


/*

Factory pattern Hide the object creation Process

Example : Driver is a interface ans diff implementations are mysql and oracle and SQL Server
Connection connection = DriverManger.getConnection(String conString)

PizzaStore - > PizzaFactory --> Pizza (prepare, bake, cut) --> VegPizaa, CheesePizza, MeatPizza


 */


public class FactoryPattern {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("chicken");
        pizzaStore.orderPizza("veg");

    }


}
