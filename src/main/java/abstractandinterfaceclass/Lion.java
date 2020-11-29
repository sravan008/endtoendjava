package abstractandinterfaceclass;

public class Lion extends Animal {


    public Lion(int age, String gender, double weight) {
        super(age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("This Animal only walks");
    }
}
