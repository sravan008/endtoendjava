package Creational.Factory.AbstractFactroy;


/*

It abstracts the creation of Factory pattern
Factories of factory
Example is

Dao
    --> XmlEmpDao
    --> XMLDeptDao
    --> DBEmpDao
    --> DBDeptDao
XMLDaoFactory --> DaoAbstractfactory   --> DaoProdcuer
DBDaoFactory  --> DaoAbstractfactory   --> DaoProdcuer

 */

public class AbstractFactory {

    public static void main(String[] args) {

        DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce("db");
        Dao dao = daoAbstractFactory.createDao("emp");
        dao.save();
    }


}
