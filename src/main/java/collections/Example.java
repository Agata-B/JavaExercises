package collections;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<String> nameNumber = new ArrayList<>();
        nameNumber.add("jeden");
        nameNumber.add("dwa");

        System.out.println(nameNumber.get(1));

        int sizeListNameNumber = nameNumber.size();
        System.out.println(sizeListNameNumber);

        for (String name:nameNumber) {
            System.out.print(name + " ");
        }
    }
}
