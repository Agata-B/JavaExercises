package szachy;

public class Hetman extends Figura {


    public Hetman(Kolor kolor, Punkt punkt){
        super("Hetman", kolor, punkt);    //kolejnosc w konstruktorze tak jak w klasie nadrzędnej
    }

    @Override
    public void przesun(Punkt punkt) {
        System.out.println("Przesuwam hetmana z " + punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

    @Override    //nadpisanie metody z klasy nadrzednej
    public void zbij(Punkt punkt) throws TenSamPunktException {
        super.zbij(punkt);
        System.out.println("Jestem hetmanem.");
    }


}
