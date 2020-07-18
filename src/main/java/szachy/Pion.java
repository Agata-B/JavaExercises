package szachy;

public class Pion extends Figura {


    public Pion (Kolor kolor, Punkt punkt){
        super("Pion", kolor, punkt);    //kolejnosc w konstruktorze tak jak w nadrzędnej
    }

    @Override
    public void przesun(Punkt punkt) throws TenSamPunktException {
       if(this.punktNaSzachownicy.equals(punkt)){
           throw new TenSamPunktException("Figura znajduje się na tym punkcie.");
       }
        System.out.println("Przesuwam pion z " + punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }


}
