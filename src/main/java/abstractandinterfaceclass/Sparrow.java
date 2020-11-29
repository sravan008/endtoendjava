package abstractandinterfaceclass;

public class Sparrow  extends Animal{

    public Sparrow(int age, String gender, double weight) {
        super(age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("This Flies ");
    }
}
