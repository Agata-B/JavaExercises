package hashcode;

import lombok.Getter;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Jan Kowalski", 25);
        Person person1 = new Person("Jan Kowalski", 25);
        Person person2 = new Person("Piotr Nowak", 25);

        System.out.println(person.equals(person1)); //equals wywolane z klasy nadrzednej Object; czy te dwa obiekty sa tym samym obiektem
        System.out.println(person.getName().equals(person1.getName()));
       // System.out.println(person.getAge().equals(person1.getAge()));
        //zeby byly rowne musimy sami wygenerowac metode equals


    }
}

@Getter
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

