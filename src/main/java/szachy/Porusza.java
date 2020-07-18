package szachy;

public interface Porusza {

    //nazwa interfejsu zaweira   ........able

    void przesun(Punkt punkt) throws TenSamPunktException;

    void zbij(Punkt punkt) throws TenSamPunktException;
}
