package objectProgramming.inheritance;

public class Dog extends Animal{

    private String color;

    public Dog(String name, int age, String race, String color) {
        super(name, age, race);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Hauhau");
    }

    @Override
    public String toString() {
        return getName() + " " + getRace() + " " + getAge() + " " + getColor();
    }
}
