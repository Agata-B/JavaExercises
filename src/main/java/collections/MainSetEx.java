package collections;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSetEx {

    public static void main(String[] args) {

        String name;
        Set<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj imię, jesli będziesz chciał zakończyć wprowadzanie wpisz - .");
            name = scanner.next();
            if (!name.equals("-")) names.add(name);
        } while (!name.equals("-"));             //close loops

        System.out.println("Liczba dodanych unikalnych imion " + names.size());
    }
}