package szachy;

import java.util.Objects;

public class Punkt {

    private char kolunma;   //do okreslenia najlepszy enum zeby klient od reazu wiedzial jakie wartosci sa poprawne
    private byte wiersz;

    public Punkt(char kolunma, byte wiersz) {
        this.kolunma = kolunma;
        this.wiersz = wiersz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punkt punkt = (Punkt) o;
        return kolunma == punkt.kolunma &&
                wiersz == punkt.wiersz;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolunma, wiersz);
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "kolunma=" + kolunma +
                ", wiersz=" + wiersz +
                '}';
    }
}
