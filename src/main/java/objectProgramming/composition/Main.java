package objectProgramming.composition;

public class Main {
    public static void main(String[] args) {

        Computer computer = new ComputerFactory().createComputer();
        System.out.println(computer.description());
    }
}
