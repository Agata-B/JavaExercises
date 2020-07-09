package objectProgramming.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Burek", 4, "pers");
        cat.voice();

        Dog dog = new Dog("Azor", 5, "golden retrivier", "sand");
        dog.voice();

        Animal[] animals = new Animal[2];
        animals[0] = cat;
        animals[1] = dog;
        for (Animal manyAnimals : animals
        ) {
            System.out.println(manyAnimals);
            manyAnimals.voice();
        }
    }
}
