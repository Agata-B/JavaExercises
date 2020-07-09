package objectProgramming.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {

    private String name;
    private int age;
    private String race;

    public Animal(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }


    public void voice(){
        System.out.println("....");
    }
}
