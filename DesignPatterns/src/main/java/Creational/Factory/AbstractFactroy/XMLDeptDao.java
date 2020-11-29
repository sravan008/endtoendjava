package Creational.Factory.AbstractFactroy;

public class XMLDeptDao implements Dao {


    @Override
    public void save() {
        System.out.println("Saving Dept details in XML");
    }
}
