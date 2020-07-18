package szachy;

abstract class Figura implements Porusza {

    private final String nazwa;                     //atrybuty ktor sie nie zmieniaja zostaja private, tylko te co sie zmieniaja protected
    private final Kolor kolor;
    protected Punkt punktNaSzachownicy;            //kompozycja klasa zostaje obiektem


    protected Figura(String nazwa, Kolor kolor, Punkt punktNaSzachownicy) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.punktNaSzachownicy = punktNaSzachownicy;
    }

    @Override
    //metoda powtarzala sie w klasach ktore dziedzicza wiec zostala przeniesiona do klasy nadrzednej
    public void zbij(Punkt punkt) throws TenSamPunktException {
        przesun(punkt);
        System.out.println("Zbijam figure na " + punkt);
    }

    @Override
    public String toString() {
        return "nazwa='" + nazwa + '\'' +
                ", kolor=" + kolor +
                ", punktNaSzachownicy=" + punktNaSzachownicy;
    }

    public boolean czyJuzNaTymPunkcie(Punkt punktDoPrzesuniecia) {
        return this.punktNaSzachownicy.equals(punktDoPrzesuniecia);
    }

    public Punkt getPunktNaSzachownicy() {
        return punktNaSzachownicy;
    }

    //  public abstract void przesun(Punkt punkt);  //jak przepisujemy metody z interfejsu musimy dopisac ze sa publiczne i abstrakcyjne


}
