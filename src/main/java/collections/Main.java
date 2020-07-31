package collections;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerTab = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            integerTab.add(RandomUtils.nextInt(0, 10));
        }
        System.out.println("Lista z 20 losowymi liczbami z zakresu <0,10> : " + integerTab);


        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer ints : integerTab) {
            if (ints != 0 && ints % 2 != 0) oddNumbers.add(ints);
        }
        System.out.println("Z liczty 20 losowych liczb usunięto liczby parzyste: " + oddNumbers);
    }

}


