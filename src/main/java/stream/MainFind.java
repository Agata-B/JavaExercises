package stream;

import java.util.List;
import java.util.Optional;

public class MainFind {
    public static void main(String[] args) {

        List<String>list = List.of( "Jan", "Katarzyna", "Maciej", "Jerzy", "Agnieszka", "Bolesław", "Anna", "Basia");

      /*  String name;
        for (String s : list) {
            if(s.substring(0,1).equalsIgnoreCase("a")) {
                name = s;
                break;
            }
        }
      */


        Optional<String> name = list.stream()
                .peek(a-> System.out.println(a))
                .filter(a-> a.substring(0, 1).equalsIgnoreCase("a"))
                .findFirst();

        name.ifPresent(a-> System.out.println("Znalezione " + a));

        Optional<String> name1 = list.stream()
                .peek(a-> System.out.println(a))
                .filter(a-> a.substring(0, 1).equalsIgnoreCase("a"))
                .findAny();

        name.ifPresent(a-> System.out.println("Znalezione " + a));
    }
}
