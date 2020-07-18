package szachy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Figura> figury = new ArrayList<>(32);

        Pion pion1 = new Pion(Kolor.BIAŁE, new Punkt('C', (byte) 2));
        Pion pion2 = new Pion(Kolor.CZARNE, new Punkt('D', (byte) 8));

        Hetman hetman1 = new Hetman(Kolor.BIAŁE, new Punkt('D', (byte) 4));
        Hetman hetman2 = new Hetman(Kolor.CZARNE, new Punkt('H', (byte) 4));

        figury.add(pion1);
        figury.add(pion2);
        figury.add(hetman1);
        figury.add(hetman2);

//polimorfizm dany obiekt wywoluje swoja metode

        Scanner scanner = new Scanner(System.in);
        Punkt punktDoPrzesuniecia;
        do {
            System.out.println("podaj dane punktu");
            String kolumna = scanner.next();
            byte wiersz = scanner.nextByte();
            punktDoPrzesuniecia = new Punkt(kolumna.charAt(0), wiersz);
        } while (pion1.czyJuzNaTymPunkcie(punktDoPrzesuniecia));

        try {
            pion1.przesun(punktDoPrzesuniecia);
        } catch (TenSamPunktException e) {
            System.out.println(e.getMessage());
        }

    /*    System.out.println("przesuwanie");
        for (Figura figura: figury) {
            figura.przesun(new Punkt('D', (byte) 5));
        }

      System.out.println("zbijanie");
        for (Figura figura: figury) {
            figura.zbij(new Punkt('D', (byte) 5));
        }*/
    }
}
