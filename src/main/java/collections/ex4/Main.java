package collections.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Student, List> school = new HashMap<>();

        Student student1 = new Student("Olek", "Koś", MainLanguage.PL);
        List<Integer> average1 = new ArrayList<>();
        average1.add(3);
        average1.add(4);
        average1.add(4);

        Student student2 = new Student("Anna", "Moskwa", MainLanguage.ENG);
        List<Integer> average2 = new ArrayList<>();
        average2.add(5);
        average2.add(4);
        average2.add(4);

        Student student3 = new Student("Kamil", "Białek", MainLanguage.PL);
        List<Integer> average3 = new ArrayList<>();
        average3.add(3);
        average3.add(3);
        average3.add(2);

        school.put(student1, average1);
        school.put(student2, average2);
        school.put(student3, average3);

        System.out.println(school);
    }
}
