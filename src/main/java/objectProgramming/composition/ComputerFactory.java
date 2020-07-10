package objectProgramming.composition;

import lombok.Getter;

@Getter
public class ComputerFactory {

    public Computer createComputer() {
        return new Computer(new Processor("intel core"),
                new GraphicCard("GeForce"),
                new PowerSuply("battery"));
    }
}