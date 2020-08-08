package lambda;

import java.util.Optional;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {

        Supplier supplier = () -> "Jan";

        String  name = Optional.<String>ofNullable(null).     //jeśli przekazujemy null trzeba zdefiniowac tryb generyczny
                orElseGet(supplier);                          //w przeciwieństwie do tego orElse utworzy obiekt w pamięci
        System.out.println(name);
    }
}
