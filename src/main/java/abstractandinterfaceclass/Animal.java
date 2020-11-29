package abstractandinterfaceclass;

public abstract class Animal {

private int age;
private String gender;
private double weight;

    public Animal(int age, String gender, double weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void feature() {
        System.out.println("This is a abstractandinterfaceclass.Animal Abstract class");
    }

    abstract void move();
}
