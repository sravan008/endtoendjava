package Creational;/*
Notes :
https://dzone.com/articles/another-singleton-implementation

Two ways we can initialise the Creational.Singleton
 - Eager initialise and Lazy initialise
 - To get rid of Serialization Problem, you will have to use the readResolve method and return the same instance
 - To overcome the cloning feature
   override the "clone method" and throw CloneNotSupportedException

Protected Object readResolve(){ return instance}

NOTE : Initialization-on-demand holder idiom - is the better way of handling the Creational.Singleton

 */


public class Singleton {

    private static Singleton instance;

    // Type-1 Eager initialisation
    //private static Creational.Singleton instance = new Creational.Singleton();

    // Type-2 Eager initialisation
    //private static Creational.Singleton instance ;
    static {
        instance = new Singleton();
    }

    // Usage of the private constructor
    // private constructor you prevent class instances from being created in any place other than this very class
    private Singleton() {
    }

    // This is Lazy initialization
    public static Singleton getSingletonInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /*

    Lazy initialisation

    public class Employee{

    private Creational.Singleton(){}

    private static class Creational.Singleton{

    private static final Employee employeeInstance = new Employee();

    public static Employee getEmployeeInstance(){}
    {
        return Creational.Singleton.employeeInstance
    }

    }



    }



     */


}