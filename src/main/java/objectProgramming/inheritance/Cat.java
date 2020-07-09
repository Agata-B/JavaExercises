package objectProgramming.inheritance;

public class Cat extends Animal {
    public Cat(String name, int age, String race) {
        super(name, age, race);
    }

    @Override
    public void voice() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return getName() + " " + getRace() + " " + getAge();
    }
}
