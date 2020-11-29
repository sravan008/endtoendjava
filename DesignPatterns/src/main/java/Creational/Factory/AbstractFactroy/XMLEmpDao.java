package Creational.Factory.AbstractFactroy;

public class XMLEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Emp data in XML");
    }

}
