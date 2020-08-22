package collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainEx5 {


    public static void main(String[] args) {
        List<String> colours = List.of("niebieski", "żółty", "czerwony", "żółty", "zielony", "niebieski", "różowy");
        System.out.println("base list: " + colours);
        System.out.println("removed duplicates: " + removeDuplicates(colours));


    }

    public static List<String> removeDuplicates(List<String> strings) {
        Set<String> result = new TreeSet<>();
        for (String string : strings) {
            result.add(string);
        }
        return new ArrayList<>(result);
    }
}
