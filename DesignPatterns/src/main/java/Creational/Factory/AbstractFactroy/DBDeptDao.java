package Creational.Factory.AbstractFactroy;

public class DBDeptDao implements Dao {


    @Override
    public void save() {
        System.out.println("Saving Dept details in DB");
    }
}
