package abstractandinterfaceclass;


/*
Abstract means that something is not fully concrete
Interfaces are meant to provide only behaviors
Abstract classes cannot be used to instantiate objects, because abstract classes are incomplete Runtime you can decide which class you pass
An abstract class allows you to create functionality that subclasses can implement or override.
An interface only allows you to define functionality, not implement it. And whereas a class can extend only one abstract class
it can take advantage of multiple interfaces.

Interfaces are used to achieve abstraction.
Designed to support dynamic method resolution at run time
It helps you to achieve loose coupling.
Allows you to separate the definition of a method from the inheritance hierarchy



*/

public class AbstractClassDemo {

    public static void moveAnimal(Animal animal) {
        animal.move();
    }


    public static void main(String[] args) {
        Animal sparrow = new Sparrow(20, "Bird", 12.3);
        Animal lion = new Lion(12, "Animal", 123.0);
        moveAnimal(sparrow);
        moveAnimal(lion);


    }
}
