package Creational.Factory.AbstractFactroy;

public class DBEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Emp data in DB");
    }

}
