package Creational.Factory.AbstractFactroy;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daoAbstractFactory = null;
        if (factoryType.equalsIgnoreCase("xml")) {
            daoAbstractFactory = new XMLDaoFactory();
        } else if (factoryType.equalsIgnoreCase("db")) {
            daoAbstractFactory = new DBDaoFactory();
        }
        return daoAbstractFactory;
    }
}