package school;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        OneClass class1 = prepareClass1();
        OneClass class2 = prepareClass2();

        System.out.println("Sale");

        for (OneClass oneClass : Arrays.asList(class1, class2)) {
            System.out.println("Klasa " + oneClass.getClassesNumber() + ", posiada liczbę miejsc " + oneClass.getSeatsNumber());
        }
        System.out.println("Wyposażenie");
      /*  List<EquipmentElements> equipmentElements = new ArrayList<>(oneClass.getEquipment());
        Collections.sort(equipmentElements);

        for (EquipmentElements equipment : equipmentElements) {
            System.out.println(equipment);
        }*/
    }

    public static OneClass prepareClass1() {
        OneClass oneClass1 = new OneClass("2", 10);
        oneClass1.addChair(
                new Chair(001, "krzesło 1"),
                new Chair(002, "krzesło 2"),
                new Chair(003, "krzesło 3"),
                new Chair(004, "krzesło 4"));
        oneClass1.addTable(
                new Table(001, "stól 1"),
                new Table(002, "stół 2"));
        oneClass1.addBoard(new Board(000, "tablica 1"));
        return oneClass1;
    }

    public static OneClass prepareClass2() {
        OneClass oneClass2 = new OneClass("2", 10);
        oneClass2.addChair(
                new Chair(001, "krzesło 1"),
                new Chair(002, "krzesło 2"));
        oneClass2.addTable(
                new Table(001, "stól 1"),
                new Table(002, "stół 2"));
        return oneClass2;
    }
}
