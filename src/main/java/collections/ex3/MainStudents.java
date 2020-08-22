package collections.ex3;

import java.util.HashMap;
import java.util.Map;


public class MainStudents {
    public static void main(String[] args) {

        Map<Long, String> mapStudents = new HashMap<>();

        mapStudents.put(5678L, "Kamil");
        mapStudents.put(9012L, "Jan");
        mapStudents.put(3456L, "Karolina");
        mapStudents.put(7890L, "Jan");
        mapStudents.put(1237L, "Agnieszka");
        mapStudents.put(5678L, "Adam");
        mapStudents.put(1234L, "Alicja");
        mapStudents.put(1357L, "Jan");



        System.out.print("Imiona na A : ");
        for (Map.Entry<Long, String> nameA : mapStudents.entrySet()) {
            if (nameA.getValue().startsWith("A")) {
                System.out.println(nameA.getValue()+" ");
                //key cannot be repeated, when Agnieszka and Alicja had the same 1234 one name was printed out
            }
        }


        System.out.print("Numery indeksu dla imienia Jan: ");
        for (Map.Entry<Long, String> nameJanKey : mapStudents.entrySet()) {
            if (nameJanKey.getValue().contains("Jan")) {
                System.out.println(nameJanKey.getKey());
            }
        }

    }
}